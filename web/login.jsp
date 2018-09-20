<%--
  Created by IntelliJ IDEA.
  User: Sanil
  Date: 9/20/2018
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.virinchi.pizza.common.dto.ErrorDto" %>
<%@ include file="common.jsp"%>


<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/global.css">
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<%
    ErrorDto errorDto=(ErrorDto) request.getAttribute("errorDto");
    String responseMsg=(String) request.getAttribute("responseMsg");
    ErrorDto dbError = (ErrorDto) getServletConfig().getServletContext().getAttribute("dbError");

    if(dbError != null && dbError.isHasError()){
        errorFile=dbError.getFileName();
        errorDesc=dbError.getErrorDesc();

%>
    <%@include file="error.jsp"%>
<%
        errorDto=null;
    }
%>
<%
    if(errorDto!=null && errorDto.isHasError())
    {
        errorFile=errorDto.getFileName();
        errorDesc=errorDto.getErrorDesc();
%>
    <%@include file="error.jsp"%>
<%
    }
%>
<div id="wrapper">
    <div id="login-content-wrapper">
        <div class="row">
            <div class="col-sm-7">
                <div class="dark-bg">
                    <div class="container-fluid">
                        <div class="space"></div>
                        <div class="row">
                            <div class="col-sm-offset-1 col-sm-10 text-white">
                                <h1 class="headline"><b>foodHouse</b></h1>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-offset-1 col-sm-10 text-white">
                                <h3>The best food outlet in town.</h3>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-sm-offset-1 col-sm-2 text-white">
                                <hr>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-offset-1 col-sm-10 text-white">
                                <span class="col-sm-1"><i class="fa fa-comments fa-2x"></i></span>
                                <label class="col-sm-10 verdana"> The easiest way to order your food.</label>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-sm-offset-1 col-sm-10 text-white">
                                <span class="col-sm-1"><i class="fa fa-angle-double-right fa-2x"></i></span>
                                <label class="col-sm-10 verdana"> The fastest medium to get your favourite food.</label>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-sm-offset-1 col-sm-10 text-white">
                                <span class="col-sm-1"><i class="fa fa-dollar fa-2x"></i></span>
                                <label class="col-sm-10 verdana"> The quick and easy way to pay your food bills.</label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-5">
                <div id="loginn">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="space"></div>
                        </div>
                        <div class="row">
                            <div class="col-xs-offset-2 col-xs-8 col-sm-offset-2 col-sm-8">
                                <form class="form-horizontal" method="post" action="here">
                                    <label><h1><b>Login</b></h1></label>
                                    <div class="form-group">
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user fa"
                                                                                   aria-hidden="true"></i></span>
                                                <input type="text" class="form-control input-size" name="uname"
                                                       id="uname" placeholder="Enter your user name" required/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="cols-sm-10">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock fa"
                                                                                   aria-hidden="true"></i></span>
                                                <input type="password" class="form-control input-size" name="password"
                                                       id="password" placeholder="Password" required/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-6">
                                            <button class="btn btn-md btn-success" type="submit">Login <i
                                                    class="fa fa-thumbs-up fa" aria-hidden="true"></i></button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="hidden-xs" id="bottom-grey">
                        <div class="row">
                            <div class="col-sm-offset-2 col-sm-8 text-center text-white padding-top">
                                <h3><label class="control-label">Sign up?</label></h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/thescripts.js"></script>
</body>
</html>
