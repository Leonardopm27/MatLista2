package Repostas;

import java.util.Scanner;

public class RespostaQuinzeAt�Dezoito {

	public static void main(String[] args) {
		System.out.println("15.Implemente um programa que receba dados digitados pelo usu�rio e atribua\r\n"
				+ "a uma vari�vel do tipo String e imprima a frase inserida no console.\r\n" + "");

		Scanner texto = new Scanner(System.in);
		String frase = texto.nextLine();
		System.out.println(frase);

		System.out.println("16.Concatene na vari�vel criada acima a frase � � Exemplo String�.\r\n" + "");

		String frase2 = frase + "-Exemplo String";
		System.out.println(frase2);

		System.out.println("17.Imprima na tela (console) o n�mero de caracteres da String.");

		String result = frase.replaceAll("\\s+", "");

		int caracteres = result.length();

		System.out.println("Texto digitado: " + frase);

		System.out.println("Total de caracteres: " + caracteres);

		System.out.println("18.Crie uma nova String, pegando o peda�o da primeira String que compreenda\r\n"
				+ "a frase �Exemplo String�.");

		if (frase2.contains("Exemplo String")) {
			System.out.println(true);
		} else {
			System.out.println(false);

		}

	}
}
