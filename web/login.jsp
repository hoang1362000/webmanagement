<%-- 
    Document   : login
    Created on : Dec 2, 2021, 9:20:15 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="css/login.css" type="text/css" rel="stylesheet">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            window.onload = function () {
                if (document.getElementById("checkacc").value === "false")
                    alert("Tài khoản hoặc mật khẩu sai")
            }
        </script>
    </head>
    <body>
        <!--        <form action="login" method="POST">
                    <input type="hidden" value="${check}" id="checkacc"/>
                    <input name="username" type="text" id="inputEmail" required="" placeholder="Tên tài khoản" autofocus=""> </br>
                    <input name="password" type="password" id="inputPassword" required="" placeholder="Mật khẩu"> </br>
                    <button type="submit">Đăng nhập</button>
                </form>-->
        <form action="login" method="POST">
            <div class="imgcontainer">
                <img src="img/login.png" alt="Avatar" class="avatar">
            </div>
            <div class="container">
                <label for="username"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="username" required><br>
                <label for="password"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="password" required><br>
                <button type="submit">Login</button>
            </div>
        </form>
    </body>
</html>
