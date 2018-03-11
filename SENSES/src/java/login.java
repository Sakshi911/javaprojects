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
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

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
                String msg="";
                if(request.getParameter("b1")!=null)
                {
                    Class.forName("org.gjt.mm.mysql.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/PsychoWeb","root","");
                    PreparedStatement stmt;
                    stmt=con.prepareStatement("select * from users where email=? and password=?");
                    stmt.setString(1,request.getParameter("t1"));
                    stmt.setString(2,request.getParameter("t2"));
                    ResultSet rs=stmt.executeQuery();
                    if(rs.next())
                    {
                    
                    
                        String s=rs.getString(3);
                        HttpSession hs=request.getSession(true);
                        hs.setAttribute("EMAIL", request.getParameter("t1"));
                        hs.setAttribute("UTYPE",s);
                        hs.setAttribute("CON", con);
                        if(s.equals("admin"))
                        {
                            response.sendRedirect("adminhome");
                        }
                        if(s.equals("member"))
                        {
                            response.sendRedirect("memberhome");
                        }
                        if(s.equals("expert"))
                        {
                            response.sendRedirect("experthome");
                        }
                    }
                    else
                    {
                        msg="Invalid Login/Password!!!"; 
                    }
                }
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body background=mag.jpg>");
                out.write("<img src='bann091.jpg' width='100%' height='150px'><hr>");
                out.write("<table width='100%'><tr><td><a href='firstpage2'>Home</a></td></tr></table><hr><br><br><br><br><br>");
                
                out.write("<form method=post>");
                out.write("<table align=center>");
                out.write("<tr><td>Email:</td><td><input type='text' name='t1'></td><td></td></tr>");
                out.write("<tr><td>Password:</td><td><input type='password' name='t2'></td><td></td></tr>");
                out.write("<tr><td></td><td><input type=submit name='b1' value='Login'></td><td></td></tr>");
                out.write("<tr><td></td><td>"+msg   +"</td><td></td></tr>");
                out.write("</table>");
                out.write("</form><hr><br>");
                
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
