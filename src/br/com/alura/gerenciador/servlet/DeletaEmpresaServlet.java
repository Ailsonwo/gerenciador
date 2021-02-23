package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletaEmpresa")
public class DeletaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		response.sendRedirect("/gerenciador/listaEmpresa");
	}
}
