<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<c:url value="/resource/css/login.css"></c:url>">
</head>
<body id="nen">
	<div id="body">
		<div id="menu">
			<ul>
				<li><a href="MainPage" title="Home">Home</a></li>
				<li><a href="#" title="Blog">Blog</a></li>
				<li><a href="#" title="About">About</a></li>
				<li><a href="login" title="Register">Login</a></li>
				<li><a href="#" title="Contact">Logout</a></li>
				<li><a href="#" title="Contact">Registration</a></li>
			</ul>
		</div>
		<div
		id="nhap">
		<h1 id="slogen">Login to Gift Every One</h1>
		<hr>
		<form:form id="form" modelAttribute="user" method="post" action="MainPage">
			<form:input id="forminput" path="nameUser"/>
			<form:password id="formpass" path="passUser"/>
			<br>
			<button id="buttonlogin"  type="submit">Login</button>
		</form:form>
	</div>
	</div>
</body>
</html>