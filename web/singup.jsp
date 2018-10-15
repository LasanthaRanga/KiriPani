<%-- 
    Document   : singup
    Created on : Oct 15, 2018, 12:52:03 PM
    Author     : Ranga Rathnayake
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Customer</h1>
        <!--<h3>${error}</h3>-->

        <form action="Singup" method="POST">
            <pre>
                <input type="text" name="fullname" placeholder="Full Name" />
                <input type="text" name="addressLine1" placeholder="adl 1" />
                <input type="text" name="addressLine2" placeholder="adl 2" />
                <input type="text" name="city" placeholder="City" />
                <input type="text" name="discription" placeholder="Discription" />
                <input type="text" name="email" placeholder="Email" />
                <input type="password" name="pword" placeholder="Password" />
                <input type="text" name="nic" placeholder="nic" />
                <input type="radio" name="gender" placeholder="gender" value="1" />
                <input type="radio" name="gender" placeholder="gender" value="0" />
                <input type="submit" name="submi" placeholder="gender" />
            </pre>


        </form>

    </body>
</html>
