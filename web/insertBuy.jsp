<%-- 
    Document   : insertbuy
    Created on : Dec 7, 2021, 8:00:51 PM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/insertbuy.css" type="text/css" rel="stylesheet">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <form class="insert form" action="insertbuy" method="POST">
            <h2>Nhập thông tin thiết bị</h2>
            <p class="text">Thuộc mã hóa đơn</p>
            <select name="bill_id_new">
                <option value="${lastbill}">${lastbill}</option>
                <c:forEach items="${bill}" var="bb">
                    <option  value="${bb.id}">${bb.id}</option>
                </c:forEach>
            </select>
            <p class="text">Mã Seri</p>
            <input type="text" name="seri_product"/>
            <p class="text">Tên thiết bị</p>
            <input type="text" name="name_machine"/>
            <p class="text">Mã phiên bản</p>
            <input type="text" name="model_machine"/>
            <p class="text">Giá mua</p>
            <input type="number" name="price_machine"/>
            <p class="text">Độ mới</p>
            <input type="number" min="1" max="100" name="newness"/>
            <p class="text">Hạn khấu hao(năm)</p>
            <input type="number" name="depreciation" value="${machinebuy.depreciation}"/>
            <div style="margin-bottom: 10px">
                <button class="btn btn-outline-success" type="submit"/>Thêm và nhập máy mới</button>
                <a href="listbuy" class="btn btn-danger">Kết thúc</a>
        </form>
    </center>
    </body>
</html>
