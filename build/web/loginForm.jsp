<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bras Bres Resto</title>
        <link rel="icon" href="images/758897.jpg" type="image/x-icon">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            body{
                background-color: #1E88E5;                
            }
            .container{
                padding-top: 100px;
            }
        </style>
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
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container">    
            <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Login</div>
                    </div>   
                    <div style="padding-top:30px" class="panel-body" >
                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                        <form id="loginform" class="form-horizontal" action="./LoginServlet" method="post">
                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username" data-toggle="tooltip" title="Masukan username">                                        
                            </div>
                            <div style="margin-bottom: 25px" class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="login-password" type="password" class="form-control" name="password" value="" placeholder="password" data-toggle="tooltip" title="Masukan password">
                            </div>
                            <div style="margin-top:10px" class="form-group">
                                <div class="col-sm-12 controls">
                                    <input class="btn btn-success" data-toggle="tooltip" title="tekan untuk login" type="submit" name="submit" value="Login"/>                                    
                                    <jsp:useBean id="Message" class="model.Message" scope="request" />
                                    <span style="color: red">
                                        <jsp:getProperty name="Message" property="pesan"/>
                                    </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12 control">
                                    <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                        Belum punya akun?
                                        <a href="#" data-toggle="tooltip" title="Daftar akun baru">
                                            DAFTAR
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </form>                                
                    </div>  
                </div> 
            </div>
        </div>
    </body>
</html>