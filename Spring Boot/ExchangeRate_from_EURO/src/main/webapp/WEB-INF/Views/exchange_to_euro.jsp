<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Euro to USD conversion</title>
</head>
<body>
<h2>Conversion Euro to USD</h2>
<hr>
Euro       <input type="text" value="1" disabled="disabled">
US Dollar  <input type="text" value="${etu.getRate()}" disabled="disabled">
</body>
</html>