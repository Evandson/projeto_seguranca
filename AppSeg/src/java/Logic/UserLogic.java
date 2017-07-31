/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Dao.AppSegDao;
import Dao.JdbcAppSegDao;
import Model.GeraHash;
import Model.Usuario;
import java.util.List;
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
public class UserLogic implements Logica {

    @Override
    public void executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        Erro erros = new Erro();

        String access = request.getParameter("access");

        if (access.equals("cadUser")) {

            Usuario usuario = new Usuario();
            AppSegDao us = DaoFactory.createAppSegDao();
            HttpSession session = request.getSession();

            usuario.setNome(request.getParameter("nome"));
            usuario.setEmail(request.getParameter("email"));
            usuario.setSenha(request.getParameter("senha"));

            us.verifyUser(usuario);

            if (JdbcAppSegDao.sessao == true) {
                //usuario = us.lancarId(usuario);

                session.setAttribute("email", usuario);

                response.sendRedirect("index.jsp");

            } else if (JdbcAppSegDao.sessao == false) {
                erros.limpar();
                erros.add("Email já cadastrado!");
                request.setAttribute("mensagem", erros);

                RequestDispatcher rd = request.getRequestDispatcher("cadastro.jsp");
                rd.forward(request, response);
            }
        }
        
        if (access.equals("cadHash")){
            
            GeraHash geraHash = new GeraHash();
            AppSegDao gh = DaoFactory.createAppSegDao();

            geraHash.setCodHash(request.getParameter("codHash"));
            
            gh.cadHash(geraHash);
             
            List<GeraHash> hashes = gh.getHashes();
            
            HttpSession session = request.getSession();
            session.setAttribute("hashes", hashes);
 
            response.sendRedirect("user/hashGenerate.jsp");
            
            //RequestDispatcher rd = request.getRequestDispatcher("user/hashGenerate.jsp");
            //rd.forward(request, response);
        }
    }
}
