package exercicio3;

import java.util.Scanner;

public class HoraMinuto {

	private int hora;
	private int min;
	
	

	public HoraMinuto(int hora, int min) {
		super();
		this.hora = hora;
		this.min = min;

	}

	public void proximoMinuto() {

		min += 1;

		if (min == 60) {

			hora += 1;

			min = 0;
			if (hora == 24) {
				hora = 0;
			}

		}

	}

	public void imprimir() {

		System.out.println(hora + ":" + min);

	}

	public void horasDia() {

		for (int i = 0; i == 24; i++) {

			System.out.println("A hora atual: " + i);
		}
	}

	public void mudarMin() {

		Scanner novo = new Scanner(System.in);
		System.out.println("Sete o novo minuto:");
		min = novo.nextInt();

		if (min <= 60) {
			
			System.out.println("Novo minuto setado para:" + min);
		} else {
			System.err.println("Minuto inválido");
		}

	}
	
	public void mudarHora(){
		
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Sete a nova hora:");
		hora = novo.nextInt();
		
		
		if (hora <= 24) {
			
			System.out.println("Nova hora setada para:" + hora);
		} else {
			System.err.println("Hora inválida");
		}

	}
		
		
		
		
	

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

}
