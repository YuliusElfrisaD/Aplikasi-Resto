<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bras Bres Resto</title>
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="index.jsp">BRAS-BRES RESTO</a>
                </div>
                <div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav">
                            <li><a href="index.jsp" data-toggle="tooltip" title="Home"><span class="glyphicon glyphicon-home"></span> HOME</a></li>
                            <li><a href="index.jsp#menu" data-toggle="tooltip" title="Menu"><span class="glyphicon glyphicon-list-alt"></span> MENU</a></li>
                            <li data-toggle="tooltip" title="See a shopping cart"><a href="shoppingCart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Shopping Cart</a></li>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <%
                                String who = (String) session.getAttribute("user");
                            %>
                            <li data-toggle="tooltip" title="Your account"><span class="glyphicon glyphicon-user"></span> Logged as <%=who%></li>
                            <button class="btn btn-danger navbar-btn navbar-right" data-toggle="tooltip" title="Logout">
                                <a href="./LogoutServlet" style="color: white !important"><span class="glyphicon glyphicon-log-out"></span> LOGOUT</a>
                            </button>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>  
    </body>
</html>
