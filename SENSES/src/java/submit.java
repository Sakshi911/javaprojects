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
@WebServlet(urlPatterns = {"/submit"})
public class submit extends HttpServlet {

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
                out.write("<html><body background=mag.jpg>");
                out.write("<img src='bann091.jpg' width='100%' height='150px'><hr>");
                out.write("<h1>Detailed Analysis</h1><h3><p>if you are securing more than 75% then you should definitely get to a good psychologist or simply get to our site and get set go for the consultation.</p><p>If you have got it in between 50% to 75% you should better do meditation and may consult a psychologist for a better understanding.</p><p>If you are getting a score between 25% to 50% you can always do medidation and taking care of the fact that you don't overthink situations and can always be healthy fit and pretty much fine</p><p>Rest do meditation stay fit and fine as someone for you is always there who care for you.</p></h3>"); 
                
                
                out.write("<hr><img src='bann09.jpg' width='100%' height='250px'>");
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
