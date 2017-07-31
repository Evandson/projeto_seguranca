<%-- 
    Document   : hashGenerate
    Created on : 31/07/2017, 12:49:01
    Author     : Evandson
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt">

    <head>
        <meta charset="utf-8">
        <title>Criar Hash</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes"> 

        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

        <link href="../css/font-awesome.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">

        <link href="../css/style.css" rel="stylesheet" type="text/css">
        <link href="../css/pages/signin.css" rel="stylesheet" type="text/css">

    </head>

    <body>

        <div class="navbar navbar-fixed-top">

            <div class="navbar-inner">

                <div class="container">

                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>

                    <a class="brand" href="home.jsp">
                        AppSeg				
                    </a>		

                    <div class="nav-collapse">
                        <ul class="nav pull-right">

                            <li class="">						
                                <a href="home.jsp" class="">
                                    <i class="icon-chevron-left"></i>
                                    Voltar Para o Início
                                </a>

                            </li>
                        </ul>

                    </div><!--/.nav-collapse -->	

                </div> <!-- /container -->

            </div> <!-- /navbar-inner -->

        </div> <!-- /navbar -->

        <div class="account-container register">

            <div class="content clearfix">

                <form action="${pageContext.request.contextPath}/controller?action=UserLogic&access=cadHash" method="post">

                    <h1>Hash Gerado!</h1>	

                    <div class="login-fields">

                        <p>Hash do seu texto:</p>

                        <div class="field">
                        <c:forEach var="hashes" items="${hashes}">
                            
                                <div>
                                    ${hashes.codHash}
                                </div>
                           
                        </c:forEach>
                        </div> <!-- /field -->

                    </div> <!-- /login-fields -->

                    <!--<div class="login-actions">
                            
                            <span class="login-checkbox">
                                    <input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4" />
                                    <label class="choice" for="Field">Agree with the Terms & Conditions.</label>-->
                    </span>

            </div> <!-- .actions -->

        </form>

    </div> <!-- /content -->

</div> <!-- /account-container -->


<!-- Text Under Box -->
<div class="login-extra">

    <!--Já tem uma conta? <a href="index.jsp">Faça login na sua conta</a>-->
</div> <!-- /login-extra -->


<script src="../js/jquery-1.7.2.min.js"></script>
<script src="../js/bootstrap.js"></script>
<script src="../js/signin.js"></script>

</body>

</html>


