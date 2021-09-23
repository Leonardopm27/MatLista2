package exercicio2;

public class Quadrado {

	public float lado;

	public Quadrado(float lado) {
		super();
		this.lado = lado;

	}
	
	public void definirQuadrado() {
		float perimetro = 4*this.lado;
		System.out.println("O perímetro do quadrado é de: " + perimetro);
		float area =  (float) Math.pow(this.lado, 2);
		System.out.println("A área do quadrado é de: " + area);
		
		
	}
	

	
	
	
	
	
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

}
