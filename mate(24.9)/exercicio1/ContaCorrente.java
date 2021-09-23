package exercicio1;

import java.util.Scanner;

public class ContaCorrente {

	private float saldo;
	private String historico ;

	public ContaCorrente() {
		super();
		System.out.println("Saldo Vazio");
	}

	public ContaCorrente(float saldo, String historico) {
		super();
		this.historico = historico;
		this.saldo = saldo;
		System.out.println("Seu saldo é de: " + saldo);
	}

	public void sacar() {

		Scanner texto = new Scanner(System.in);
		System.out.println("Escreva o valor que deseja sacar: ");
		float valor = texto.nextFloat();

		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("O valor retirado foi de: " + valor);

			System.out.println("Seu novo saldo é de: " + this.saldo);
			
			this.historico += "\n Saque de: " + valor; 
			
		} else {
			System.out.println("Saldo inválido");
		}

	}

	public void depositar() {
		Scanner texto = new Scanner(System.in);
		System.out.println("Escreva o valor que deseja depositar: ");
		float valor = texto.nextFloat();

		this.saldo += valor;
		
		this.historico += "\n Depósito de: " + valor ; 


		System.out.println("Seu novo saldo é de: " + saldo);
		
		
	}
	
	public void ImprimirOperacao() {
		
		System.out.println("O seu histórico é: " + "\n" + this.historico);
	}
	
	

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
