package br.com.alura.gerenciador.servlet;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa Alura = new Empresa("Alura");
		Empresa Caelum = new Empresa("Caelum");
		lista.add(Alura);
		lista.add(Caelum);
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return lista;
	}
	
	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			if(empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}
}
