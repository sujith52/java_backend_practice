<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page </title>
</head>
<body>
<h1><marquee>Registration was sucessfull!</marquee></h1>
<% String name = (String)session.getAttribute("name"); %>
<h2>Hey user <%= name  %>, You have sucessfully created into this web page bro !</h2>
</body>
</html>