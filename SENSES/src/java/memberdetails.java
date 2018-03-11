/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/memberdetails"})
public class memberdetails extends HttpServlet {

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
                HttpSession hs=request.getSession(false);
                if(hs==null)
                {
                    response.sendRedirect("login");
                }
                String utype=hs.getAttribute("UTYPE").toString();
                if(!utype.equals("admin"))
                {
                    response.sendRedirect("login");
                }
                Connection con=(Connection)hs.getAttribute("CON");
                PreparedStatement stmt;
                ResultSet rs;
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body>");
                out.write("<img src='banner.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='adminhome'>Home</a></td><td><a href='expertdetails'>Expert Details</a></td><td><a href='memberdetails'>Member Details</a></td><td><a href='passwordchange'>Change Password</a></td><td><a href='logout'>Logout</a></td></tr><table><hr>");
                out.write("<br><br><br><br>");
                out.write("<hr><img src='footer.jpg' width='100%' height='150px'>");
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
