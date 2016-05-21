<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Login</title>
</head>

<body>
	<form:form method="POST" modelAttribute="user" action="login">
		<form> <input type="submit" value="Login" class="btnStyle submit"/></form>
	</form:form>
</body>
</html>