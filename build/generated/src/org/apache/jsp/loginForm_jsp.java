package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #1E88E5;                \n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                padding-top: 100px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">BRAS-BRES RESTO</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"index.jsp\" data-toggle=\"tooltip\" title=\"Home\"><span class=\"glyphicon glyphicon-home\"></span> HOME</a></li>\n");
      out.write("                            <li><a href=\"index.jsp#menu\" data-toggle=\"tooltip\" title=\"Menu\"><span class=\"glyphicon glyphicon-list-alt\"></span> MENU</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">    \n");
      out.write("            <div id=\"loginbox\" style=\"margin-top:50px;\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">                    \n");
      out.write("                <div class=\"panel panel-info\" >\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title\">Login</div>\n");
      out.write("                    </div>   \n");
      out.write("                    <div style=\"padding-top:30px\" class=\"panel-body\" >\n");
      out.write("                        <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("                        <form id=\"loginform\" class=\"form-horizontal\" action=\"./LoginServlet\" method=\"post\">\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                <input id=\"login-username\" type=\"text\" class=\"form-control\" name=\"username\" value=\"\" placeholder=\"username\" data-toggle=\"tooltip\" title=\"Masukan username\">                                        \n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                                <input id=\"login-password\" type=\"password\" class=\"form-control\" name=\"password\" value=\"\" placeholder=\"password\" data-toggle=\"tooltip\" title=\"Masukan password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"margin-top:10px\" class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-12 controls\">\n");
      out.write("                                    <input class=\"btn btn-success\" data-toggle=\"tooltip\" title=\"tekan untuk login\" type=\"submit\" name=\"submit\" value=\"Login\"/>                                    \n");
      out.write("                                    ");
      model.Message Message = null;
      synchronized (request) {
        Message = (model.Message) _jspx_page_context.getAttribute("Message", PageContext.REQUEST_SCOPE);
        if (Message == null){
          Message = new model.Message();
          _jspx_page_context.setAttribute("Message", Message, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                                    <span style=\"color: red\">\n");
      out.write("                                        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((model.Message)_jspx_page_context.findAttribute("Message")).getPesan())));
      out.write("\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-12 control\">\n");
      out.write("                                    <div style=\"border-top: 1px solid#888; padding-top:15px; font-size:85%\" >\n");
      out.write("                                        Belum punya akun?\n");
      out.write("                                        <a href=\"#\" data-toggle=\"tooltip\" title=\"Daftar akun baru\">\n");
      out.write("                                            DAFTAR\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>                                \n");
      out.write("                    </div>  \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
