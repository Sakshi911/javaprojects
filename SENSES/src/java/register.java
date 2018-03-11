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

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

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
                    stmt=con.prepareStatement("Insert into Members values(?,?,?,?,?,?,?,?,?,?)");
                    stmt.setString(1,request.getParameter("t1"));
                    stmt.setString(2,request.getParameter("t2"));
                    stmt.setString(3,request.getParameter("t3"));
                    stmt.setString(4,request.getParameter("t4"));
                    stmt.setString(5,request.getParameter("t5"));
                    stmt.setString(6,request.getParameter("t6"));
                    stmt.setString(7,request.getParameter("t7"));
                    stmt.setString(8,request.getParameter("t8"));
                    stmt.setString(9,request.getParameter("t9"));
                    stmt.setString(10,request.getParameter("t10"));
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("Insert into users values(?,?,'member')");
                    stmt.setString(1,request.getParameter("t1"));
                    stmt.setString(2,request.getParameter("t11"));
                    stmt.executeUpdate();
                    con.close();
                    msg="Thanks for Registration.<br>We will help to solve your problems.<br>Please <a href='login'>Login</a> to Continue.";
                }
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body background='mag.jpg'>");
                out.write("<img src='bann091.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='firstpage2'>Home</a></td></tr></table><hr>");
                out.write("<form method=post>");
                out.write("<table align=center>");
                out.write("<tr><td>Email:</td><td><input type='text' name='t1'></td><td></td></tr>");
                out.write("<tr><td>Password:</td><td><input type='password' name='t11'></td><td></td></tr>");
                out.write("<tr><td>Name:</td><td><input type='text' name='t2'></td><td></td></tr>");
                out.write("<tr><td>Age:</td><td><input type='text' name='t3'></td><td></td></tr>");
                out.write("<tr><td>Gender:</td><td><input type=radio name='t4' value='M'>Male <input type=radio name='t4' value='F'>Female</td><td></td></tr>");
                out.write("<tr><td>Highest Qualification:</td><td><select name='t5'><option>10th</option><option>12th</option><option>Graduate</option><option>Post Graduate</option><option>Doctorate</option><option>Other</option></select></td><td></td></tr>");
                out.write("<tr><td>No. of Sisters:</td><td><select name='t6'><option>0</option><option>1</option><option>2</option><option>more than 2</option></select></td><td></td></tr>");
                out.write("<tr><td>No. of Brothers:</td><td><select name='t7'><option>0</option><option>1</option><option>2</opton><option>more than 2</option></select></td><td></td></tr>");
                out.write("<tr><td>Hobbies:</td><td><input type='text' name='t8'></td><td></td></tr>");
                out.write("<tr><td>My Interests:</td><td><input type='text' name='t9'></td><td></td></tr>");
                out.write("<tr><td>About Me:</td><td><textarea name='t10'></textarea></td><td></td></tr>");
                out.write("<tr><td></td><td><input type=submit name='b1' value='Register'></td><td></td></tr>");
                out.write("<tr><td></td><td>"+msg   +"</td><td></td></tr>");
                out.write("</table>");
                out.write("</form>");
                out.write("<hr><img src='bann.jpg' width='100%' height='200px'>");
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
