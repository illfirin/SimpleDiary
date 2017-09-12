<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang='en'>
    <head>
        <meta charset ='UTF-8'/>
        <title>Login</title>
        <link rel='stylesheet' href='style.css'/>
    </head>
    <body>
        <header cssClass='login-form-header'>
        </header>
        <form modelAttribute = "userFromServer" action='/home.jsp' method='post' cssClass='login-form'>
            <div class='form-row'>
                <label for='login'>Login</label>
                <input id='login' name='login' type='text' path="login"/>
                <label for='pass'>Password</label>
                <input id='pass' name='pass' type='password' path ="password">
                <button>Submit</button>
            </div>

        </form>
    </body>
</html>
