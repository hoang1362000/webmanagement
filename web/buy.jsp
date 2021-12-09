<%-- 
    Document   : buy
    Created on : Dec 4, 2021, 1:51:01 PM
    Author     : Admin
--%>

<%@page import="model.machineBuy"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách thiết bị nhập</title>
        <%
            ArrayList<machineBuy> machine = (ArrayList<machineBuy>) request.getAttribute("machine");
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
    <center><h2>Danh sách thiết bị nhập</h2>
        <a class="btn btn-outline-success" href="insertbillbuy" style="width: 180px;">Thêm hóa đơn</a>
        <table class="table">
            <thead>
                <tr style="background-color: #0f12;">
                    <td><h4><b>Số seri</b></h4></td>
                    <td><h4><b>Tên thiết bị</b></h4></td>
                    <td><h4><b>Phiên bản</b></h4></td>
                    <td><h4><b>Giá tiền</b></h4></td>
                    <td><h4><b>Ngày nhập</b></h4></td>
                    <td><h4><b>Nhà cung cấp</b></h4></td>
                    <td></td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <% for (machineBuy m : machine) {%>
                <tr>
                    <td><%=m.getSeri()%></td>
                    <td><%=m.getName()%></td>
                    <td><%=m.getModel()%></td>
                    <td><%=m.getPrice()%></td>
                    <td><%=m.getBb().getDateinput()%></td>
                    <td><%=m.getBb().getProv().getName()%></td>
                    <td>
                        <input class="btn btn-info" type="button" value="Edit" 
                               onclick="window.location.href = 'edit?seri=<%=m.getSeri()%>'" />
                    </td>
                    <td>
                        <input class="btn btn-danger" type="button" value="Delete" 
                               onclick="window.location.href = 'delete?seri=<%=m.getSeri()%>'" />
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </center>
    <div class="card">
        <div class="card-header">
        </div>
        <div class="card-body">
            <blockquote class="blockquote mb-0">
                <h4>CÔNG TY CP MAY ĐÔNG MỸ HOẠT ĐỘNG CHÍNH TRONG LĨNH VỰC:</h4>
                <p> ✪ Sản xuất khẩu trang vải 3 lớp phòng nhiễm vi khuẩn, virus tại cộng đồng.
                    <br>
                    ✪ Sản xuất và xuất khẩu chủ yếu sang thị trường Nhật Bản (90%) và một số thị trường khác Quần áo thời trang, quần áo bảo hộ lao động,..
                    <br>
                    Với đội ngũ nhân công tay nghề cao, hệ thống máy móc hiện đại, tiên tiến, công ty chúng tôi cam kết đáp ứng được những yêu cầu khắt khe của Quý khách hàng và những đơn hàng số lượng lớn trong thời gian ngắn.
                    <br>
                    Xin chân thành cảm ơn! </p>
            </blockquote>
        </div>
    </div>
</body>
</html>
