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
@WebServlet(urlPatterns = {"/profile"})
public class profile extends HttpServlet {

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
                if(!utype.equals("member"))
                {
                    response.sendRedirect("login");
                }
                Connection con=(Connection)hs.getAttribute("CON");
                PreparedStatement stmt;
                ResultSet rs;
                if(request.getParameter("b1")!=null)
                {
                    stmt=con.prepareStatement("Update Members set Hobbies=?,Interest=?,Aboutme=? where email=?");
                    stmt.setString(1,request.getParameter("t8"));
                    stmt.setString(2,request.getParameter("t9"));
                    stmt.setString(3,request.getParameter("t10"));
                    stmt.setString(4,hs.getAttribute("EMAIL")+"");
                    stmt.executeUpdate();
                }
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body background='mag.jpg'>");
                out.write("<img src='bann09.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='memberhome'>Home</a></td><td><a href='privated'>Private Discussions</a></td><td><a href='publicd'>Public Discussions</a></td><td><a href='passwordchange'>Change Password</a></td><td><a href='profile'>My Profile</a></td><td><a href='logout'>Logout</a></td></tr><table><hr>");
                out.write("<br><br><br><br>");
                stmt=con.prepareStatement("Select * from Members where email=?");
                stmt.setString(1,hs.getAttribute("EMAIL")+"");
                rs=stmt.executeQuery();
                if(rs.next())
                {
                    out.write("<form method=post>");
                    out.write("<table align=center>");
                    out.write("<tr><td>Email:</td><td><input type='text' name='t1' value='"+rs.getString(1)+"' readonly></td><td></td></tr>");
                    out.write("<tr><td>Name:</td><td><input type='text' name='t2'  value='"+rs.getString(2)+"' readonly></td><td></td></tr>");
                    out.write("<tr><td>Age:</td><td><input type='text' name='t3'  value='"+rs.getString(3)+"' readonly></td><td></td></tr>");
                    out.write("<tr><td>Gender:</td><td> "+rs.getString(4)+"</td><td></td></tr>");
                    out.write("<tr><td>Highest Qualification:</td><td> "+rs.getString(5)+"</td><td></td></tr>");
                    out.write("<tr><td>No. of Sisters:</td><td> "+rs.getString(6)+"</td><td></td></tr>");
                    out.write("<tr><td>No. of Brothers:</td><td> "+rs.getString(7)+"</td><td></td></tr>");
                    out.write("<tr><td>Hobbies:</td><td><input type='text'  value='"+rs.getString(8)+"' name='t8'></td><td></td></tr>");
                    out.write("<tr><td>My Interests:</td><td><input type='text'  value='"+rs.getString(9)+"' name='t9'></td><td></td></tr>");
                    out.write("<tr><td>About Me:</td><td><textarea name='t10'>"+rs.getString(10)+"</textarea></td><td></td></tr>");
                    out.write("<tr><td></td><td><input type=submit name='b1' value='Update'></td><td></td></tr>");                    
                    out.write("</table>");
                    out.write("</form>");
                }
                out.write("<hr><img src='bann091.jpg' width='100%' height='150px'>");
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
