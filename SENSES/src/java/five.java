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
@WebServlet(urlPatterns = {"/five"})
public class five extends HttpServlet {

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
    {try
    {
        PrintWriter out=response.getWriter();
                response.setContentType("text/html");
         out.write("\n");
      out.write("\n");
      out.write("<html><head><style>function startGame()) {\n");
      out.write("    myGamePiece=new component(30, 30, \"red\", 10, 120);\n");
      out.write("    myGamePiece.gravity = 0.05;\n");
      out.write("    myScore=new component(\"30px\", \"Consolas\", \"black\", 280, 40, \"text\");\n");
      out.write("    myGameArea.start();\n");
      out.write("}\n");
      out.write("\n");
      out.write("var myGameArea={\n");
      out.write("    canvas:document.createElement(\"canvas\"),\n");
      out.write("    start:function() {\n");
      out.write("        this.canvas.width = 480;\n");
      out.write("        this.canvas.height = 270;\n");
      out.write("        this.context = this.canvas.getContext(\"2d\");\n");
      out.write("        document.body.insertBefore(this.canvas, document.body.childNodes[0]);\n");
      out.write("        this.frameNo = 0;\n");
      out.write("    },\n");
      out.write("    clear : function() {\n");
      out.write("        this.context.clearRect(0, 0, this.canvas.width, this.canvas.height);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("<!-- Begin\n");
      out.write("var display_text  = \"Sadly, Denmark is an unlikely place \"\n");
      out.write("+ \"to find gray elephants and orange kangaroos!  \"\n");
      out.write("+ \"     There are more cool stuff like this \"\n");
      out.write("+ \"throughout my site!  Check 'em out!!!!!!!!!!\"\n");
      out.write("var display_text; var place; var meter;\n");
      out.write("var out = \" \"; var place = 50;\n");
      out.write("function scroll_text(){\n");
      out.write("for (meter = 0; meter < place; meter++){\n");
      out.write("out += \" \"\n");
      out.write("}\n");
      out.write("if (place >= 0)\n");
      out.write("out += display_text\n");
      out.write("else out = display_text.substring(-place,display_text.length)\n");
      out.write("document.scroll_form.field.value = out\n");
      out.write("out = \" \"\n");
      out.write("place--\n");
      out.write("if (place < -(display_text.length)){\n");
      out.write("place = 50\n");
      out.write("}\n");
      out.write("setTimeout('scroll_text()',100)\n");
      out.write("}\n");
      out.write("// End -->\n");
      out.write("</SCRIPT> </head>\n");
      out.write("<body background='mag.jpg'>\n");
      out.write("<CENTER>\n");
      out.write("<TT>Please follow the instructions below carefully.\n");
      out.write("<P>\n");
      out.write("<OL>\n");
      out.write("<LI>Think of a number between 1 and 10.<P>\n");
      out.write("<LI>Multiply the number by 9.<P>\n");
      out.write("<LI>Add the digits of your result.<P>\n");
      out.write("<LI>Subtract 5 from your new number.<P>\n");
      out.write("<LI>Find the letter that corresponds to your number, if 1 = A, 2 = B, 3 = C, etc.<P>\n");
      out.write("<LI>Think of a country that begins with your letter.<P>\n");
      out.write("<LI>Write down the name of that country.<P>\n");
      out.write("<LI>Think of an animal beginning with the second letter of your country.<P>\n");
      out.write("<LI>Think of the color of that animal.<P>\n");
      out.write("<LI>Write down the animal and its color.<P>\n");
      out.write("<LI>Think of an animal that begins with the last letter of your country.<P>\n");
      out.write("<LI>Think of a fruit that begins with the last letter of this second animal.<P>\n");
      out.write("<LI>Write down the fruit and the animal.<P>\n");
      out.write("</OL>\n");
      out.write("<P>\n");
      out.write("<P>\n");
      out.write("When you are finished, touch analyze...\n");
      out.write("<FORM name=\"scroll_form\">\n");
      out.write("<input type=\"button\" name=\"button_one\" value=\"Analyze...\" onClick=\"scroll_text()\">\n");
      out.write("<input type=\"text\" name=\"field\" size=\"50\"><p>\n");
      out.write("</form>\n");
      out.write("</CENTER>\n<br><br><br><br>");
      out.write("<a href='games'>HOME</a></body>\n");
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
