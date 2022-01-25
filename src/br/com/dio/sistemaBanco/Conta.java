package br.com.dio.sistemaBanco;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	
	private static int SEQUENCIAL = 1;

	//ATRIBUTOS
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	//CONSTRUTOR
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	//GET
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	//MÉTODOS
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);	
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}

	
	
	
}
