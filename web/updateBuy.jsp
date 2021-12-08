<%-- 
    Document   : updateBuy
    Created on : Dec 8, 2021, 10:14:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Bill Detail</title>
    </head>
    <body>
        <form action="edit" method="POST">
            <h1 >Sửa thông tin thiết bị</h1>
            <br>
            Thuộc mã hóa đơn
            <br>
            <select name="bill_id">
                <c:forEach items="${bill}" var="bb">
                    <option 
                        <c:if test="${machinebuy.billbuy_id eq bb.id}">
                            selected="selected" </c:if> 
                        value="${bb.id}">${bb.id}</option>
                </c:forEach>
            </select>
            <br>
            Mã Seri
            <br>
            <input type="text" name="seri" value="${machinebuy.seri}"/>
            <br>
            Tên thiết bị
            <br>
            <input type="text" name="name" value="${machinebuy.name}"/>
            <br>
            Mã phiên bản
            <br>
            <input type="text" name="model" value="${machinebuy.model}"/>
            <br>
            Giá mua
            <br>
            <input type="number"  name="price" value="${machinebuy.price}"/>
            <br>
            Độ mới
            <br>
            <input type="number" min="1" max="100" name="newness" value="${machinebuy.newness}"/>
            <br>
            Hạn khấu hao(năm)
            <br>
            <input type="number" name="depreciation" value="${machinebuy.depreciation}"/>
            <br>
            <input type="submit" value="Lưu thay đổi"/>
            <a href="listbuy" class="btn btn-danger">Hủy</a>
        </form>
    </body>
</html>
