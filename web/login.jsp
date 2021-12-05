<%-- 
    Document   : login
    Created on : Dec 2, 2021, 9:20:15 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <form action="login" method="POST" class="form-signin">
            <span class="reauth-email"> </span>
            <input type="hidden" value="${check}" id="checkacc"/>
            <input name="username" class="form-control" type="text" id="inputEmail" required="" placeholder="Tên tài khoản" autofocus=""> </br>
            <input name="password" class="form-control" type="password" id="inputPassword" required="" placeholder="Mật khẩu"> </br>
            <button class="btn btn-primary btn-block btn-lg btn-signin" type="submit">Đăng nhập</button>
        </form>
    </body>
</html>
