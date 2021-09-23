package exercicio2;

public class Circulo {

	private float raio;

	public Circulo(float raio) {
		super();
		this.raio = raio;
	}

	public void definirCirculo() {

		float area = (float) (Math.pow(this.raio, 2)* 3.14f);
		float perimetro = (float) (this.raio * (2*3.14))  ;

		System.out.println("O perimetro do círculo é de :" + perimetro);
		System.out.println(area);
		

	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

}
