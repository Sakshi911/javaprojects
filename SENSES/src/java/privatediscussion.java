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

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/privatediscussion"})
public class privatediscussion extends HttpServlet {

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
                ResultSet rs;
                if(request.getParameter("b1")!=null)
                {
                    java.util.Date d=new java.util.Date();
                    String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
                    stmt=con.prepareStatement("Update privatediscussion set reply=?,replydate=? where id=?");
                    stmt.setString(1,request.getParameter("t2"));
                    stmt.setString(2,dt);
                    stmt.setString(3,request.getParameter("t1"));
                    stmt.executeUpdate();
                }
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body background='mag.jpg'>");
                out.write("<img src='bann09.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='experthome'>Home</a></td><td><a href='privatediscussion'>Private Discussions</a></td><td><a href='publicdiscussion'>Public Discussions</a></td><td><a href='passwordchange'>Change Password</a></td><td><a href='logout'>Logout</a></td></tr><table><hr>");
                out.write("<br><br>");
                stmt=con.prepareStatement("Select * from privatediscussion where eemail=? and reply is null order by PostDate");
                stmt.setString(1,hs.getAttribute("EMAIL")+"");
                rs=stmt.executeQuery();
                out.write("<table align=center border='1px'>");
                out.write("<tr><th>ID</th><th>Email</th><th>Problem</th><th>Date</th><th></th></tr>");
                while(rs.next())
                {
                    out.write("<tr>");
                    out.write("<td>"+rs.getString(1)+"</td>");
                    out.write("<td>"+rs.getString(2)+"</td>");
                    out.write("<td>"+rs.getString(4)+"</td>");
                    out.write("<td>"+rs.getString(5)+"</td>");
                     out.write("<td><a href='privatediscussion?id="+rs.getString(1)+"'>Reply</a></td>");
                    out.write("</tr>");
                }
                out.write("</table><hr>");
                String id=request.getParameter("id");
                if(id==null) id="";
                out.write("<form method=post>");
                out.write("<table align=center>");
                out.write("<tr><td>ID:</td><td><input type='text' name='t1' value='"+id+"' readonly></td><td></td></tr>");
                out.write("<tr><td>Reply:</td><td><textarea name='t2' rows=5 ></textarea></td><td></td></tr>");
                out.write("<tr><td></td><td><input type=submit name='b1' value='Reply'></td><td></td></tr>");
                out.write("<tr><td></td><td></td><td></td></tr>");
                out.write("</table>");
                out.write("</form>");
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
