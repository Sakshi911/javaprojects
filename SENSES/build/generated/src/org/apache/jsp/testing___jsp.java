package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testing___jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<title>testing..</title>\n");
      out.write("<script>\n");
      out.write("var count=0;\n");
      out.write("function d()\n");
      out.write("{\n");
      out.write("count++;\n");
      out.write("}\n");
      out.write("function e()\n");
      out.write("{\n");
      out.write("alert(count);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<input type=\"radio\" name=\"radio\" id=\"select\" onclick=\"d()\"/>1\n");
      out.write("<input type=\"radio\" name=\"radio\" id=\"select1\" />2\n");
      out.write("<input type=\"radio\" name=\"radio\" id=\"select2\" />3\n");
      out.write("<input type=\"radio\" name=\"radio\" id=\"select3\" />4\n");
      out.write("<input type=\"radio\" name=\"radio\" id=\"select4\" />5\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"Submit\" onclick=\"e()\"/>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
