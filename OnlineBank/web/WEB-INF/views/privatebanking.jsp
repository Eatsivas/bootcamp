<%-- 
    Document   : privatebanking
    Created on : Apr 22, 2020, 3:40:31 PM
    Author     : Vagos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Private Banking - Online Bank</title>
    </head>
    <body>
        <h1>Welcome to your bank!!</h1>
        <h3>Welcome <% out.print(request.getParameter("username"));%></h3>
        <div>
            <% out.print("Login date time was : " + request.getAttribute("login_datetime") +"<br>");
               out.print("User role is: "+ request.getAttribute("user_role")+"<br>");
               out.print("Your credentials you ... have been compromised !!!" + request.getAttribute("ul")+"<br>");
            %>
        </div>
    </body>
</html>

