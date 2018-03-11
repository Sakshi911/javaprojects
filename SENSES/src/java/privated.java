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
@WebServlet(urlPatterns = {"/privated"})
public class privated extends HttpServlet {

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
                String msg="";
                if(request.getParameter("b1")!=null)
                {
                    stmt=con.prepareStatement("Select count(*)+1 from privatediscussion");
                    rs=stmt.executeQuery();
                    String id="0";
                    if(rs.next())
                    {
                        id=rs.getString(1);
                    }
                    java.util.Date d=new java.util.Date();
                    String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
                    stmt=con.prepareStatement("Insert into privatediscussion(id,memail,eemail,problem,postdate) values(?,?,?,?,?)");
                    stmt.setString(1,id);
                    stmt.setString(2,hs.getAttribute("EMAIL")+"");
                    stmt.setString(3,request.getParameter("s1"));
                    stmt.setString(4,request.getParameter("t1"));
                    stmt.setString(5,dt);
                    stmt.executeUpdate();
                    msg="We have receviced your request<br>and submitted to the Expert<br>Please wait 2-3 days for reply";
                }   
                
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body background='mag.jpg'>");
                out.write("<img src='bann09.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='memberhome'>Home</a></td><td><a href='privated'>Private Discussions</a></td><td><a href='publicd'>Public Discussions</a></td><td><a href='passwordchange'>Change Password</a></td><td><a href='profile'>My Profile</a></td><td><a href='logout'>Logout</a></td></tr><table><hr>");
                out.write("<br><br>");
                out.write("<form method=post>");
                out.write("<table align=center>");
                out.write("<tr><td>Expert Email:</td><td><select name=s1>");
                stmt=con.prepareStatement("Select * from Experts");
                rs=stmt.executeQuery();
                while(rs.next())
                {
                    out.write("<option>"+rs.getString(1)+"</option>");
                }
                out.write("</select></td><td></td></tr>");
                out.write("<tr><td>Your Problem:</td><td><textarea rows=5 name=t1></textarea></td><td></td></tr>");
                out.write("<tr><td></td><td></td><td></td></tr>");
                out.write("<tr><td></td><td><input type='submit' value='Send Problem to Expert' name='b1'></td><td></td></tr>");
                out.write("<tr><td></td><td><font color=red>"+msg+"</font></td><td></td></tr>");
                out.write("</table>");
                out.write("</form>");
                out.write("<hr>");
                stmt=con.prepareStatement("Select * from Experts");
                rs=stmt.executeQuery();
                out.write("<table align=center border='2px'>");
                out.write("<tr><th>Email</th><th>Name</th><th>Qualification</th><th>Experience</th><th>Expertise</th></tr>");
                while(rs.next())
                {
                    out.write("<tr>");
                    out.write("<td>"+rs.getString(1)+"</td>");
                    out.write("<td>"+rs.getString(2)+"</td>");
                    out.write("<td>"+rs.getString(3)+"</td>");
                    out.write("<td>"+rs.getString(4)+"</td>");
                    out.write("<td>"+rs.getString(5)+"</td>");
                    out.write("</tr>");
                }
                out.write("</table>");
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
