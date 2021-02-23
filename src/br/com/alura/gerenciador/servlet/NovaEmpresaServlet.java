package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova Empresa...");
	
		String novaEmpresa = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("data");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAbertura = null;
		try {
			dataAbertura = sdf.parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		Empresa empresa = new Empresa(novaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		response.sendRedirect("listaEmpresa");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa");
//		request.setAttribute("empresa", novaEmpresa);
//		rd.forward(request, response);
	}
}