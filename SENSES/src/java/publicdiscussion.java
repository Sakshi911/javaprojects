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
@WebServlet(urlPatterns = {"/publicdiscussion"})
public class publicdiscussion extends HttpServlet {

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
                if(!utype.equals("expert"))
                {
                    response.sendRedirect("login");
                }
                Connection con=(Connection)hs.getAttribute("CON");
                PreparedStatement stmt;
                java.util.Date d=new java.util.Date();
                    String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
                ResultSet rs;
                if(request.getParameter("b1")!=null)
                {
                    stmt=con.prepareStatement("Insert into publicreply values(?,?,?,?)");
                    stmt.setString(1,request.getParameter("t1"));
                    stmt.setString(2,hs.getAttribute("EMAIL")+"");
                    stmt.setString(3,request.getParameter("t2"));
                    stmt.setString(4,dt);
                    stmt.executeUpdate();
                    
                }
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><style>a{font-size:1.5em;}</style><body background='mag.jpg'>");
                out.write("<img src='bann09.jpg' width='100%' height='200px'><hr><br><br><br><br><br>");
                out.write("<table width='100%'><tr><td><a href='experthome'>Home</a></td><td><a href='privatediscussion'>Private Discussions</a></td><td><a href='publicdiscussion'>Public Discussions</a></td><td><a href='passwordchange'>Change Password</a></td><td><a href='logout'>Logout</a></td></tr><table><hr><br><br><br><br><br>");
                stmt=con.prepareStatement("Select * from publicdiscussion order by PostDate");
                rs=stmt.executeQuery();
                out.write("<table align=center border='1px'>");
                while(rs.next())
                {
                    String s1=rs.getString(1);
                    String s2=rs.getString(2);
                    String s3=rs.getString(3);
                    String s4=rs.getString(4);
                    out.write("<tr><td>"+s2+"</td><td>"+s3+"</td><td>"+s4+"</td><td>");
                    out.write("<form method=post><table>");
                    out.write("<tr><td></td><td><input type=hidden name='t1' value='"+s1+"'></td></tr>");
                    out.write("<tr><td>Reply:</td><td><textarea name='t2'></textarea></td></tr>");
                    out.write("<tr><td></td><td><input type='submit' name='b1' value='Reply'></td></tr>");
                    out.write("</table></form>");
                    out.write("</td></tr>");
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
