<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang='en'>
    <head>
        <meta charset ='UTF-8'/>
        <title>Login</title>
        <link rel='stylesheet' href='login_style.css'/>
    </head>
    <body>
        <header cssClass='login-form-header'>
        </header>
        <form modelAttribute = "userFromServer" action='/home.jsp' method='post' cssClass='login-form'>
            <div class='login-page'>
                <div class = "form">
                    <form class = "register-form">
                        <input type ="text" placeholder = "Login"/>
                        <input type ="password" placeholder="Password"/>
                        <input type ="password" placeholder="Retype password">
                        <input type ="text" placeholder="E-mail">
                        <button>Sign Up</button>
                        <p class="msg">Already registered?<a href="#">Sign In</a></p>
                    </form>
                    <from class= "login-form">
                        <input type="text" placeholder="Login/E-mail"/>
                        <input type="password" placeholder="Password"/>
                        <button>Sign In</button>
                        <p class="msg">Not registered yet?<a href="#">Sign Up</a></p>

                <div>
            </div>


        </form>
        <script> $('.msg a').click(function(){
$('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});</script>
    </body>
</html>
