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
@WebServlet(urlPatterns = {"/games"})
public class games extends HttpServlet {

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
                out.write("<html><style>a{font-size:30px;color:white}</style><body background='green_1.jpg'>");
                out.write("<br><br><a href='firstpage2'>HOME</a><br><br><CENTER><h1>WELCOME TO THE GAMES SECTION</h1><ul><li><a href='four'>HIT_THE_DOT</a></li>");
                out.write("<li><a href='three'>TICK_IN_THE_BOX</a></li>");
                out.write("<li><a href='five'>NUMBER_RUMBLE</a></li>");
                out.write("<li><a href='four'>GAME 4(coming soon.....)</a></li>");
                out.write("</ul><br><br><BR><BR><i><B>GAMES ARE AUTOMATIC MENTAL HEALER.. <br>THEY PROVIDE NOT ONLY PEACE OF MIND BUT ALSO DISTRACT US FROM ALL THE STRUGGLES WE ARE UNDERGOING</i></b></center></body></html>");
            
            
            
            
            
            
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
