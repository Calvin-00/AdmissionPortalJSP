<%-- 
    Document   : LoginJsp
    Created on : Mar 5, 2023, 7:43:02 AM
    Author     : princecalvinsagatwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In Page</title>
    </head>
    <body>
        <jsp:include page="header.html" />
        <form id="form" action="LoginManager" method="post">
            <h1>Log In</h1>
            <div class="input-control">
                <label for="username">Email</label>
                <input id="usernameLogins" name="email" type="text" required oninput="validateEmailLogIn()">
                <span id="emailError" style="color: red;"></span>
                <div class="error"></div>
            </div>
            
            <div class="input-control">
                <label for="password">Password</label>
                <input id="passwordLogins" name="password" type="password" required oninput="validatePasswordLogIn()">
                <span id="passError" style="color: red;"></span>
                <div class="error"></div>
            </div>
            
            <button type="submit">Log In</button>
            <div class="login-register">
                        <h3>Don't have an account? <a href="SignUpJsp.jsp" class="register-link">Register</a></h3>
                    </div>
            </form> 
    </body>
</html>
