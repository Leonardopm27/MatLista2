package exercicio2;

public class Retangulo {
	
	private float largura;
	private float altura;
	
	
	
	public Retangulo(float largura, float altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}


	public void definirRetangulo() {
		
		float area = this.altura*this.largura;
		System.out.println("A �rea do retangulo � de: " + area);
		float perimetro = 2 *(this.altura+this.largura);
		System.out.println("O per�metro do retangulo � de: "+ perimetro);
				
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

	public float getLargura() {
		return largura;
	}



	public void setLargura(float largura) {
		this.largura = largura;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}

	
	
	
	
	
	

}
