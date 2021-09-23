package exercicio3;

import java.util.Scanner;

public class UsaRelogio {
	public static void main(String[] args) {
		
		HoraMinuto horario =new HoraMinuto(23,40);
		
		
		int opcao;
		do { 
			System.out.println("<================>Menu<================>");
			System.out.println("Escolha as opcões:" );
			System.out.println("1 para imprimir hora");
			System.out.println("2 para proximo minuto");
			System.out.println("3 mudar hora");
			System.out.println("4 mudar min");
			Scanner novo = new Scanner(System.in);
			opcao = novo.nextInt();
			switch (opcao) {
			case 1:
				horario.imprimir();
				break;
			case 2:
				horario.proximoMinuto();
				break;
			case 3:
				horario.mudarHora();
				break;
				
			case 4:
				horario.mudarMin();
				break;
				
			default:
				System.err.println("Opção invalida");
			
			}
			
		
		} while(opcao != 0);
		
		
		
	
		
		
		
		
		//horario.imprimir();
		//horario.proximoMinuto();
		//horario.imprimir();
		//horario.mudarHora();
		//horario.mudarMin();
		//horario.imprimir();
		//horario.horasDia();
		
	}
	
	
	
	
	
	
}
