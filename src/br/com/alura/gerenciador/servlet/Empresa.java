package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {

	private static Integer sequence = 0;
	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();
	
	Empresa(String nome){
		this.id = sequence++;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
