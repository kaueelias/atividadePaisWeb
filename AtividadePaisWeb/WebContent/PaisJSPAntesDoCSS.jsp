<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="model.Pais" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PaisJSP</title>
</head>
<body>
	<h3>TESTE JSP</h3>
	<%
		Pais pais = (Pais)request.getAttribute("Pais");
	%>
	Id: <%=pais.getId() %><br>
	Nome: <%=pais.getNome() %><br>
	População: <%=pais.getPopulacao() %><br>
	Area: <%=pais.getArea() %><br>
</body>
</html>