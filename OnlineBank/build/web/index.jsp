<%-- 
    Document   : index
    Created on : Apr 22, 2020, 2:54:23 PM
    Author     : Vagos
--%>

<%@page import="models.UserLogin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Bank</title>
    </head>
    <body>
        <h1>Welcome to Online Bank!</h1>
        <form action="index.jsp" method="POST">
            <p>Username : <input type="text" name="username"></p> 
            <p>Password : <input type="password" name="password"></p> 
            <p><button type="submit">Login</button>
        </form>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username != null && password != null && request.getMethod().equals("POST")) { //vazontas elegxo gia methodo post apotrepw na dwsei kapoios ston browser me ?username kai password (opote tha paei me GET) 
                //thelw dld na mpei sthn login mono me to koumpi login dld na ginei method POST
                //!!an pathsw submit me adeia forma sthn ousia den einai null alla exei keno opote paei sto unathorized
                UserLogin ul = new UserLogin(username, password);
                request.setAttribute("user", ul);
                RequestDispatcher rd = request.getRequestDispatcher("login");
                rd.forward(request, response);
            }

        %>
    </body>
</html>
