<%@page import="model.ShoppingCart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bras Bres Resto</title>
        <link rel="icon" href="images/758897.jpg" type="image/x-icon">
        <link href="css/styleShoppingCart.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="WEB-INF/headerLogined.jsp"/>

        <%
            ArrayList<ShoppingCart> keranjang = (ArrayList<ShoppingCart>) session.getAttribute("shoppingCart");

            if (keranjang == null) {
        %>
    <center style="padding-top: 100px; padding-bottom: 100px;">
        <h1>Troli anda kosong, silakan berbelanja.</h1>
        <button type="button" class="btn btn-primary"><a href="index.jsp#menu" style="color: white">LANJUTKAN BELANJA</a></button>
    </center>

    <%} else {%>

    <div class="container" style="padding-top: 64px;">
        <table id="cart" class="table table-hover table-condensed">
            <thead>
                <tr>
                    <th style="width:50%">Product</th>
                    <th style="width:8%">Jumlah</th>
                    <th style="width:22%" class="text-center">Harga</th>
                    <th style="width:10%"></th>
                </tr>
            </thead>
            <tbody>

                <%
                    String nama = null, qty = null, harga = null;

                    for (int i = 0; i < keranjang.size(); i++) {
                        nama = keranjang.get(i).getNama();
                        qty = keranjang.get(i).getQty();
                        harga = keranjang.get(i).getHarga();
                %>

                <jsp:useBean id="bag" scope="request" class="model.ShoppingCart"/>
                <jsp:setProperty name="bag" property="nama" value="<%=nama%>"/>
                <jsp:setProperty name="bag" property="qty" value="<%=qty%>"/>
                <jsp:setProperty name="bag" property="harga" value="<%=harga%>"/>
                <tr>
                    <td data-th="Product">
                        <div class="row">                            
                            <div class="col-sm-10">
                                <h4 class="nomargin"><jsp:getProperty name="bag" property="nama"/></h4>
                            </div>
                        </div>
                    </td>
                    <td data-th="Quantity">
                        <input type="number" class="form-control text-center" value="1">
                    </td>
                    <td data-th="Subtotal" class="text-center">Rp. <jsp:getProperty name="bag" property="harga"/></td>
                    <td class="actions" data-th="">
                        <form action="./deleteShoppingCartServlet">
                            <button class="btn btn-danger btn-sm" type="submit" name="deleteProduct" value="<%=i%>" data-toggle="tooltip" title="Hapus pesanan"><i class="fa fa-trash-o"></i></button>								
                        </form>
                    </td>
                </tr>
                <%  }%>            
            </tbody>        
            <tfoot>
                <tr class="visible-xs">
                    <%
                        int hargaTotal = 0;
                        for (int i = 0; i < keranjang.size(); i++) {
                            hargaTotal = hargaTotal + (Integer.parseInt(keranjang.get(i).getHarga()));
                        }
                    %>
                    <td class="text-center"><strong>Total Rp. <%=hargaTotal%></strong></td>
                </tr>
                <tr>
                    <td><a href="index.jsp#menu" class="btn btn-warning"><i class="fa fa-angle-left"></i> Lanjutkan belanja</a></td>
                    <td colspan="1" class="hidden-xs"></td>
                    <td class="hidden-xs text-center"><strong>Total Rp. <%=hargaTotal%></strong></td>
                    <td>
                        <form action="./purchaseServlet">
                            <button class="btn btn-success btn-block" data-toggle="tooltip" title="Pembayaran" type="submit" name="purchase">Pembayaran <i class="fa fa-angle-right"></i></button>
                        </form>
                    </td>
                </tr>
            </tfoot>
        </table>
    </div>
    <%}%>
    <jsp:include page="WEB-INF/footer.html"/>
</body>
</html>
