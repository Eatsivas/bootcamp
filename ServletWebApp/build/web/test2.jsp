<%-- 
    Document   : test2
    Created on : Apr 21, 2020, 1:41:13 PM
    Author     : Vagos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
    <% 
        out.print("<h2>First Name: "+request.getParameter("fname")+"</h2>");
    
  
    
    %>
</html>
