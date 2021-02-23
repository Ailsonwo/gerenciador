<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value ="/novaEmpresa" var="linkServletNovaEmpresa"/>

<head>
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa} " method="post">
		Nome:<input type="text" name="nome">
		Data de Abertura:<input type="text" name="data" >
		<input type="submit">
	</form>
</body>