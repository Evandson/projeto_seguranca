/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Dao.AppSegDao;
import Dao.JdbcAppSegDao;
import Model.Usuario;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utils.DaoFactory;
import utils.Erro;

/**
 *
 * @author Evandson
 */
public class Autentication implements Logica {

    @Override
    public void executa(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Erro erros = new Erro();

        String access = request.getParameter("access");

        if (access.equals("Login")) {

            Usuario usuario = new Usuario();
            AppSegDao user = DaoFactory.createAppSegDao();

            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            usuario = user.getId(email, senha);

            user.userLogin(usuario);

            if (JdbcAppSegDao.sessao == true) {
                HttpSession session = request.getSession();

                session.setAttribute("email", usuario);

                response.sendRedirect("user/home.jsp");

            } else if (JdbcAppSegDao.sessao == false) {
                erros.limpar();
                erros.add("Usuário e/ou Senha não existe(m)!");
                request.setAttribute("mensagem", erros);

                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        }

        if (access.equals("Logout")) {

            request.getSession().invalidate();
            response.sendRedirect("index.jsp");

        }
    }
}
