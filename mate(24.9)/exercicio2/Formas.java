package exercicio2;

public class Formas {
	
	public static void main(String[] args) {
		
		Circulo novo = new Circulo(3.4f);
		
		novo.definirCirculo();
		
		System.out.println("<=================================>");
		
		Retangulo teste = new Retangulo(1f,2f);
		
		teste.definirRetangulo();
		
		
		System.out.println("<=================================>");
		
		Quadrado quadrado = new Quadrado(2f);
		
		quadrado.definirQuadrado();
	}
	
	
	

}
