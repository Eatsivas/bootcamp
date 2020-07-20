<%-- 
    Document   : test
    Created on : Apr 21, 2020, 11:33:45 AM
    Author     : Vagos
--%>

<%@page import="java.util.Date"%>
<%@page import="models.Customer"%>   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!private int i;%>  <%--class variable --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%-- this is a comment in jsp --%>  
        <%=new Date()%>    <%--jsp expression --%>
        <form name= "form1" action="test2.jsp" method="POST" target="_blank">
            <label for="fname">First name:</label>
            <input type="text" id="fname" name="fname"><br><br>
            <label for="lname">Last name:</label>
            <input type="text" id="lname" name="lname"><br><br>
            <input type="submit" value="Submit" onclick="formSubmit()">
        </form>
        <script>
            function formSubmit() {
                // mia methodo na dei o user oti exei ginei submit px me event listener
            }
        </script>
        <%
            String fname;
            String lname;
            System.out.println("Context Path" + request.getContextPath());
            fname = request.getParameter("fname");  // pairnw to value tou name 
            lname = request.getParameter("lname");
            System.out.println("fname: " + fname);
            System.out.println("lname: " + lname);
            Customer customer = new Customer(fname, lname);
            if (customer.getFirstName() != null || customer.getFirstName() != "") {
                out.print("<h2>" + customer + "</h2>");
                out.print("<br>" + request.getParameter("fname"));
            }
            i = 10;
            out.print("<br>i= " +i);

        %>
    </body>
</html>
