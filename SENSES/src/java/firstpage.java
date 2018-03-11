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
@WebServlet(urlPatterns = {"/firstpage"})
public class firstpage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    {
         try{
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><style>a{color:black;font-weight:bold;font-size:30px;}img{border-color:black;border-width:5px;border-style:solid;margin:80px;}</style><body background='PrvSV9_1.jpg'>");
                out.write("<img src='bann093.jpg' width='100%' height='250px'><br><br>");
                out.write("<table width='100%'><tr><td><a href='firstpage'>Home</a></td><td><a href='psychology'>About Psychology</a></td><td><a href='login'"
                        + ">Login</a></td><td><a href='experts'>Experts</a></td><td><a href='register'>Registration</a></td><td><a href='aboutus'>About Us</a></td></tr></table><hr><hr><br><br>");
                out.write("<img src='4_2.jpg' width='35%' height='350px' border-color:black;border-width:5px;border-style:solid;margin:55px;><img src='3_1.jpg' width='35%' height='350px' border-color:black;border-width:5px;border-style:solid;margin:55px;>");
                out.write("<img src='download.jpg' width='35%' height='350px'><img src='4.jpg' width='35%' height='350px'>");
                out.write("<img src='bann3.jpg' width='35%' height='350px'><img src='images09.jpg' width='35%' height='350px'>");
                out.write("<img src='bann1.jpg' width='100%' height='400px'class='.imgclass' >"); 
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
