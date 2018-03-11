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
@WebServlet(urlPatterns = {"/psychology"})
public class psychology extends HttpServlet {

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
                out.write("<html><body background='p.jpg'><a href='firstpage2'>HOME</a>");
                out.write("<style>\n");
      out.write("#s1 {font-size:35px;font-Family:Goudy Old Style;color:rgb(19,15,106);text-align:center;}\n");
      out.write("#s4 {font-size:35px;font-Family:Goudy Old Style;color:rgb(179,89,0);text-align:center;}\n");
      out.write("#s5 {font-size:35px;font-Family:Goudy Old Style;color:rgb(53,53,0);text-align:center;}\n");
      out.write("#s6 {font-size:35px;font-Family:Goudy Old Style;color:rgb(145,0,0);text-align:center;}\n");
      out.write("#s7 {font-size:35px;font-Family:Goudy Old Style;color:rgb(0,0,125);text-align:center;}\n");
      out.write("#s8 {font-size:35px;font-Family:Goudy Old Style;color:rgb(0,0,0);text-align:center;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<img src='bann093.jpg' width='100%' height='200px'><hr>");
      out.write("<h1 style=\"font-family:Rockwell Extra Bold;font-size:50px;text-align:center;\"><u>PSYCHOLOGY</u></h1><br><br>\n");
      out.write("<h1 id=\"s1\"><b>WHAT EVERYONE NEEDS TO KNOW ABOUT PSYCHOLOGY?</b></h1>\n");
      out.write("<p style=\"font-size:24px;color:rgb(186,7,12);font-family:Franklin Gothic;\">It is common knowledge that public understanding of psychology is typically aligned with the mental health and intervention aspects of the discipline. Most people think of psychologists as clinicians and counselors. Few understand that psychology is the science of behavior, cognition and emotion. Even fewer recognize psychology as a STEM (Science-Technology-Engineering-Mathematics) discipline. People do not generally associate psychologist with scientist.<br>\n");
      
