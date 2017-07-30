<%-- 
    Document   : index
    Created on : 28/07/2017, 23:32:42
    Author     : Evandson
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  
<head>
    <meta charset="utf-8">
    <title>AppSeg</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes"> 
    
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

<link href="css/font-awesome.css" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="css/pages/signin.css" rel="stylesheet" type="text/css">

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
			
			<a class="brand" href="index.jsp">
				AppSeg				
			</a>		
			
			<div class="nav-collapse">
				<ul class="nav pull-right">
					
					<li class="">						
						<a href="cadastro.jsp" class="">
							Não tem uma conta?
						</a>
						
					</li>
					
					<!--<li class="">						
						<a href="index.html" class="">
							<i class="icon-chevron-left"></i>
							Back to Homepage
						</a>
						
					</li>-->
				</ul>
				
			</div><!--/.nav-collapse -->	
	
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->



<div class="account-container">
	
	<div class="content clearfix">
            <p> <c:if test="${mensagem.existeErros}">
                                <div id="erro">
                                    <c:forEach var="erro" items="${mensagem.erros}"><br/>
                                     <div class="alert alert-danger">
                                                  <button type="button" class="close" data-dismiss="alert">&times;</button>
                                                  <strong>Atenção!</strong> Usuário e/ou Senha não existe(m)!
                                                </div>
                                    </c:forEach>
                                </div>
                             </c:if>
                            <br></p>
		
		<form action="${pageContext.request.contextPath}/controller?action=Autentication&access=Login" method="POST">
		
			<h1>Usuário Login</h1>		
			
			<div class="login-fields">
				
				<p>Forneça seus detalhes</p>
				
				<div class="field">
					<label for="username">Email:</label>
					<input type="text" id="username" name="email" value="" placeholder="Email" class="login username-field" required/>
				</div> <!-- /field -->
				
				<div class="field">
					<label for="password">Senha:</label>
					<input type="password" id="password" name="senha" value="" placeholder="Senha" class="login password-field" required/>
				</div> <!-- /password -->
				
			</div> <!-- /login-fields -->
			
			<div class="login-actions">
				
				<span class="login-checkbox">
					<input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4" />
					<label class="choice" for="Field">Mantenha-me conectado</label>
				</span>
									
				<button class="button btn btn-success btn-large">Entrar</button>
				
			</div> <!-- .actions -->
			
			
			
		</form>
		
	</div> <!-- /content -->
	
</div> <!-- /account-container -->



<div class="login-extra">
	<!--<a href="#">Esqueceu a Senha</a>-->
</div> <!-- /login-extra -->


<script src="js/jquery-1.7.2.min.js"></script>
<script src="js/bootstrap.js"></script>

<script src="js/signin.js"></script>

</body>

</html>
