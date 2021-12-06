package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertbillbuy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Thêm đơn hàng</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><a href=\"listbuy\"</h1>\n");
      out.write("        <form action=\"insertbillbuy\" method=\"POST\">\n");
      out.write("                        <h3>Thêm hóa đơn thiết bị nhập</h3>\n");
      out.write("                        <br>\n");
      out.write("                        Mã hóa đơn\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" name=\"id_bill\" value=\"\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Ngày nhập hàng\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"date\" name=\"date_input\" max=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datemax}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <br>\n");
      out.write("                        Số tiền chưa trả\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"number\" name=\"amount_owed\" value=\"\"/>\n");
      out.write("                        <br>\n");
      out.write("                        Nhà cung cấp\n");
      out.write("                        <br>\n");
      out.write("                        <select name=\"provider_id\">\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${provider}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"pv\">\n");
      out.write("                                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pv.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pv.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                </option>\n");
      out.write("                            </c:forEach>\n");
      out.write("                        </select>\n");
      out.write("                        <p style=\"opacity: 70%\">Nếu chưa có nhà cung cấp tương ứng, vào mục nhà cung cấp để thêm</p>\n");
      out.write("                            <input type=\"submit\" value=\"Thêm hóa đơn\"/>\n");
      out.write("        </form>\n");
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
