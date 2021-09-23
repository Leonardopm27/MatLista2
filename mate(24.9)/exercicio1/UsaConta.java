package exercicio1;

public class UsaConta {
	
	public static void main(String[] args) {
		
		
		ContaCorrente conta = new ContaCorrente(80.0f, "Leonardo ");
		
		conta.sacar();
		
		conta.depositar();
		System.out.println(conta.getSaldo());
		
		conta.ImprimirOperacao();
		
	}
	
	
	

}
