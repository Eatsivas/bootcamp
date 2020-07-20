/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vagos
 */
public class Test extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");   //dhmiourgeitai dynamika selida html den yparxei stis selides mou stis web pages 
        try (PrintWriter out = response.getWriter()) {  //try with resources ..dld des mesw response.getWriter an mporv na grapsw kai apothikeyse to shn metablhth out
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Test</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>First Name: "+request.getParameter("fname")+"</h2>");
            out.println("<h2>Last Name: "+request.getParameter("lname")+"</h2>");
            out.println("<h1>Servlet Test at " + request.getContextPath() + "</h1>");
            out.println("Date today: "+ new Date());
            out.println("</body>");
            out.println("</html>");
        }
    }
    
}
