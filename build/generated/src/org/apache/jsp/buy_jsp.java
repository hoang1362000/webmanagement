package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.machineBuy;
import java.util.ArrayList;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Danh sách thiết bị nhập</title>\n");
      out.write("        ");

            ArrayList<machineBuy> machine = (ArrayList<machineBuy>)request.getAttribute("machine");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><a href=\"listbuy\">Trang chủ</a></h1>\n");
      out.write("        <h2>\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <p class=\"ml-auto navbar-text actions\">Xin chào, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("                    <a href=\"logout\" style=\"color: blue; margin-left: 10px\">Đăng xuất</a></p>\n");
      out.write("            </c:if>\n");
      out.write("        </h2>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div style=\"text-align:left\" border=\"2px\" class=\"col-lg-10\">\n");
      out.write("                    <h2 class=\"divider-style\"><span>Danh sách thiết bị nhập</span></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <a href=\"insertbillbuy\" role=\"button\" class=\"btn btn-primary\" style=\"width: 180px;\">Thêm hóa đơn</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-10\">\n");
      out.write("                <table class=\"table table-bordered\" >\n");
      out.write("                    <thead>\n");
      out.write("                        <tr style=\"background-color: #9ef2ee;\">\n");
      out.write("                            <td><h4 style=\"font-family:Tim New Rone;\"><b>Số seri</b></h4></td>\n");
      out.write("                            <td><h4 style=\"font-family:Tim New Rone;\"><b>Tên thiết bị</b></h4></td>\n");
      out.write("                            <td><h4 style=\"font-family:Tim New Rone;\"><b>Phiên bản</b></h4></td>\n");
      out.write("                            <td><h4 style=\"font-family:Tim New Rone;\"><b>Giá tiền</b></h4></td>\n");
      out.write("                            <td><h4 style=\"font-family:Tim New Rone;\"><b>Ngày nhập</b></h4></td>\n");
      out.write("                            <td><h4 style=\"font-family:Tim New Rone;\"><b>Nhà cung cấp</b></h4></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
 for(machineBuy m : machine){
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(m.getSeri());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(m.getName());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(m.getModel());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(m.getPrice());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div class=\"col-md-4 footer-about\">\n");
      out.write("                    <h4>CÔNG TY CP MAY ĐÔNG MỸ HOẠT ĐỘNG CHÍNH TRONG LĨNH VỰC:</h4>\n");
      out.write("                    <p> ✪ Sản xuất khẩu trang vải 3 lớp phòng nhiễm vi khuẩn, virus tại cộng đồng.\n");
      out.write("                        <br>\n");
      out.write("                        ✪ Sản xuất và xuất khẩu chủ yếu sang thị trường Nhật Bản (90%) và một số thị trường khác Quần áo thời trang, quần áo bảo hộ lao động,..\n");
      out.write("                        <br>\n");
      out.write("                        Với đội ngũ nhân công tay nghề cao, hệ thống máy móc hiện đại, tiên tiến, công ty chúng tôi cam kết đáp ứng được những yêu cầu khắt khe của Quý khách hàng và những đơn hàng số lượng lớn trong thời gian ngắn.\n");
      out.write("                        <br>\n");
      out.write("                        Xin chân thành cảm ơn! </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
