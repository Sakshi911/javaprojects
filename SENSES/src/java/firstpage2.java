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

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/firstpage2"})
public class firstpage2 extends HttpServlet {

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
         try {
      PrintWriter out=response.getWriter();
                response.setContentType("text/html");
              
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Senses</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href='styles.css' rel='stylesheet' type=\"text/css\" >\n");
      out.write("<link rel='stylesheet' href='nivo-slider.css' type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"bg\">\n");
      out.write("<div id=\"bg_top_bg\">\n");
      out.write("<div id=\"bg_top\">\n");
      out.write("<div id=\"bg_bot\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("<!-- header begins -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"buttons\">\n");
      out.write("            <a href='firstpage2' class=\"but but_t\"  title=\"\">Home</a>\n");
      out.write("      <a href='login'  class=\"but\" title=\"\">Login</a>\n");
      out.write("      <a href='experts'  class=\"but\" title=\"\">Experts</a>\n");
      out.write("      <a href='register' class=\"but\" title=\"\">Registration</a>\n");
      out.write("      <a href='aboutus' class=\"but\" title=\"\">About Us</a>\n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("    \t<a href=\"#\"></a>\n");
      out.write("      \t<h2><a href=\"#\"><small>Senses</small></a></h2>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- header ends -->\n");
      out.write("<div class=\"top\">\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"slider-wrapper\">\n");
      out.write("            <div id=\"slider\" class=\"nivoSlider\">\n");
      out.write("                <img src='top.jpg'>\n");
      out.write("                <img src='top2.jpg'>\n");
      out.write("                <img src='top3.jpg'>\n");
      out.write("\t\t\t\t<img src='top4.jpg'>\n");
      out.write("\t\t\t\t<img src='top5.jpg'>\n");
      out.write("\t\t\t\t<img src='top6.jpg'>\n");
      out.write("\t\t\t\t<img src='top7.jpg'>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery-1.4.3.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"lib/jquery.nivo.slider.pack.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    $(window).load(function() {\n");
      out.write("        $('#slider').nivoSlider();\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"height: 47px\"></div>\n");
      out.write("        <!-- content begins -->\n");
      out.write("        \t\t<div class=\"cont_top\"></div>\n");
      out.write("       \t\t\t<div id=\"content\">\n");
      out.write("                \t<div class=\"all_box\">\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                          \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>CHILD PSYCHOLOGY </h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                One of the major concerns in today's world is the behaviour and psychology of a child.A child is future of a country hence need to nourished quite well so that he/she is not hesitant to tell their secrects out.As an account of growing fears among children we are here to present an article on child psychology for better understanding of the current global scenario and going forward for acheiving dreams.\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href='child' class=\"read\">Learn more</a></div>\n");
      out.write("                        \t</div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>TRAINING OF PARENTS</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Parents are base to anyone's care. However now a days we see it that the people zre not able to deal with their grownups. So to fight out that thing we are hereby presenting the basic of how to train parents to change their parenting style so they have the ability to get forward into applying those techniques and and parent their children damn well and get forward to the new style of parenting.\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"parent\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>BRAIN GAMES</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                               Here we present a series called as brain games so that the user have the oppotunity to relax down by playing mentally relaxing games.Here we go to an interesting venture along with you to get into world of gaming and manifest themselves into the world of nicest of brainy stuff and brushing up of brain cells to achieve the desired and liable to connect to the concept of gaming and having a great refreshment. \n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"games\" class=\"read\">PLAY</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Tests</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                              Tests section has been provided to get the analysis of the brsin functioning and get the basic analysis of how our brain functions and how are we liable to get that functioning be affected by outer controls.. This is for the self analysis of the fact that brain activities are prettymuch affected by the outer control of the brian functioning and to get into the world of logics.   \n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"testmain\" class=\"read\">Play</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Self Coping Measures</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                               The one person who can cure up a person is himself. Once we see a perspective of our very own we venture into the world of reality and this reality is actually the self mirror ..when we start to analyse ourselves and get the basic reality of life and wha we really wish we want to achieve is well analysed and well descripted to us.So self coping measures form up a great portion.\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"selfcope\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>About Psychology</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Psychology can be defined as the study of mental processes and behavior.While psychology may be a young subject in the grand scheme of things, it has grown to play a tremendous role in the world today. Psychologists are employed in hospitals, mental health clinics, schools, colleges and universities, government agencies, private businesses, and private practice.\n");
      out.write("      \n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"psychology\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                      \t\t<div style=\"clear: both\"></div>\n");
      out.write("               \t  \t</div>\n");
      out.write("                    <div style=\"height:20px\"></div>\n");
      out.write("                    <div class=\"box_more\">\n");
      out.write("                    \t<div class=\"box_more_l\">We at senses believe in the fact that everyone has the right to live their life in perfect combination of calmness, happiness and mental peace.</div>\n");
      out.write("                        <div class=\"box_more_r\">\n");
      out.write("                        \t<a href=\"aboutus\" class=\"but_more\">MORE INFO</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"clear: both\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \t\t</div>\n");
      out.write("    <!-- content ends -->\n");
      out.write("    <div style=\"height:40px\"></div>\n");
      out.write("    <!-- bottom begin -->\n");
      out.write("    <div id=\"bottom_bot\">\n");
      out.write("        <div id=\"bottom\">\n");
      out.write("        <div id=\"b_col1\">\n");
      out.write("              <h1>Useful Resources</h1>\n");
      out.write("                <div style=\"height:10px\"></div>\n");
      out.write("                    <ul class=\"spis_bot\">\n");
      out.write("                        <li><a href=\"#\"> </a></li>\n");
      out.write("                        <li><a href=\"www.psychologytoday.com\">Psychology Today</a></li>\n");
      out.write("                        <li><a href=\"www.simplypsychology.org\">Simply Psychology</a></li>\n");
      out.write("                        <li><a href=\"www.apa.org\">American Psychological Association </a></li>\n");
      out.write("                        <li><a href=\"www.socialpsychology.org\">Social Psychological Network</a></li>\n");
      out.write("                        <li><a href=\"www.assessmentpsychology.com\">Assesment Psychology</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"b_col2\">\n");
      out.write("                    <h1>Contact Information</h1>\n");
      out.write("                    <div style=\"height:20px\"></div>\n");
      out.write("                    <div style=\"padding-left:10px\">\n");
      out.write("                        <div  class=\"box_us\">\n");
      out.write("                              <div  class=\"box_us_l\">\n");
      out.write("                                <img src=\"images/fish_us1.png\" alt=\"\" />\n");
      out.write("                              </div>\n");
      out.write("                              <div  class=\"box_us_r\">\n");
      out.write("                                    <b class=\"lh\">KIET GHAZIABAD</b>\n");
      out.write("                              </div>\n");
      out.write("                              <div style=\"clear: both; height:10px;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div  class=\"box_us\">\n");
      out.write("                              <div  class=\"box_us_l\">\n");
      out.write("                                <img src=\"images/fish_us2.png\" alt=\"\" />\n");
      out.write("                              </div>\n");
      out.write("                              <div  class=\"box_us_r\">\n");
      out.write("                                    <b class=\"lh\">Phone: 9997955711<br />\n");
      out.write("                                        Fax: 12345678910\n");
      out.write("                                    </b>\n");
      out.write("                              </div>\n");
      out.write("                              <div style=\"clear: both; height:10px;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div  class=\"box_us\">\n");
      out.write("                              <div  class=\"box_us_l\">\n");
      out.write("                                <img src=\"images/fish_us3.png\" alt=\"\" />\n");
      out.write("                              </div>\n");
      out.write("                              <div  class=\"box_us_r\">\n");
      out.write("                                    <b class=\"lh\">E-mail: duggalsakshi911@gmail.com</b>\n");
      out.write("                              </div>\n");
      out.write("                              <div style=\"clear: both; height:10px;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"b_col3\">\n");
      out.write("            \t<h1>Share with Others</h1>\n");
      out.write("              \t<div style=\"height:15px\"></div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><img src=\"images/fu_i1.png\" class=\" fu_i\" alt=\"\" /><a href=\"#\">Subscribe to Blog</a></li>\n");
      out.write("                        <li><img src=\"images/fu_i2.png\" class=\" fu_i\" alt=\"\" /><a href=\"#\">Be a fan on Facebook</a></li>\n");
      out.write("                        <li><img src=\"images/fu_i3.png\" class=\" fu_i\" alt=\"\" /><a href=\"#\">RSS Feed</a></li>\n");
      out.write("                        <li><img src=\"images/fu_i4.png\" class=\" fu_i\" alt=\"\" /><a href=\"#\">Follow us on Twitter</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("          \t<div style=\"clear: both; height:20px;\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!-- bottom end -->\n");
      out.write("<!-- footer begins -->\n");
      out.write("            <div id=\"footer\">\n");
      out.write("          \t\tCopyright  2017. <!-- Do not remove --> <a href=\"http://www.metamorphozis.com/free_templates/free_templates.php\" title=\"Free Web Templates\"></a> <a href=\"http://www.myfreecsstemplates.com/\" title=\"Free CSS Templates\"></a><!-- end --><br />\n");
      out.write("                <a href=\"#\"></a> | <a href=\"#\"></a> | <a href=\"http://validator.w3.org/check/referer\" title=\"This page validates as XHTML 1.0 Transitional\"><abbr title=\"eXtensible HyperText Markup Language\"></abbr></a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" title=\"This page validates as CSS\"><abbr title=\"Cascading Style Sheets\">senses</abbr></a>\n");
      out.write("             </div>\n");
      out.write("        <!-- footer ends -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Exception ee){}
            
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
