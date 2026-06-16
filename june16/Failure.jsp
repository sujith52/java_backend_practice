<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure </title>
</head>
<body>

<h1><marquee>Registration was Failed bro!</marquee></h1>
<% String name = (String)session.getAttribute("name"); %>
<h2>Hey user <%= name  %>, You have failed man see you later bro !</h2>
</body>
</html>