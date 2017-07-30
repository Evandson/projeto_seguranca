/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Evandson
 */
@WebServlet(name = "Filtro", urlPatterns = {"/FiltroLogin"})
public class Filtro implements Filter {
     
      public void init(FilterConfig config) throws ServletException {

      }
      public void doFilter(ServletRequest req, ServletResponse res,

            FilterChain chain) throws IOException, ServletException {
            HttpSession session = ((HttpServletRequest)req).getSession();
            
            Usuario email = (Usuario)session.getAttribute("email");
            
            //Verifica se a sessão usuário está funcionando
            if(email==null){
                  session.setAttribute("msg","Você não está logado no sistema!");
                  ((HttpServletResponse)res).sendRedirect("../index.jsp");

            }else{
                    chain.doFilter(req, res);
            }

      }
      public void destroy() {

      }
}


