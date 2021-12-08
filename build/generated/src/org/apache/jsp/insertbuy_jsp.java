package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.BillBuy;
import java.util.ArrayList;

public final class insertbuy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");

            ArrayList<BillBuy> bbd = (ArrayList<BillBuy>) request.getAttribute("bbd");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><a href=\"listbuy\">Trang Chủ</a></h1>\n");
      out.write("        <form action=\"insertbuy\" method=\"POST\">\n");
      out.write("                        <h3 >Nhập thông tin thiết bị</h3>\n");
      out.write("                        <br>\n");
      out.write("                        Thuộc mã hóa đơn\n");
      out.write("                        <br>\n");
      out.write("                        <select name=\"bill_id_new\">\n");
      out.write("                            <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastbill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastbill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"bb\">\n");
      out.write("                                <option  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bb.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bb.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                            </c:forEach>\n");
      out.write("                        </select>\n");
      out.write("                        <br>\n");
      out.write("                        Mã Seri\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Mã số khác nhau được in trên mỗi thiết bị\" name=\"seri_product\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Tên thiết bị\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" name=\"name_machine\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Mã phiên bản\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Đời máy, dòng máy, mẫu thiết bị\" name=\"model_machine\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Giá mua\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"number\"  name=\"price_machine\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Độ mới\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"number\" min=\"1\" max=\"100\" placeholder=\"Từ 1 đến 100\" name=\"newness\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Hạn khấu hao(năm)\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"number\" name=\"depreciation\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${machinebuy.depreciation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        <br>\n");
      out.write("                        <div style=\"margin-bottom: 10px\">\n");
      out.write("                            <input  type=\"submit\" value=\"Thêm và nhập máy mới\"/>\n");
      out.write("                            <a href=\"listbuy\" class=\"btn btn-danger\">Kết thúc</a>\n");
      out.write("                            </form>\n");
      out.write("                            </body>\n");
      out.write("                            </html>\n");
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
