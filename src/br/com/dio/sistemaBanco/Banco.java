package br.com.dio.sistemaBanco;

import java.util.List;

public class Banco {
	
	//ATRIBUTOS
	private String nome = "Banco Java";
	private List<Conta> contas;

	//GET & SET
	public String getNome() {
		return nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	//MÉTODOS
	
	
}
