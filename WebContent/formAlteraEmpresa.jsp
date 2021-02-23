<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<c:url value ="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<head>
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletAlteraEmpresa} " method="post">
		Nome:<input type="text" name="nome" value="${empresa.nome }">
		Data de Abertura:<input type="text" name="data" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${empresa.dataAbertura }"/>">
		<input type="hidden" name="id" value="${empresa.id }">
		<input type="submit">
	</form>
</body>