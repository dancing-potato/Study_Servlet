<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>test2.jsp</h1>
	
	<!-- form 태그를 활용한 서블릿 주소 요청 시 GET 방식은 method="get" 또는 생략 -->
	<form action="myServlet2">
		<input type="submit" value="myServlet2 서블릿 주소 요청(GET)">
	</form>
	
	<!-- form 태그를 활용한 서블릿 주소 요청 시 POST 방식은 method="post" 필수 -->
	<form action="myServlet2" method="post">
		<input type="submit" value="myServlet2 서블릿 주소 요청(POST)">
	</form>
	
</body>
</html>