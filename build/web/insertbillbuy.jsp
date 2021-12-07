<%-- 
    Document   : insertbillbuy
    Created on : Dec 6, 2021, 9:16:46 AM
    Author     : Admin
--%>

<%@page import="model.Providers"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm đơn hàng</title>
        <%
            ArrayList<Providers> provider = (ArrayList<Providers>)request.getAttribute("provider");
        %>
    </head>
    <body>
        <h1><a href="listbuy">Trang Chủ</a></h1>
        <form action="insertbillbuy" method="POST">
                        <h3>Thêm hóa đơn thiết bị nhập</h3>
                        <br>
                        Mã hóa đơn
                        <br>
                        <input type="text" name="id_bill" value=""/>
                        <br>
                        Ngày nhập hàng
                        <br>
                        <input type="date" name="date_input" max="${datemax}">
                        <br>
                        Nhà cung cấp
                        <br>
                        <select name="provider_id">
                            <% for(Providers p : provider) {%>
                            <option value="<%=p.getId()%>"><%=p.getName()%></option>
                            <%}%>
                        </select>
                        <br>
                            <input type="submit" value="Thêm hóa đơn"/>
        </form>
    </body>
</html>
