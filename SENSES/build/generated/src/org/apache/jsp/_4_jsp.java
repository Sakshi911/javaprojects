package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html><head>\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("<!-- Original:  Josh Birk  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Begin\n");
      out.write("gamelength=30;\n");
      out.write("timerID=null\n");
      out.write("var playing=false;\n");
      out.write("var numholes=6*10;\n");
      out.write("var currentpos=-1;\n");
      out.write("function clrholes() {\n");
      out.write("for(var k=0;k<document.dmz.elements.length;k++)\n");
      out.write("document.dmz.elements[k].checked=false;\n");
      out.write("}\n");
      out.write("function stoptimer() {\n");
      out.write("if(playing)\n");
      out.write("clearTimeout(timerID);\n");
      out.write("}\n");
      out.write("function showtime(remtime) {\n");
      out.write("document.cpanel.timeleft.value=remtime;\n");
      out.write("if(playing) {\n");
      out.write("if(remtime==0) {\n");
      out.write("stopgame();\n");
      out.write("return;\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("temp=remtime-1;\n");
      out.write("timerID=setTimeout(\"showtime(temp)\",1000);\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("function stopgame() {\n");
      out.write("stoptimer();\n");
      out.write("playing=false;\n");
      out.write("document.cpanel.timeleft.value=0;\n");
      out.write("clrholes();\n");
      out.write("display(\"Game Over\");\n");
      out.write("alert('Game Over.\\nYour score is:  '+totalhits);\n");
      out.write("}\n");
      out.write("function play() {\n");
      out.write("stoptimer();\n");
      out.write("if(playing) {\n");
      out.write("stopgame();\n");
      out.write("return;\n");
      out.write("}\n");
      out.write("playing=true;\n");
      out.write("clrholes();\n");
      out.write("totalhits=0;\n");
      out.write("document.cpanel.score.value=totalhits;\n");
      out.write("display(\"Playing\");\n");
      out.write("launch();\n");
      out.write("showtime(gamelength);\n");
      out.write("}\n");
      out.write("function display(msg) {\n");
      out.write("document.cpanel.state.value=msg;\n");
      out.write("}\n");
      out.write("function launch() {\n");
      out.write("var launched=false;\n");
      out.write("while(!launched) {\n");
      out.write("mynum=random();\n");
      out.write("if(mynum!=currentpos) {\n");
      out.write("document.dmz.elements[mynum].checked=true;\n");
      out.write("currentpos=mynum;\n");
      out.write("launched=true;\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function hithead(id) {\n");
      out.write("if(playing==false) {\n");
      out.write("clrholes();\n");
      out.write("display(\"Push Start to Play\");\n");
      out.write("return;\n");
      out.write("}\n");
      out.write("if(currentpos!=id) {\n");
      out.write("totalhits+=-1;\n");
      out.write("document.cpanel.score.value=totalhits;\n");
      out.write("document.dmz.elements[id].checked=false;\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("totalhits+=1;\n");
      out.write("document.cpanel.score.value=totalhits;\n");
      out.write("launch();\n");
      out.write("document.dmz.elements[id].checked=false;\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function random() {\n");
      out.write("return(Math.floor(Math.random()*100%numholes));\n");
      out.write("}\n");
      out.write("// End -->\n");
      out.write("</script></head>\n");
      out.write("<body background='mag.jpg'>\n");
      out.write("<center><h2>Hit-the-Dot</h2></center><br><br>\n");
      out.write("<center>Test your skill.  How many boxes can you check in 30 seconds?</center>\n");
      out.write("<form name=\"cpanel\">\n");
      out.write("<center>\n");
      out.write("<table cellspacing=3>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"button\" name=\"startstop\" value=\" Start Game | Stop Game \" onClick=\"play()\"></td>\n");
      out.write("<td><pre>    </pre></td>\n");
      out.write("<td align=right>Time:</td>\n");
      out.write("<td><input type=\"text\" name=\"timeleft\" size=\"4\" onFocus=\"this.blur()\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"state\" size=\"20\" value=\"Push Start to Play\" onFocus=\"this.blur()\"></td>\n");
      out.write("<td><pre>    </pre></td>\n");
      out.write("<td align=right>Score:</td>\n");
      out.write("<td><input type=\"text\" name=\"score\" size=\"4\" onFocus=\"this.blur()\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</form>\n");
      out.write("<form name=\"dmz\">\n");
      out.write("<center>\n");
      out.write("<table cellspacing=3>\n");
      out.write("<tr>\n");
      out.write("<td colspan=10><hr size=1></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(0)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(1)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(2)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(3)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(4)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(5)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(6)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(7)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(8)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(9)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(10)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(11)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(12)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(13)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(14)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(15)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(16)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(17)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(18)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(19)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(20)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(21)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(22)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(23)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(24)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(25)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(26)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(27)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(28)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(29)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(30)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(31)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(32)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(33)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(34)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(35)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(36)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(37)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(38)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(39)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(40)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(41)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(42)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(43)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(44)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(45)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(46)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(47)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(48)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(49)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(50)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(51)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(52)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(53)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(54)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(55)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(56)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(57)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(58)\"></td>\n");
      out.write("<td align=\"center\" valign=\"center\"><input type=\"radio\" onClick=\"hithead(59)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td colspan=10><hr size=1></td>\n");
      out.write("</tr></table></center></form>\n");
      out.write("\n");
      out.write("<center><table cellspacing=3><tr><td><code>\n");
      out.write("<p><strong>Instructions:</strong>\n");
      out.write("<ol><li>Click on the radio buttons as<BR>\n");
      out.write("they are selected randomly by the computer.<BR>\n");
      out.write("<li>1 point per hit, minus 1 point per miss.<BR>\n");
      out.write("</ol></td></tr></table></center>\n");
      out.write("</body></html>");
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
