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
@WebServlet(urlPatterns = {"/aboutus"})
public class aboutus extends HttpServlet {

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
         try{
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><style>p{font-size:30px}</style><body background='1(3).jpg'>");
                out.write("<img src='bann093.jpg' width='100%' height='250px'><hr>");
                out.write("<table width='100%'><tr><td><a href='firstpage2'>HOME</a></td></tr></table><hr>");
                out.write("<br>");
                 out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<h1>\n");
      out.write("ABOUT US</h1><br>\n");
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
                out.write("<hr><img src='bann092.jpg' width='100%' height='250px'>");
                out.write("</body></html>");
        }catch(Exception ee){}
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
