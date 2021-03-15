package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bras Bres Resto</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/758897.jpg\" type=\"image/x-icon\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\n");
      out.write("\n");
      out.write("        ");

            HttpSession user = request.getSession();
            if (user.getAttribute("user") != null) {
        
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/headerLogined.jsp", out, false);
      out.write("     \n");
      out.write("        ");
} else { 
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/header.html", out, false);
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"w3-display-container w3-container\">\n");
      out.write("            <img src=\"images/logo.jpg\" alt=\"Menu\" style=\"width:100%\">\n");
      out.write("            <div class=\"w3-display-topleft w3-text-white\" style=\"padding:24px 48px\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <center>\n");
      out.write("            <div class=\"w3-row\" id=\"menu\" style=\"padding-top:64px; padding-bottom: 100px\">\n");
      out.write("                <h1 class=\"w3-center w3-jumbo\" style=\"margin-bottom:64px\">THE MENU</h1>\n");
      out.write("                <form action=\"./shoppingCartServlet\" method=\"get\">\n");
      out.write("                    <div class=\"w3-col l3\">\n");
      out.write("                        <div class=\"w3-container\">\n");
      out.write("                            <div class=\"w3-display-container\">\n");
      out.write("                                <img src=\"images/burger.jpg\" style=\"width:70%\">\n");
      out.write("                                <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("                                    <button class=\"w3-button w3-black\" type=\"submit\" name=\"buy\" value=\"MKN-1\">Buy now <i class=\"fa fa-shopping-cart\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <h2>BURGER<br><b>Rp. 13.000</b></h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-col l3\">\n");
      out.write("                        <div class=\"w3-container\">\n");
      out.write("                            <div class=\"w3-display-container\">\n");
      out.write("                                <img src=\"images/hotdog.jpg\" style=\"width:70%\">\n");
      out.write("                                <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("                                    <button class=\"w3-button w3-black\" type=\"submit\" name=\"buy\" value=\"MKN-2\">Buy now <i class=\"fa fa-shopping-cart\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <h2>HOTDOG<br><b>Rp. 12.000</b></h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-col l3\">\n");
      out.write("                        <div class=\"w3-container\">\n");
      out.write("                            <div class=\"w3-display-container\">\n");
      out.write("                                <img src=\"images/mie goreng.jpg\" style=\"width:70%\">\n");
      out.write("                                <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("                                    <button class=\"w3-button w3-black\" type=\"submit\" name=\"buy\" value=\"MKN-3\">Buy now <i class=\"fa fa-shopping-cart\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <h2>MIE GORENG<br><b>Rp. 7.000</b></h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-col l3\">\n");
      out.write("                        <div class=\"w3-container\">\n");
      out.write("                            <div class=\"w3-display-container\">\n");
      out.write("                                <img src=\"images/mi kuah.jpg\" style=\"width:70%\">\n");
      out.write("                                <div class=\"w3-display-middle w3-display-hover\">\n");
      out.write("                                    <button class=\"w3-button w3-black\" type=\"submit\" name=\"buy\" value=\"MKN-4\">Buy now <i class=\"fa fa-shopping-cart\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <h2>MIE KUAH<br><b>Rp. 7.000</b></h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/footer.html", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
