<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>

	<%@ include file="/common/header.jsp" %>
	<% String name = "SSAFY"; %>
	
	<h1>hello JSP</h1>
	<p>내 이름은 <%=name %> 입니다</p>

</body>
</html>