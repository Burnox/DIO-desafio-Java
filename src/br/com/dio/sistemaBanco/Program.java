package br.com.dio.sistemaBanco;

public class Program {

	public static void main(String[] args) {

		
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		Conta cc = new ContaCorrente(bruno);
		Conta cp = new ContaPoupanca(bruno);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	
	}

}
