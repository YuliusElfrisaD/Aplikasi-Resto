package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ShoppingCart;
import java.util.ArrayList;

public final class shoppingCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bras Bres Resto</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/758897.jpg\" type=\"image/x-icon\">\n");
      out.write("        <link href=\"css/styleShoppingCart.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/headerLogined.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");

            ArrayList<ShoppingCart> keranjang = (ArrayList<ShoppingCart>) session.getAttribute("shoppingCart");

            if (keranjang != null) {
        
      out.write("\n");
      out.write("    <center style=\"padding-top: 100px; padding-bottom: 100px;\">\n");
      out.write("        <h1>Troli anda kosong, silakan berbelanja.</h1>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\"><a href=\"index.jsp#menu\" style=\"color: white\">LANJUTKAN BELANJA</a></button>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\" style=\"padding-top: 64px;\">\n");
      out.write("        <table id=\"cart\" class=\"table table-hover table-condensed\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"width:50%\">Product</th>\n");
      out.write("                    <th style=\"width:8%\">Jumlah</th>\n");
      out.write("                    <th style=\"width:22%\" class=\"text-center\">Harga</th>\n");
      out.write("                    <th style=\"width:10%\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");

                    String nama = null, qty = null, harga = null;

                    for (int i = 0; i < keranjang.size(); i++) {
                        nama = keranjang.get(i).getNama();
                        qty = keranjang.get(i).getQty();
                        harga = keranjang.get(i).getHarga();
                
      out.write("\n");
      out.write("\n");
      out.write("                ");
      model.ShoppingCart bag = null;
      synchronized (request) {
        bag = (model.ShoppingCart) _jspx_page_context.getAttribute("bag", PageContext.REQUEST_SCOPE);
        if (bag == null){
          bag = new model.ShoppingCart();
          _jspx_page_context.setAttribute("bag", bag, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bag"), "nama",
nama);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bag"), "qty",
qty);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("bag"), "harga",
harga);
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td data-th=\"Product\">\n");
      out.write("                        <div class=\"row\">                            \n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <h4 class=\"nomargin\">");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((model.ShoppingCart)_jspx_page_context.findAttribute("bag")).getNama())));
      out.write("</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                    <td data-th=\"Quantity\">\n");
      out.write("                        <input type=\"number\" class=\"form-control text-center\" value=\"1\">\n");
      out.write("                    </td>\n");
      out.write("                    <td data-th=\"Subtotal\" class=\"text-center\">Rp. ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((model.ShoppingCart)_jspx_page_context.findAttribute("bag")).getHarga())));
      out.write("</td>\n");
      out.write("                    <td class=\"actions\" data-th=\"\">\n");
      out.write("                        <form action=\"./deleteShoppingCartServlet\">\n");
      out.write("                            <button class=\"btn btn-danger btn-sm\" type=\"submit\" name=\"deleteProduct\" value=\"");
      out.print(i);
      out.write("\" data-toggle=\"tooltip\" title=\"Hapus pesanan\"><i class=\"fa fa-trash-o\"></i></button>\t\t\t\t\t\t\t\t\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
  }
      out.write("            \n");
      out.write("            </tbody>        \n");
      out.write("            <tfoot>\n");
      out.write("                <tr class=\"visible-xs\">\n");
      out.write("                    ");

                        int hargaTotal = 0;
                        for (int i = 0; i < keranjang.size(); i++) {
                            hargaTotal = hargaTotal + (Integer.parseInt(keranjang.get(i).getHarga()));
                        }
                    
      out.write("\n");
      out.write("                    <td class=\"text-center\"><strong>Total Rp. ");
      out.print(hargaTotal);
      out.write("</strong></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"index.jsp#menu\" class=\"btn btn-warning\"><i class=\"fa fa-angle-left\"></i> Lanjutkan belanja</a></td>\n");
      out.write("                    <td colspan=\"1\" class=\"hidden-xs\"></td>\n");
      out.write("                    <td class=\"hidden-xs text-center\"><strong>Total Rp. ");
      out.print(hargaTotal);
      out.write("</strong></td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"./purchaseServlet\">\n");
      out.write("                            <button class=\"btn btn-success btn-block\" data-toggle=\"tooltip\" title=\"Pembayaran\" type=\"submit\" name=\"purchase\">Pembayaran <i class=\"fa fa-angle-right\"></i></button>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/footer.html", out, false);
      out.write("\n");
      out.write("</body>\n");
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
