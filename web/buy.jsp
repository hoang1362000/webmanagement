<%-- 
    Document   : buy
    Created on : Dec 4, 2021, 1:51:01 PM
    Author     : Admin
--%>

<%@page import="model.machineBuy"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <h1><a href="listbuy">Trang chủ</a></h1>
        <h2>
            <c:if test="${sessionScope.acc != null}">
                <p>Xin chào, ${sessionScope.acc.username} 
                    <a href="logout" style="color: blue; margin-left: 10px">Đăng xuất</a></p>
            </c:if>
        </h2>
        <h2><span>Danh sách thiết bị nhập</span></h2>
        <a href="insertbillbuy" style="width: 180px;">Thêm hóa đơn</a>
        <table border ="1px" >
            <thead>
                <tr style="background-color: #0f12;">
                    <td><h4 style="font-family:Tim New Rone;"><b>Số seri</b></h4></td>
                    <td><h4 style="font-family:Tim New Rone;"><b>Tên thiết bị</b></h4></td>
                    <td><h4 style="font-family:Tim New Rone;"><b>Phiên bản</b></h4></td>
                    <td><h4 style="font-family:Tim New Rone;"><b>Giá tiền</b></h4></td>
                    <td><h4 style="font-family:Tim New Rone;"><b>Ngày nhập</b></h4></td>
                    <td><h4 style="font-family:Tim New Rone;"><b>Nhà cung cấp</b></h4></td>
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
                        <input type="button" value="Edit" 
                               onclick="window.location.href = 'edit?seri=<%=m.getSeri()%>'" />
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>
        <footer>
            <h4>CÔNG TY CP MAY ĐÔNG MỸ HOẠT ĐỘNG CHÍNH TRONG LĨNH VỰC:</h4>
            <p> ✪ Sản xuất khẩu trang vải 3 lớp phòng nhiễm vi khuẩn, virus tại cộng đồng.
                <br>
                ✪ Sản xuất và xuất khẩu chủ yếu sang thị trường Nhật Bản (90%) và một số thị trường khác Quần áo thời trang, quần áo bảo hộ lao động,..
                <br>
                Với đội ngũ nhân công tay nghề cao, hệ thống máy móc hiện đại, tiên tiến, công ty chúng tôi cam kết đáp ứng được những yêu cầu khắt khe của Quý khách hàng và những đơn hàng số lượng lớn trong thời gian ngắn.
                <br>
                Xin chân thành cảm ơn! </p>
        </footer>
    </body>
</html>
