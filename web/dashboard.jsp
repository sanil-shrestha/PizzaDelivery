<%--
  Created by IntelliJ IDEA.
  User: Sanil
  Date: 9/4/2018
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foodLand</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/global.css">
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="wrapper">
    <div id="header-wrapper">
        <div class="dark-bg-header">
        </div>
        <nav class="navbar navbar-inverse-menu navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navigation">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">foodLand</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navigation">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a class="text-white" href="#">Home</a></li>
                        <li><a class="text-white" href="#">Our Menu</a></li>
                        <li><a class="text-white" href="#">Today's Specials</a></li>
                        <li><a class="text-white" href="#">About</a></li>
                        <li><a class="text-white" href="#">Contact us</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-sm-offset-4 col-sm-4 padd-img">
                    <img class="img-responsive margin-top" src="Images/logo.png" width="100%">
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-offset-2 col-sm-8">
                        <p class="text-center text-uppercase text-white text-size">Delicious Food</p>
                    </div>
                </div>
            </div>
        </div>
    </div> <!--Header Wrapper Ends-->
    <div id="content-wrapper">
        <div class="container">
            <div class="row-fluid">
            </div>
        </div>
    </div>  <!--Content Wrapper-->

    <div id="footer-wrapper">
        <div class="container">
            <div class="row-fluid">
                This is Footer
            </div>
        </div>
    </div>  <!--Footer Wrapper Ends-->

</div> <!--Main Wrapper Ends-->

<script src="http://code.jquery.com/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/thescripts.js"></script>
</body>
</html>
