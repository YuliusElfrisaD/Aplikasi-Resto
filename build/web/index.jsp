<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bras Bres Resto</title>
        <link rel="icon" href="images/758897.jpg" type="image/x-icon">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body data-spy="scroll" data-target=".navbar" data-offset="50">

        <%
            HttpSession user = request.getSession();
            if (user.getAttribute("user") != null) {
        %>        
        <jsp:include page="WEB-INF/headerLogined.jsp"/>     
        <%} else { %>            
        <jsp:include page="WEB-INF/header.html"/>
        <%}%>

        <div class="w3-display-container w3-container">
            <img src="images/logo.jpg" alt="Menu" style="width:100%">
            <div class="w3-display-topleft w3-text-white" style="padding:24px 48px">
            </div>
        </div>
        <center>
            <div class="w3-row" id="menu" style="padding-top:64px; padding-bottom: 100px">
                <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">THE MENU</h1>
                <form action="./shoppingCartServlet" method="get">
                    <div class="w3-col l3">
                        <div class="w3-container">
                            <div class="w3-display-container">
                                <img src="images/burger.jpg" style="width:70%">
                                <div class="w3-display-middle w3-display-hover">
                                    <button class="w3-button w3-black" type="submit" name="buy" value="MKN-1">Buy now <i class="fa fa-shopping-cart"></i></button>
                                </div>
                            </div>
                            <h2>BURGER<br><b>Rp. 13.000</b></h2>
                        </div>
                    </div>
                    <div class="w3-col l3">
                        <div class="w3-container">
                            <div class="w3-display-container">
                                <img src="images/hotdog.jpg" style="width:70%">
                                <div class="w3-display-middle w3-display-hover">
                                    <button class="w3-button w3-black" type="submit" name="buy" value="MKN-2">Buy now <i class="fa fa-shopping-cart"></i></button>
                                </div>
                            </div>
                            <h2>HOTDOG<br><b>Rp. 12.000</b></h2>
                        </div>
                    </div>
                    <div class="w3-col l3">
                        <div class="w3-container">
                            <div class="w3-display-container">
                                <img src="images/mie goreng.jpg" style="width:70%">
                                <div class="w3-display-middle w3-display-hover">
                                    <button class="w3-button w3-black" type="submit" name="buy" value="MKN-3">Buy now <i class="fa fa-shopping-cart"></i></button>
                                </div>
                            </div>
                            <h2>MIE GORENG<br><b>Rp. 7.000</b></h2>
                        </div>
                    </div>
                    <div class="w3-col l3">
                        <div class="w3-container">
                            <div class="w3-display-container">
                                <img src="images/mi kuah.jpg" style="width:70%">
                                <div class="w3-display-middle w3-display-hover">
                                    <button class="w3-button w3-black" type="submit" name="buy" value="MKN-4">Buy now <i class="fa fa-shopping-cart"></i></button>
                                </div>
                            </div>
                            <h2>MIE KUAH<br><b>Rp. 7.000</b></h2>
                        </div>
                    </div>                
                </form>
            </div>
        </center>

        <jsp:include page="WEB-INF/footer.html"/>
    </body>
</html>
