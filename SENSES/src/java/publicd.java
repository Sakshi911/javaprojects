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
@WebServlet(urlPatterns = {"/publicd"})
public class publicd extends HttpServlet {

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
                    stmt=con.prepareStatement("Select count(*)+1 from publicdiscussion");
                    rs=stmt.executeQuery();
                    String id="0";
                    if(rs.next())
                    {
                        id=rs.getString(1);
                    }
                    java.util.Date d=new java.util.Date();
                    String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
                    stmt=con.prepareStatement("Insert into publicdiscussion values(?,?,?,?)");
                    stmt.setString(1,id);
                    stmt.setString(2,hs.getAttribute("EMAIL")+"");
                    stmt.setString(3,request.getParameter("t1"));
                    stmt.setString(4,dt);
                    stmt.executeUpdate();
                    msg="We have received your request<br>and submitted to the Public Forum<br>Please check Public Discussion Page";
                }                   
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body background='mag.jpg'>");
                out.write("<img src='bann09.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='memberhome'>Home</a></td><td><a href='privated'>Private Discussions</a></td><td><a href='publicd'>Public Discussions</a></td><td><a href='passwordchange'>Change Password</a></td><td><a href='profile'>My Profile</a></td><td><a href='logout'>Logout</a></td></tr><table><hr>");
                out.write("<br><br>");
                out.write("<form method=post>");
                out.write("<table align=center>");
                out.write("<tr><td>Your Problem:</td><td><textarea rows=7 columns=40 name=t1></textarea></td><td></td></tr>");
                out.write("<tr><td></td><td></td><td></td></tr>");
                out.write("<tr><td></td><td><input type='submit' value='Post Publicly' name='b1'></td><td></td></tr>");
                out.write("<tr><td></td><td><font color=red>"+msg+"</font></td><td></td></tr>");
                out.write("</table>");
                out.write("</form>");  
                 stmt=con.prepareStatement("Select * from publicdiscussion where memail=?");
                stmt.setString(1,hs.getAttribute("EMAIL")+"");
                rs=stmt.executeQuery();
                out.write("<table align=center border='1'>");
                while(rs.next())
                {
                    String s1=rs.getString(1);
                    String s2=rs.getString(2);
                    String s3=rs.getString(3);
                    String s4=rs.getString(4);
                    out.write("<tr>");
                    out.write("<td>"+s4+"</td>");
                    out.write("<td>"+s3+"</td>");
                    out.write("</tr>");
                    PreparedStatement stmt1=con.prepareStatement("Select * from publicreply where id=?");
                    stmt1.setString(1,s1);
                    ResultSet rs1=stmt1.executeQuery();
                    while(rs1.next())
                    {
                        String s11=rs1.getString(2);
                        String s12=rs1.getString(3);
                        String s13=rs1.getString(4);
                        out.write("<tr>");
                        out.write("<td>"+s13+"<br>"+s11+"</td>");
                        out.write("<td><i><b>"+s12+"</b></i></td>");                        
                        out.write("</tr>");
                    }
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
