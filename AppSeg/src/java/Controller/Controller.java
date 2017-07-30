/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Logic.Logica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Evandson
 */
@WebServlet(name = "controller", urlPatterns = {"/controller"})
public class Controller extends HttpServlet{
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
     String parametro = request.getParameter("action");
     String nomeDaClasse = "Logic." + parametro;
     
     try{
         Class classe = Class.forName(nomeDaClasse);
         Logica logica = (Logica) classe.newInstance();
         logica.executa(request, response);
     } catch (Exception e){
         throw new ServletException(
                 "A lógica de negócios causou uma exceção" ,e);
     }
        
    }
    
}
