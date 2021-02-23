
<%@page import="br.com.alura.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<h1>Lista de Empresas:</h1>
	<ul>
		<c:if test="${not empty listaEmpresa}">
			<c:forEach items="${listaEmpresa}" var="empresa">
				<li>${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura }" pattern = "dd/MM/yyyy" /> 
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">editar</a>
				<a href="/gerenciador/deletaEmpresa?id=${empresa.id }">deletar</a></li>
			</c:forEach>
		</c:if>
	</ul>
</html></body>