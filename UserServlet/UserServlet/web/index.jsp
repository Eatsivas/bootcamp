<%-- 
    Document   : index
    Created on : Apr 24, 2020, 2:06:49 PM
    Author     : Vagos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
    </head>
    <body>
        <h1>User Details</h1>
      <%
        if(session.getAttribute("user") !=  null)
         out.print(((models.User)(session.getAttribute("user"))));  
      
      %>  
        
     
    </body>
</html>
