package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<h1>\n");
      out.write("ABOUT US</h1><br><br><br>\n");
      out.write("<p>\n");
      out.write("We at senses believe in the fact that everyone has the right to live their life in perfect combination of calmness, happiness and mental peace.Senses is names so as\n");
      out.write("we all are actually in mental agony and have actually been out of senses.It is a project aimed at providing every means to the generations to discuss their problems with us either anoynomously or publicly \n");
      out.write("with the experts registered with us.<br>\n");
      out.write("We at senses believe inigniting the real potential of the people to get out so that they can their desires not only thought but achieved too !!\n");
      out.write("There are times when teenagers are not able to discuss their problems even with their parents so this is to improve all thoses conditions. <br>\n");
      out.write("It is also believed that reading happy texts throughout may lead to mental peace and thus we have sections regarding mental peace etc too involved within sites only.\n");
      out.write("<br>To release down the mental stress games have been involved and to guage your basic necessities and views towards life tests have also been included.\n");
      out.write("<br></p>\n");
      out.write("<h2>Enjoy your experience and thanks for visiting!!</h2>");
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
