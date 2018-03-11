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
@WebServlet(urlPatterns = {"/db"})
public class db extends HttpServlet {

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
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create database psychoweb");
                stmt.executeUpdate();
                stmt=con.prepareStatement("use psychoweb");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Members(email varchar(30) primary key,name varchar(30),age int,gender varchar(1),Qualification varchar(20),NoSisters int,NoBrothers int,Hobbies varchar(100),Interest varchar(100),AboutMe varchar(100))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table Experts(email varchar(30) primary key,name varchar(30),Qualification varchar(20),Experience int,Expertise varchar(30))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table users (email varchar(30),password varchar(30),utype varchar(30))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("insert into users values('admin','admin123','admin')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table PrivateDiscussion(id int,memail varchar(30),eemail varchar(30),Problem varchar(200),PostDate Date,Reply varchar(200),replydate date,previousid int)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table PublicDiscussion(id int,memail varchar(30),Problem varchar(200),PostDate Date)");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Create Table PublicReply(id int,eemail varchar(30),reply varchar(200),replyDate Date)");
                stmt.executeUpdate();
                PrintWriter out=response.getWriter();
                out.write("Done");
        }catch(Exception ee){}
        
        
        
        
    }  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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