                out.write("<table width='100%'><tr><td><a href='firstpage'>Home</a></td></tr></table><hr>");
                out.write("<br><br><br><br>");
      out.write("First, let's start by addressing exactly what psychology involves. Psychology can be defined as the study of mental processes and behavior.<br>\n");
      out.write("The term psychology comes from the Greek word psyche meaning \"breath, spirit, soul\" and the word logia meaning \"study of.\"<br>\n");
      out.write("Psychology emerged from biology and philosophy and is closely linked to other disciplines including sociology, medicine, linguistics, and anthropology.<br>\n");
      out.write("While psychology may be a young subject in the grand scheme of things, it has grown to play a tremendous role in the world today. Psychologists are employed in hospitals, mental health clinics, schools, colleges and universities, government agencies, private businesses, and private practice and perform a wide variety of tasks and roles ranging from treating mental illness to influencing public health policy.<br><br></p><br>\n");
      out.write("<h1 id=\"s4\">PSYCHOLOGY IS ALL AROUND YOU!</h1>\n");
      out.write("<p style=\"font-size:24px;font-family:Franklin Gothic;color:rgb(11,72,35);\">Psychology is not just an academic subject that exists only in classrooms, research labs, and mental health offices. The principles of psychology can be seen all around you in everyday situations.<br>\n");
      out.write("The television commercials and print ads you see every day rely on psychology to develop marketing messages that influence and persuade people to purchase the advertised products. The websites you visit on a regular basis utilize psychology to understand how people read, use, and interpret online information.<br>\n");
      out.write("Psychology can also play a role in improving your health and well-being. For example, understanding some of the basic principles of behavioral psychology might come in handy if you are trying to break a bad habit and establish new routines. Knowing more about some of the things that motivate behavior can be useful if you are trying to stick to a weight loss plan or exercise regimen. Overcoming phobias, managing stress, improving communication skills, and making better decisions are just a few of the things with which psychology can help.<br></p><br>\n");
      out.write("<h1 id=\"s5\">PSYCHOLOGY IS ABOUT MORE THAN MENTAL HEALTH!</h1>\n");
      out.write("<p style=\"font-size:24px;font-family:Franklin Gothic;color:rgb(83,0,166);\">When you think of psychology, do you envision a therapist with a notepad jotting down ideas as a client recounts childhood experiences? While therapy is certainly a big part of psychology, it is not the only thing that psychologists do. In fact, many psychologists don't work in the field of mental health at all. Psychology encompasses other areas including teaching, research, and consulting.<br>\n");
      out.write("Psychologists work in a wide variety of settings, including:<br>\n");
      out.write("\n");
      out.write("<b>></b>Colleges and universities<br>\n");
      out.write("<b>></b>Private corporations<br>\n");
      out.write("<b>></b>K-12 Schools<br>\n");
      out.write("<b>></b>Hospitals<br>\n");
      out.write("<b>></b>Government offices<br><br>\n");
      out.write("<h2 id=\"s6\">PSYCHOLOGY RELIES ON SCIENTIFIC METHODS!</h2>\n");
      out.write("<p style=\"font-size:24px;font-family:Franklin Gothic;\">One of the most common myths about psychology is that it is just \"common sense.\" The problem with this is that psychological research has helped demonstrate that many of the things that we believe are just common sense are actually not true at all.<br>\n");
      out.write("After all, if common sense were as common as people say it is, then people wouldn’t engage in behaviors that they know are bad for them like smoking or eating junk food. By challenging some of our misconceptions about how and why people behave as they do, psychologists are able to provide answers that help solve real-world problems.<br>\n");
      out.write("Unlike common sense, psychology relies on scientific methods to investigate questions and arrive at conclusions. It is through using empirical methods that researchers are able to discover relationships between different variables. Psychologists use a range of techniques to study the human mind and behavior, including naturalistic observation, experiments, case studies, and questionnaires.</p><br>\n");
      out.write("<h2 id=\"s7\">PSYCHOLOGISTS TACKLE PROBLEMS FROM MULTIPLE PERSPECTIVES!</h2>\n");
      out.write("<p style=\"font-size:24px;font-family:Franklin Gothic;color:rgb(111,55,0);\">Topics and questions in psychology can be looked at in a number of different ways. Let's take the topic of violence as an example. Some psychologists may look at how biological influences contribute to violence, while other psychologists might look at how factors such as culture, family relationships, social pressure, and situational variables influence violence.<br>\n");
      out.write("Some of the major perspectives in psychology include the:<br>\n");
      out.write("<b>></b>Biological perspective<br>\n");
      out.write("<b>></b>Cognitive perspective<br>\n");
      out.write("<b>></b>Behavioral perspective<br>\n");
      out.write("<b>></b>Evolutionary perspective<br>\n");
      out.write("<b>></b>Humanistic perspective<br>\n");
      out.write("Each perspective helps contribute a new level of understanding to a topic.<br>\n");
      out.write("No single perspective is \"right.\" Each perspective contributes to how we understand a topic and allows researchers to analyze the myriad influences that contribute to certain actions and come up with multi-faceted solutions to combat problematic actions and encourage better outcomes and healthier behaviors.<br>\n");
      out.write("<h3 id=\"s8\">IF YOU HAVE A PROBLEM,THERE'S PROBABLY A PSYCHOLOGIST WHO CAN HELP!</h3>\n");
      out.write("<p style=\"font-size:24px;font-family:Franklin Gothic;color:rgb(75,0,151);\">There are many different types of psychologists; each one focused on solving different types of problems in the world. For example, if your child is experiencing problems at school, you might seek advice from a school psychologist who specializes in helping kids deal with academic, social, emotional, and other issues. If you are concerned about an elderly parent or grandparent, you might want to consult with a developmental psychologist who is specially trained and knowledgeable in issues related to the aging process.<br>\n");
      out.write("In order to determine which professional is right for your needs, it helps to understand some of the different training and licensing requirements for different specialty areas. If you are trying to select a psychotherapist, it may also be helpful to learn more about which professionals are able to provide therapy services.\n");
      out.write("</p>\n");
                out.write("<hr><img src='3.jpg' width='100%' height='250px'>");
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
