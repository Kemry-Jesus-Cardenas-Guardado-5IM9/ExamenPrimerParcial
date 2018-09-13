/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConv extends HttpServlet {
    double cantidad;
    String divi;
    double tota;
    
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta){
        cantidad=Integer.parseInt(peticion.getParameter("cantidad"));
        divi=peticion.getParameter("divisa");
        switch(divi)
        {
            case "dolares":
                tota=cantidad/20;
                break;
            case "yenes":
                tota=cantidad*20; 
        }
        try {
            PrintWriter out=new PrintWriter(respuesta.getOutputStream());
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Conversion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Conversion = "+tota+"</center></h1>");
            out.println("</body>");
            out.println("</html>");
            
        } 
        catch (Exception e) {
            
        }
                
        
        
        
    }
       


    }

     


