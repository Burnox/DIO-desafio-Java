package br.com.dio.sistemaBanco;
public class ContaCorrente extends Conta {
	
	private double chequeEspecial;
	
	//CONSTRUTOR
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	// GET & SET
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoEspecial() {
		return saldo + chequeEspecial;
	}
	
	//MÉTODOS
	@Override
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		super.imprimirInfos();
		System.out.println(String.format("Saldo Especial: %.2f", chequeEspecial));
	}

	
	

}
