<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <center>
            <div class="w3-container w3-centered" style="padding-top: 64px; padding-bottom: 100px;">
                <h1>Rekap Keuangan</h1> 
                <table class="w3-table-all" style="width: 50%;">
                    <thead>
                        <tr class="w3-black">
                            <th>ID PESANAN</th>
                            <th>CUSTOMER</th>
                            <th>TOTAL HARGA</th>
                        </tr>
                    </thead>
                    <tr class="w3-hover-green">
                        <td>Jill</td>
                        <td>Smith</td>
                        <td>50</td>
                    </tr>                    
                </table>
            </div>
        </center>
        <jsp:include page="WEB-INF/footer.html"/> 
    </body>
</html>
