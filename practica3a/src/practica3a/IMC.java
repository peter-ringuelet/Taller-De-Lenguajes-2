package practica3a;

public class IMC {
	private double peso;
	private double altura;
	
	public IMC(double peso, double altura) {
		this.peso=peso;
		this.altura=altura;
	}
	
	public IMC() {}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double calculo() {
		return (this.peso / (this.altura*this.altura));
	}
	
	
	
}
