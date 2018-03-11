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
@WebServlet(urlPatterns = {"/firstpage1"})
public class firstpage1 extends HttpServlet {

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
      out.write("<title>MyFreeCssTemplates.com free CSS template</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
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
      out.write("      <a href='first' class=\"but but_t\"  title=\"\">Home</a>\n");
      out.write("      <a href='psychology' class=\"but\" title=\"\">About Psychology</a>\n");
      out.write("      <a href='login'  class=\"but\" title=\"\">Login</a>\n");
      out.write("      <a href='experts'  class=\"but\" title=\"\">Experts</a>\n");
      out.write("      <a href='register' class=\"but\" title=\"\">Registration</a>\n");
      out.write("      <a href='aboutus' class=\"but\" title=\"\">About Us</a>\n");
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
      out.write("                <img src='3(2).jpg' alt=\"\" />\n");
      out.write("                <img src='3.jpg' alt=\"\"/>\n");
      out.write("                <img src='bann093.jpg' alt=\"\" />\n");
      out.write("\t\t\t\t<img src='1sak.jpg' alt=\"\" />\n");
      out.write("\t\t\t\t<img src='bann1_1.jpg' alt=\"\" />\n");
      out.write("\t\t\t\t<img src='1.png' alt=\"\" />\n");
      out.write("\t\t\t\t<img src='2(2).jpg' alt=\"\" />\n");
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
      out.write("                          \t\t<img src=\"images/img1.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"#\" class=\"read\">Learn more</a></div>\n");
      out.write("                        \t</div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"#\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"#\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"#\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img2.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"#\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"width: 15px; height:26px; float: left;\"></div>\n");
      out.write("                        \t<div class=\"home_box\">\n");
      out.write("                         \t\t<img src=\"images/img3.gif\" class=\"img_l\" alt=\"\" />\n");
      out.write("                                <div style=\"height:15px\"></div>\n");
      out.write("                            \t<h1>Nam iaculis dapibus mi, luctus sagittis diam laoreet fermentum.</h1>\n");
      out.write("                                <div style=\"clear: both\"></div>\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo\n");
      out.write("                                <div style=\"height:5px\"></div>\n");
      out.write("                                <div style=\"height:20px\"><a href=\"#\" class=\"read\">read more</a></div>\n");
      out.write("                            </div>\n");
      out.write("                      \t\t<div style=\"clear: both\"></div>\n");
      out.write("               \t  \t</div>\n");
      out.write("                    <div style=\"height:20px\"></div>\n");
      out.write("                    <div class=\"box_more\">\n");
      out.write("                    \t<div class=\"box_more_l\">Donec aliquam vehicula turpis eu placerat. Nam felis sem, aliquam eget laoreet in, adipiscing eu tellus. Morbi semper suscipit turpis, sed viverra arcu ultrices vel. Curabitur congue semper mollis. Integer mauris nibh, venenatis volutpat pulvinar eu, congue id arcu. Suspendisse iaculis congue </div>\n");
      out.write("                        <div class=\"box_more_r\">\n");
      out.write("                        \t<a href=\"#\" class=\"but_more\">MORE INFO</a>\n");
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
      out.write("                        <li><a href=\"#\">Lorem ipsum dolor sit amet </a></li>\n");
      out.write("                        <li><a href=\"#\">Maecenas in magna quis augue</a></li>\n");
      out.write("                        <li><a href=\"#\">Ut a mauris nec eros consect</a></li>\n");
      out.write("                        <li><a href=\"#\">Nam luctus felis at mauris co </a></li>\n");
      out.write("                        <li><a href=\"#\">Aliquam sagittis ligula sit amet </a></li>\n");
      out.write("                        <li><a href=\"#\">Quisque sit amet est id urna</a></li>\n");
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
      out.write("                                    <b class=\"lh\">1234 Some Street, Brooklyn, NY 11201</b>\n");
      out.write("                              </div>\n");
      out.write("                              <div style=\"clear: both; height:10px;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div  class=\"box_us\">\n");
      out.write("                              <div  class=\"box_us_l\">\n");
      out.write("                                <img src=\"images/fish_us2.png\" alt=\"\" />\n");
      out.write("                              </div>\n");
      out.write("                              <div  class=\"box_us_r\">\n");
      out.write("                                    <b class=\"lh\">Phone:  1(234) 567 8910<br />\n");
      out.write("                                        Fax: 1(234) 567 8910\n");
      out.write("                                    </b>\n");
      out.write("                              </div>\n");
      out.write("                              <div style=\"clear: both; height:10px;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div  class=\"box_us\">\n");
      out.write("                              <div  class=\"box_us_l\">\n");
      out.write("                                <img src=\"images/fish_us3.png\" alt=\"\" />\n");
      out.write("                              </div>\n");
      out.write("                              <div  class=\"box_us_r\">\n");
      out.write("                                    <b class=\"lh\">E-mail: companyname@yahoo.com</b>\n");
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
      out.write("          \t\tCopyright  2011. <!-- Do not remove -->Designed by <a href=\"http://www.metamorphozis.com/free_templates/free_templates.php\" title=\"Free Web Templates\">Free Web Templates</a>, coded by <a href=\"http://www.myfreecsstemplates.com/\" title=\"Free CSS Templates\">Free CSS Templates</a><!-- end --><br />\n");
      out.write("                <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> | <a href=\"http://validator.w3.org/check/referer\" title=\"This page validates as XHTML 1.0 Transitional\"><abbr title=\"eXtensible HyperText Markup Language\">XHTML</abbr></a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" title=\"This page validates as CSS\"><abbr title=\"Cascading Style Sheets\">CSS</abbr></a>\n");
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
    } 
      catch(Exception ee){}
        
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
