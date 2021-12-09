<%-- 
    Document   : insertbillbuy
    Created on : Dec 6, 2021, 9:16:46 AM
    Author     : Admin
--%>

<%@page import="model.Providers"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/insertbillbuy.css" type="text/css" rel="stylesheet">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm đơn hàng</title>
        <%
            ArrayList<Providers> provider = (ArrayList<Providers>) request.getAttribute("provider");
        %>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="listbuy">Trang chủ</a>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">                                                          
                </ul>
                <div class="form-inline my-2 my-lg-0">
                    <c:if test="${sessionScope.acc != null}">
                        <p class="navbar-brand">Xin chào, ${sessionScope.acc.username} 
                            <a href="logout" style="color: blue; margin-left: 10px">Đăng xuất</a></p>
                    </c:if>
                </div>
            </div>
        </nav>
    <center>
        <form class="insert form" action="insertbillbuy" method="POST">
            <h2>Thêm hóa đơn thiết bị nhập</h2>
            <p class="text">Mã hóa đơn</p>
            <input type="text" name="id_bill" value=""/>
            <p class="text">Ngày nhập hàng</p>
            <input type="date" name="date_input" max="${datemax}">
            <p class="text">Nhà cung cấp</p>
            <select name="provider_id">
                <% for (Providers p : provider) {%>
                <option value="<%=p.getId()%>"><%=p.getName()%></option>
                <%}%>
            </select>
            <br>
            <br>
            <button style="margin-bottom: 20px" class="btn btn-outline-success" type="submit"/>Thêm hóa đơn</button>
        </form>
    </center>
</body>
</html>
