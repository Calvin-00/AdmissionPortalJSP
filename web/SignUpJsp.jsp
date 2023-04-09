<%-- 
    Document   : SignUpJsp
    Created on : Mar 5, 2023, 7:17:38 AM
    Author     : princecalvinsagatwa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Page</title>
    </head>
    <body>
        <jsp:include page="header.html" />
        <form id="form" action="signupjsp" method="post" class="form" >
        <div class="box">
<!--            <h2 class="logo"><img src="d1.png"></h2>-->
            <h2>SIGN UP</h2>
            <div class="text_field">
               Email: <input id="firstEmail" name="firstEmail" type="text" placeholder="Email" required oninput="validateEmail()"> <br/><br/>
            <span id="emailError" style="color: red;"></span>
            </div> 
            <div class="text_field">
            Password: <input id="firstPassword" name="firstPassword" type="text" placeholder="Password" required oninput="validatePassword()"> <br/><br/>
            <span id="passError" style="color: red;"></span>
            </div> 
            <div class="text_field">
            Confirm Password: <input id="firstPasswordAgain" name="firstPasswordAgain" type="text" placeholder="Re-enter Password" required oninput="validateConfPassword()"> <br/><br/>
            <span id="confpassError" style="color: red;"></span>
            </div> 
            <Button class="btn">Sign up</Button>
            <!--<input class="btn" type="submit" value="Sign up">-->
            <br> <h3>Already have an account? <a href="LoginJsp.jsp" class="register-link">Log In</a></h3>
        </div>
    </form>
    </body>
</html>
