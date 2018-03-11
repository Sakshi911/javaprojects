/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/three"})
public class three extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    {
        try {
      PrintWriter out=response.getWriter();
                response.setContentType("text/html");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head><a href='games'>HOME</a>\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("<!-- Original:  Andrew Gacek (andrew@dgi.net) -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Begin\n");
      out.write("function fillall() {\n");
      out.write("for (var i = 0; i < 24; i++) {\n");
      out.write("document.lightsform.elements[i].checked=1;\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("function clearall() {\n");
      out.write("for (var i = 0; i < 24; i++) {\n");
      out.write("document.lightsform.elements[i].checked=0;\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("function level1() {\n");
      out.write("clearall();\n");
      out.write("document.lightsform.elements[10].checked=1;\n");
      out.write("document.lightsform.elements[12].checked=1;\n");
      out.write("document.lightsform.elements[14].checked=1;\n");
      out.write("}\n");
      out.write("function level2() {\n");
      out.write("clearall();\n");
      out.write("document.lightsform.elements[12].checked=1;\n");
      out.write("document.lightsform.elements[16].checked=1;\n");
      out.write("document.lightsform.elements[17].checked=1;\n");
      out.write("document.lightsform.elements[18].checked=1;\n");
      out.write("document.lightsform.elements[20].checked=1;\n");
      out.write("document.lightsform.elements[21].checked=1;\n");
      out.write("document.lightsform.elements[22].checked=1;\n");
      out.write("document.lightsform.elements[23].checked=1;\n");
      out.write("document.lightsform.elements[24].checked=1;\n");
      out.write("}\n");
      out.write("function level3() {\n");
      out.write("fillall();\n");
      out.write("document.lightsform.elements[4].checked=0;\n");
      out.write("document.lightsform.elements[6].checked=0;\n");
      out.write("document.lightsform.elements[7].checked=0;\n");
      out.write("document.lightsform.elements[8].checked=0;\n");
      out.write("document.lightsform.elements[11].checked=0;\n");
      out.write("document.lightsform.elements[12].checked=0;\n");
      out.write("document.lightsform.elements[13].checked=0;\n");
      out.write("document.lightsform.elements[16].checked=0;\n");
      out.write("document.lightsform.elements[17].checked=0;\n");
      out.write("document.lightsform.elements[18].checked=0;\n");
      out.write("document.lightsform.elements[24].checked=0;\n");
      out.write("}\n");
      out.write("function level4() {\n");
      out.write("clearall();\n");
      out.write("document.lightsform.elements[2].checked=1;\n");
      out.write("document.lightsform.elements[6].checked=1;\n");
      out.write("document.lightsform.elements[8].checked=1;\n");
      out.write("document.lightsform.elements[10].checked=1;\n");
      out.write("document.lightsform.elements[12].checked=1;\n");
      out.write("document.lightsform.elements[14].checked=1;\n");
      out.write("document.lightsform.elements[16].checked=1;\n");
      out.write("document.lightsform.elements[18].checked=1;\n");
      out.write("document.lightsform.elements[22].checked=1;\n");
      out.write(" }\n");
      out.write("function level5() {\n");
      out.write("clearall();\n");
      out.write("document.lightsform.elements[11].checked=1;\n");
      out.write("document.lightsform.elements[16].checked=1;\n");
      out.write("document.lightsform.elements[21].checked=1;\n");
      out.write("}\n");
      out.write("function checkall() {\n");
      out.write("var win=1;\n");
      out.write("for (var i = 0; i < 24; i++) {\n");
      out.write("if (document.lightsform.elements[i].checked==1) {\n");
      out.write("win=0;\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("if (win==1){\n");
      out.write("alert(\"\\nYou Won!!\\n\")\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("function check(v){\n");
      out.write("q=5;\n");
      out.write("w=1;\n");
      out.write("row=parseInt(v/q)+w;\n");
      out.write("if (isNaN(row)) {\n");
      out.write("row=1;\n");
      out.write("}\n");
      out.write("intv = parseInt(v);\n");
      out.write("a=eval(intv+q);\n");
      out.write("b=eval(intv-q);\n");
      out.write("c=eval(intv+w);\n");
      out.write("d=eval(intv-w);\n");
      out.write("if (a<0 || a>24){\n");
      out.write("a=25;\n");
      out.write("}\n");
      out.write("if (b<0 || b>24){\n");
      out.write("b=25;\n");
      out.write("}\n");
      out.write("if (c<0 || c>24){\n");
      out.write("c=25;\n");
      out.write("}\n");
      out.write("if (d<0 || d>24){\n");
      out.write("d=25;\n");
      out.write("}\n");
      out.write("kc = (parseInt(c/q)+w)\n");
      out.write("kd = (parseInt(d/q)+w)\n");
      out.write("kv = row;\n");
      out.write("if (kc != kv){\n");
      out.write("c=25;\n");
      out.write("}\n");
      out.write("if (kd != kv){\n");
      out.write("d=25;\n");
      out.write("}\n");
      out.write("if (v==5) d=25; // correction for strange bug\n");
      out.write("\n");
      out.write("if (document.lightsform.elements[a].checked == 1) {\n");
      out.write("document.lightsform.elements[a].checked=0;\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("document.lightsform.elements[a].checked=1;\n");
      out.write("}\n");
      out.write("if (document.lightsform.elements[b].checked == 1) {\n");
      out.write("document.lightsform.elements[b].checked=0;\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("document.lightsform.elements[b].checked=1;\n");
      out.write("}\n");
      out.write("if (document.lightsform.elements[c].checked == 1) {\n");
      out.write("document.lightsform.elements[c].checked=0;\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("document.lightsform.elements[c].checked=1;\n");
      out.write("}\n");
      out.write("if (document.lightsform.elements[d].checked == 1) {\n");
      out.write("document.lightsform.elements[d].checked=0;\n");
      out.write("}\n");
      out.write("else {\n");
      out.write("document.lightsform.elements[d].checked=1;\n");
      out.write("}\n");
      out.write("checkall();\n");
      out.write("}\n");
      out.write("//  End -->\n");
      out.write("</script>\n");
      out.write("</HEAD>\n");
      out.write("<body background='mag.jpg'>\n");
      out.write("<center>\n");
      out.write("    <br><br><br><br><br><br><br>\n");
      out.write("<form name=lightsform>\n");
      out.write("<table colspec=\"l20 l20 l20 l20 l20\" border=7>\n");
      out.write("<tr>\n");
      out.write("<td><input type=checkbox value=0 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=1 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=2 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=3 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=4 onClick=\"check(value)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=checkbox value=5 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=6 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=7 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=8 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=9 onClick=\"check(value)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=checkbox value=10 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=11 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=12 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=13 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=14 onClick=\"check(value)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=checkbox value=15 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=16 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=17 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=18 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=19 onClick=\"check(value)\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=checkbox value=20 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=21 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=22 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=23 onClick=\"check(value)\"></td>\n");
      out.write("<td><input type=checkbox value=24 onClick=\"check(value)\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<table border=1>\n");
      out.write("<tr>\n");
      out.write("<td><a href=\"javascript:level1()\">level 1</a></td>\n");
      out.write("<td><a href=\"javascript:level2()\">level 2</a></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><a href=\"javascript:level3()\">level 3</a></td>\n");
      out.write("<td><a href=\"javascript:level4()\">level 4</a></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><a href=\"javascript:level5()\">level 5</a></td>\n");
      out.write("<td><input type=\"reset\" value=\"clear\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br><h1>INSTRUCTIONS:</h1>\n");
      out.write("<table border='1px'><tr>*Choose a level.</tr>\n");
      out.write("<br>   \n");
      out.write("<tr>*Check the squares as you see the marked squares adjacent to the clicked one disappearing.</tr><br>\n");
      out.write("<tr>*Try to get all the boxes checked as you pass on the levels.</tr><br>\n");
      out.write("<tr>*COMPETE ..... GROW........</tr><br>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Exception ee){}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
