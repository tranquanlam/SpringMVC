<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<c:url value="/resource/css/hinh.css"></c:url>">

<title>Insert title here</title>
</head>
<body id="body">

		<div id="menutop"> 
 			<ul>
				<li><a href="#" title="Home">Home</a></li>
				<li><a href="#" title="Blog" >Blog</a></li>
				<li><a href="#" title="About">About</a></li>
				<li><a href="login" title="Register">Login</a></li>
				<li><a href="#" title="Contact">Logout</a></li>
				<li><a href="singup" title="Contact">Registration</a></li>
			</ul> 
			</div>
			
			
			
			
				<div id="banner"> 
				 <img id="logo1" alt="logo" src="<c:url value="/resource/image/logo.png"></c:url>">
				</div>    
				
				<div id="main">
				
				<!-- <div id="mainleft">helo</div> -->
				<div id="mainright">
				
				
				<c:forEach items="${type }" var="type">
						<div id="Type">
					<a href="${type.trangLoaiCard }">${type.tenLoaiC}</a>
						</div>
				</c:forEach>
				</div>
				</div>
				   
			<div id="footer">helo</div>	   
				   
		  

</body>
</html>