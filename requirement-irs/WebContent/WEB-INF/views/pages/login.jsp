<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>iRs</title>
<!-- Bootstrap Core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- MetisMenu CSS -->
<link
	href="${pageContext.request.contextPath}/resources/bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link
	href="${pageContext.request.contextPath}/resources/dist/css/sb-admin-2.css"
	rel="stylesheet">
<!-- Custom Fonts -->
<link
	href="${pageContext.request.contextPath}/resources/bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
      <![endif]-->

<style>
body {
	background-image:
		url("${pageContext.request.contextPath}/resources/images/background.jpg");
	background-repeat: no-repeat;
}
</style>
</head>
<body style="background-color: white;">
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please Sign In</h3>
					</div>
					<div class="panel-body">
						<form:form role="form" action="${pageContext.request.contextPath}/login" modelAttribute="user" method="POST">
							<fieldset>
								<div class="form-group">
									<form:input class="form-control" placeholder="Username" name="user_name"
										path="userName"  />
								</div>
								<div class="form-group">
									<form:input class="form-control" placeholder="Password"
										path="password" name="pass_word" type="password" value="" />
								</div>
								<div class="form-group">
									<form:select class="form-control" name="ro_le" path="role">
										<option value="0">Select a role</option>
										<option value="ba">Business Analyst</option>
										<option value="dev">Developer</option>
									</form:select>
								</div>
								<div class="checkbox">
									<label> <input name="remember" type="checkbox"
										value="Remember Me">Remember Me
									</label>
								</div>
									<input class="col-md-12 btn btn-success" type="submit" value="Login" />
							</fieldset>
						</form:form>
					</div>
				</div>
			</div>
			<!-- ben -->
			<div class="col-md-4" style="padding-top: 12%;">
				
				<div class="row">
					<div class="col-md-12">
						<img alt="logo" src="${pageContext.request.contextPath}/resources/images/irs_logo.jpg">
					
					
					</div>				
				</div>	
				<div class="row">
					<div class="col-md-12">
									<h1>Welcome to <strong>iRs</strong> </h1>

				<br />
				<p>We help you to gather and analyze requirements
				<ul>
					<li>With the integration of complete SDLC cycle</li>
					<li>Enhanced imformation processing using machine learning</li>
					<li>Support using chat bots</li>
					<li>Making use of the advantages of Data Analytics</li>
				</ul>
				</p>
					
					
					</div>				
				</div>	



			</div>
			<!-- ben -->

		</div>
		<!-- row close-->
	</div>
	<!-- container close-->
	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/resources/bower_components/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script
		src="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script
		src="${pageContext.request.contextPath}/resources/bower_components/metisMenu/dist/metisMenu.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script
		src="${pageContext.request.contextPath}/resources/dist/js/sb-admin-2.js"></script>
</body>
</html>