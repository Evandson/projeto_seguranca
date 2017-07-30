<%-- 
    Document   : home
    Created on : 28/07/2017, 20:31:38
    Author     : Evandson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Painel de Controle - AppSeg</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/bootstrap-responsive.min.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
              rel="stylesheet">
        <link href="../css/font-awesome.css" rel="stylesheet">
        <link href="../css/style.css" rel="stylesheet">
        <link href="../css/pages/dashboard.css" rel="stylesheet">
        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
              <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
            <![endif]-->
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
                            class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span> </a><a class="brand" href="home.jsp">AppSeg </a>
                    <div class="nav-collapse">
                        <ul class="nav pull-right">

                            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                                        class="icon-user"></i> Conta <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="${pageContext.request.contextPath}/controller?action=Autentication&access=Logout">Sair</a></li>
                                </ul>
                            </li>
                        </ul>
                        <form class="navbar-search pull-right">
                            <input type="text" class="search-query" placeholder="Pesquisar">
                        </form>
                    </div>
                    <!--/.nav-collapse --> 
                </div>
                <!-- /container --> 
            </div>
            <!-- /navbar-inner --> 
        </div>
        <!-- /navbar -->
        <div class="subnavbar">
            <div class="subnavbar-inner">
                <div class="container">
                    <ul class="mainnav">
                        <li class="active"><a href="home.jsp"><i class="icon-home"></i><span>Início</span> </a> </li>
                    </ul>
                </div>
                <!-- /container --> 
            </div>
            <!-- /subnavbar-inner --> 
        </div>
        <!-- /subnavbar -->
        <div class="main">
            <div class="main-inner">
                <div class="container">
                    <div class="row">

                        <div class="span12">
                            <div class="widget">
                                <div class="widget-header"> <i class="icon-dashboard"></i>
                                    <h3>Painel de Controle</h3>
                                </div>
                                <!-- /widget-header -->
                                <div class="widget-content">
                                    <div class="shortcuts"> <a href="javascript:;" class="shortcut"><i class="shortcut-icon icon-list-alt"></i><span
                                                class="shortcut-label">Criar Hash</span> </a><a href="javascript:;" class="shortcut"><i
                                                class="shortcut-icon icon-bookmark"></i><span class="shortcut-label">Criar/Verificar Certificados</span> </a><a href="javascript:;" class="shortcut"><i class="shortcut-icon icon-check"></i> <span class="shortcut-label">Assinatura/Verificação de Certificados</span> </a><a href="javascript:;" class="shortcut"> <i class="shortcut-icon icon-edit"></i><span class="shortcut-label">Gerenciar</span> </a>
                                    </div>
                                    <!-- /shortcuts --> 
                                </div>
                                <!-- /widget-content --> 
                            </div>
                            <!-- /widget -->

                        </div>
                        <!-- /widget -->
                    </div>
                    <!-- /span6 --> 
                </div>
                <!-- /row --> 
            </div>
            <!-- /container --> 
        </div>
        <!-- /main-inner --> 
    </div>
    <!-- /main -->

    <div class="navbar-fixed-bottom">
        <div class="footer-inner">
            <div class="container">
                <div class="row">
                    <div class="span12"> &copy; 2017 <a href="#">AppSeg</a>. </div>
                    <!-- /span12 --> 
                </div>
                <!-- /row --> 
            </div>
            <!-- /container --> 
        </div>
        <!-- /footer-inner --> 
    </div> 
    <!-- /footer --> 
    <!-- Le javascript
    ================================================== --> 
    <!-- Placed at the end of the document so the pages load faster --> 
    <script src="../js/jquery-1.7.2.min.js"></script> 
    <script src="../js/excanvas.min.js"></script> 
    <script src="../js/bootstrap.js"></script>
</body>
</html>
