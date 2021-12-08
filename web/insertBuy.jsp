<%-- 
    Document   : insertbuy
    Created on : Dec 7, 2021, 8:00:51 PM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a href="listbuy">Trang Chủ</a></h1>
        <form action="insertbuy" method="POST">
            <h3 >Nhập thông tin thiết bị</h3>
            <br>
            Thuộc mã hóa đơn
            <br>
            <select name="">
                <option value="${lastbill}">${lastbill}</option>
                <c:forEach items="${bill}" var="bb">
                    <option  value="${bb.id}">${bb.id}</option>
                </c:forEach>
            </select>
            <br>
            Mã Seri
            <br>
            <input type="text" name=""/>
            <br>
            Tên thiết bị
            <br>
            <input type="text" name=""/>
            <br>
            Mã phiên bản
            <br>
            <input type="text" name=""/>
            <br>
            Giá mua
            <br>
            <input type="number" name=""/>
            <br>
            Độ mới
            <br>
            <input type="number" min="1" max="100" name=""/>
            <br>
            Hạn khấu hao(năm)
            <br>
            <input type="number" name="" value="${machinebuy.depreciation}"/>
            <br>
            <div style="margin-bottom: 10px">
                <input  type="submit" value="Thêm và nhập máy mới"/>
                <a href="listbuy" class="btn btn-danger">Kết thúc</a>
        </form>
    </body>
</html>
