/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
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
@WebServlet(urlPatterns = {"/tests"})
public class tests extends HttpServlet {

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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>\n");
      out.write("psychology test\n");
      out.write("</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body background='p1.jpg'><a href='firstpage2'>HOME</a>\n");
      out.write("<h1 style=\"color:\">Psychological Test</h1>\n");
      out.write("<div style=\"color:violet; font-size:19\">\n");
      out.write("Discover The Inner-You With This Psychological Test\n");
      out.write("When you stop and consider it, the human mind is a pretty incredible thing.\n");
      out.write("\n");
      out.write("The brain is so curious that it invents ways to understand itself better. Really kind of wild when you break it down like that, isn't it?\n");
      out.write("\n");
      out.write("One of the ways we understand ourselves better is through psychological testing.\n");
      out.write("\n");
      out.write("Despite what you might think, testing your psychology to understand yourself isn't just for mentally unstable people.\n");
      out.write("\n");
      out.write("Anyone can do it. One of the popular ways is through simple hypothetical tests.\n");
      out.write("\n");
      out.write("This test that we're about to do, called a \"psycho-dynamic\" test, is a few decades old now.\n");
      out.write("\n");
      out.write("It's a tried and true way to reveal your inner feelings about your fears, likes, loves, and desires. We recommend grabbing a pen and a piece of paper and writing down what you see in your mind's eye and what your answers are.\n");
      out.write("\n");
      out.write("At the bottom of the article, we'll discuss what each of your answers indicates about you.\n");
      out.write("\n");
      out.write("From there, you can do with that information whatever you like.\n");
      out.write("\n");
      out.write("We encourage you to keep an open mind, an open heart, and be willing to hear what the results have to say, but don't over-analyze it or anything.\n");
      out.write("\n");
      out.write("And if you think you have a friend or loved one who might like to take the test, be sure to share!\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"color:green ;font-size:18\" }>\n");
      out.write("<h3>The Forest</h3>\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12036831/980x.jpg\" height=\"350px\" width=\"600\"></div>\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<form>Picture yourself walking down a forest path.\n");
      out.write("\n");
      out.write("Close your eyes and visualize the scenario if you think it'll help you. Once you've got a good image of your forest, there are three questions that need to be answered:\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li>Are the trees organized in a pattern or are they randomly placed? <input type=\"text\" name=\"t1\"><br></li>\n");
      out.write("<li>Is it daytime or nighttime? <input type=\"text\" name=\"t2\"><br></li>\n");
      out.write("<li>Is the path wide or narrow? Is it well-traveled or rugged?  <input type=\"text\" name=\"t3\"><br></li>\n");
      out.write("</ul>\n");
       out.write("<br><br> <center> <input type=submit name='b1' value='Submit'></center>\n");
       out.write("</form></div></div>\n");
      out.write("\n");
      out.write("<h3>The Key</h3>\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12036890/980x.jpg\" height=\"350\" width=\"600\" >\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<form>\n");
      out.write("As you walk down your path, getting deeper into the woods, you spot a key lying on the ground by itself.\n");
      out.write("\n");
      out.write("There are a few questions about this key you need to answer.<br>\n");
      out.write("<ul>\n");
      out.write("<li>What does the key look like? Is it a new key or an old key? Is it shiny or dull? Is it large or small? What does it look like it unlocks?<input type=\"text\" name=\"q1\"><br></li>\n");
      out.write("\n");
      out.write(" <li>Will you pick the key up or leave it in its current place?<input type=\"text\" name=\"t4\"><br></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
       out.write("<br><br> <center> <input type=submit name='b2' value='Submit'></center>\n");
    if(request.getParameter("b2")!=null)
       {out.write("request.getParameter(\"t3\")");
       out.write("request.getParameter(\"t4\")");
       }
      out.write("</form></div>\n");
      out.write("</div>\n");
      out.write("<h3>The Bear</h3>\n");
      out.write("\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12036957/980x.jpg\" height =\"350\"width=\"600\">\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("\n");
      out.write("Once you've either picked up or passed the key, you continue along down your trail and you come upon a bear.\n");
      out.write("\n");
      out.write("When you see the bear, freeze that moment in your mind so we can analyze it.\n");
      out.write("<ul>\n");
      out.write("There are two questions you need to answer about the bear:<br>\n");
      out.write("\n");
      out.write("<li>Is the bear friendly or does it seem aggressive and intimidating? Are you afraid?<input type=\"text\" name=\"q1\"><br></li>\n");
      out.write("\n");
      out.write("<li>Is it a small bear or a large bear?<input type=\"text\" name=\"t5\"><br>\n");
      out.write("</li>\n");
      out.write("</ul>\n");
       out.write("<br><br> <center> <input type=submit name='b3' value='Submit'></center>\n");
    if(request.getParameter("b3")!=null)
       {out.write("request.getParameter(\"t5\")");
     
       }
      out.write("</form>\n");
      out.write("</div></div>\n");
      out.write("<h3>The Urn</h3>\n");
      out.write("\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12037065/980x.jpg\"height=\"350\" width=\"600\">\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("Unfreeze this moment in your mind.\n");
      out.write("\n");
      out.write("The bear lumbers along through the woods and away from you. Thank goodness!\n");
      out.write("\n");
      out.write("You continue along the path and suddenly come upon an urn sitting right in the middle of the path. There are two questions you need to answer about this urn:\n");
      out.write("<ul>\n");
      out.write("<li>What does the urn look like? What is it made of?<input type=\"text\" name=\"t6\"><br></li>\n");
      out.write("\n");
      out.write("<li>Is there anything inside the urn? If so, what's in it?<input type=\"text\" name=\"t7\"><br></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("</ul>\n");
       out.write("<br><br> <center> <input type=submit name='b4' value='Submit'></center>\n");
    if(request.getParameter("b4")!=null)
       {out.write("request.getParameter(\"t6\")");
       out.write("request.getParameter(\"t7\")");
       }
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<h3>The House</h3>\n");
      out.write("\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12037169/980x.jpg\"height=\"350\" width=\"600\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<form>\n");
      out.write("Leaving the urn where it is, you continue along this path for a bit and come upon a house, where the path finally dead ends.\n");
      out.write("\n");
      out.write("There are two questions about this house that you'll need to answer.\n");
      out.write("<ul>\n");
      out.write("<li>Is the house small or large? What kind of house is it?<input type=\"text\" name=\"t8\"><br></li>\n");
      out.write("\n");
      out.write("Inside the house, you hear a man yelling, screaming, raving, and throwing a fit.\n");
      out.write("\n");
      out.write("He sounds kind of unstable and scary. He sees you outside and demands that you unlock the door to let him out.\n");
      out.write("\n");
      out.write("He's pleading with you, though he seems out of his mind.\n");
      out.write("<li>\n");
      out.write("Will you open the door for the man?<input type=\"text\" name=\"t9\"><br></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
       out.write("<br><br> <center> <input type=submit name='b5' value='Submit'></center>\n");
    if(request.getParameter("b5")!=null)
       {out.write("request.getParameter(\"t8\")");
       out.write("request.getParameter(\"t9\")");
       }
      out.write("</form>\n");
      out.write("</div></div>\n");
      out.write("<h3>Fade To White</h3>\n");
      out.write("\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12037171/980x.jpg\" height=\"350\" width=\"600\">\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<form>\n");
      out.write("You've made your decision about whether or not to let the man out and suddenly everything quickly fades to white.\n");
      out.write("\n");
      out.write("You don't seem to be anywhere. Up, down, left, right, none of these things matter anymore. You are simply floating in white. You cry out but there is no one to hear you.\n");
      out.write("\n");
      out.write("There is only one question to answer regarding this abrupt purgatory:\n");
      out.write("<ul>\n");
      out.write("<li>What do you do? Do you explore and try to escape? Do you give up and accept your fate?<input type=\"text\" name=\"t9\"><br></li>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<br><br> <center> <input type=submit name='b6' value='Submit'></center>\n");
      if(request.getParameter("b6")!=null)
       {out.write("request.getParameter(\"t9\")");
       
       }
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div style=\"color:grey\">\n");
      out.write("<p style=\"font-size:20\" >And with that, the test is over! Letâ??s get into the explanations.\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"color:blue\">\n");
      out.write("\n");
      out.write("<img src=\"https://assets.rbl.ms/12037314/980x.jpg\" width=\"1200\"><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("The Forest, Explained\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12037396/980x.jpg\" height=\"350\" width=\"600\"><br>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("The forest is representative of the inner you - all of the things that make up who you are on the inside.\n");
      out.write("\n");
      out.write("The path is your connection to childhood, to your present, and to your death. But this forest is everything that you are.\n");
      out.write("\n");
      out.write("So let's dig in and see what we've learned about you.\n");
      out.write("<ul>\n");
      out.write("<li>If the forest was disorganized, then there's a good chance you're disorganized too.\n");
      out.write("\n");
      out.write("If the forest was neat and clean and even and well organized, it's safe to say that you are those things also.\n");
      out.write("\n");
      out.write("If the trees were a random pattern, it could be a sign that little things are less important to you.\n");
      out.write("\n");
      out.write("If the trees were more evenly patterned, it could be a sign that smaller details are important to you.\n");
      out.write("</li>\n");
      out.write("<li>The choice in question two was light and dark.\n");
      out.write("\n");
      out.write("If the forest was bright and well lit in the daylight, it means you probably have a sunnier outlook on your life.\n");
      out.write("\n");
      out.write("If the forest was dark, you may have a darker outlook.\n");
      out.write("\n");
      out.write("If it was somewhere in between, you may view life through a pragmatic lens.</li>\n");
      out.write("\n");
      out.write("<li> The path represents the path that you're on.\n");
      out.write("\n");
      out.write("So the state of the path is telling of how you perceive the state of your life as a whole.\n");
      out.write("\n");
      out.write("If the path was rugged and not so well traveled, it could mean that you see yourself breaking away from other people who occupied this world, doing your own thing.\n");
      out.write("\n");
      out.write("A better kept path probably means you view your life as more traditional and \"normal.\"\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("</div></div>\n");
      out.write("<h3>The Key, Explained</h3>\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12037463/980x.jpg\" height=\"350\" width=\"600\"><br>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("The key represents the whole of your desires, from your sexual desires to personal desires to professional desires.\n");
      out.write("\n");
      out.write("It can be a promise or it can be a threat. It can be an unknown or a gateway to another world.\n");
      out.write("<ul>\n");
      out.write("<li>How old the key was in your imagination may indicate the age and maturity of your dreams.\n");
      out.write("\n");
      out.write("If it was an ornamental key, it may be a sign that you want nicer things and have larger ambitions.\n");
      out.write("\n");
      out.write("If it was a super old key, ancient in fact, it may mean that you think you've got some big surprises in store for you.\n");
      out.write("\n");
      out.write("The larger the key was, the more you hope to get out of your life.\n");
      out.write("\n");
      out.write("A smaller key may mean you're dreaming too small.\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write(" If you took the key with you, it means that you may have desires that you want to see through.\n");
      out.write("\n");
      out.write("If you left the key behind, you probably see change as more of a threat than something that could open new doors for you.</li>\n");
      out.write("</ul></div></div>\n");
      out.write("<h3>The Bear, Explained</h3>\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12037642/980x.jpg\" height=\"350\" width=\"600\"><br>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("The bear is a simple one to wrap your head around. It represents your problems.\n");
      out.write("<ul>\n");
      out.write("<li>\n");
      out.write("If the bear seemed scary, then your problems are probably pretty scary too.\n");
      out.write("\n");
      out.write("You're likely very worried about getting through the experience with your problems, a big scary bear, alive.\n");
      out.write("\n");
      out.write("However, if it was just a bear hanging out doing banal bear stuff, it means that you've got a good handle on your problems and you'll likely come out on top of them if you stick to your plans and remain confident.\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("If the bear was large, you probably feel your problems are huge.\n");
      out.write("\n");
      out.write("If the bear was smaller, it means you've got a good handle on the little problems in your life.\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<h3>The Urn, Explained</h3>\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12038103/980x.jpg\" height=\"350\" width=\"600\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("Urns are traditionally used to house the remains of people who have passed away.\n");
      out.write("\n");
      out.write("In this case, the urn is representative of those who have come before you.\n");
      out.write("\n");
      out.write("They are the people who lived so that you could also live. They are long since gone.\n");
      out.write("\n");
      out.write("The urn could represent your parents or your grandparents or relatives you never knew.\n");
      out.write("<ul>\n");
      out.write("<li>\n");
      out.write("If the urn was large, it is an indication that your family is important to you, and that the people who came before you carry a lot of weight in your mind.\n");
      out.write("\n");
      out.write("If it was small, your ancestry probably isn't that important to you.\n");
      out.write("\n");
      out.write("If the urn is made of something strong, it means you hold your ancestry in high regard.\n");
      out.write("\n");
      out.write("If it is a weak substance and crumbling, that reflects your feelings on your family.</li>\n");
      out.write("<li>\n");
      out.write("\n");
      out.write("What was inside of the urn, if anything, represents how you feel about your past generations.\n");
      out.write("\n");
      out.write("If there was nothing there, you may not feel very connected to the people who came before you.\n");
      out.write("\n");
      out.write("If it was full of water or a liquid of some kind, it means you believe you have something to gain from the people who came before you.\n");
      out.write("\n");
      out.write("If it was filled with ash or sand, it may mean that you feel like it's not that important, that it's old, gone, and no longer relevant to you, like the dead.\n");
      out.write("</li>\n");
      out.write("</ul></div></div>\n");
      out.write("<h3>The House, Explained</h3>\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("<img src=\"https://assets.rbl.ms/12038130/980x.jpg\" height=\"350\" width=\"600\"><br>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("Chances are you were a little bit thrown by this house at the end of your path.\n");
      out.write("\n");
      out.write("Seems like a weird situation, right? Well, let's break it down.\n");
      out.write("\n");
      out.write("The house itself represents the size of your dreams.\n");
      out.write("<ul>\n");
      out.write("<li>A large house indicates that you have big big dreams of wealth and prosperity and higher responsibilities.\n");
      out.write("\n");
      out.write("A smaller house may show you that you want a more humble lifestyle.\n");
      out.write("\n");
      out.write("Let's now look at what's inside the house.\n");
      out.write("</li>\n");
      out.write("<li>So there's a crazy madman in this house. That was something, wasn't it?\n");
      out.write("\n");
      out.write("The madman represents how you feel about the rest of humanity.\n");
      out.write("\n");
      out.write("If you opened the door, it shows your kindness and your willingness to help even the most far gone.\n");
      out.write("\n");
      out.write("If you left it closed before being sucked into the whiteness, it means that you hold a greater degree of caution than most.\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("</div></div>\n");
      out.write("<h3>The Whiteness, Explained</h3>\n");
      out.write("\n");
      out.write("<div style=\"column-count:2\">\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("<img src=\"https://assets.rbl.ms/12038200/980x.jpg\" height=\"350\" width=\"600\"><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("You can probably guess what the whiteness at the end of your path indicates.\n");
      out.write("\n");
      out.write("It represents your death, specifically that nothing changes once you are gone.\n");
      out.write("<ul>\n");
      out.write("<li>Almost everyone wants to find a way out of this ever-encompassing whiteness.\n");
      out.write("\n");
      out.write("A handful do not, simply accepting that this situation is what it is and to just go with it.\n");
      out.write("\n");
      out.write("If you accept it, you've probably accepted the inevitability of death.\n");
      out.write("\n");
      out.write("If you fought it, it probably means that you've got a lot of life to live still and that you aren't ready for a change as big as death.\n");
      out.write("</li>\n");
      out.write("</ul></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<img src=\"\">\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch(Exception ee){}
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
