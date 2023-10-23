package parcial1;

public class Planeta {
	public Planeta(int cantLunas, double diametro, double distancia, TipoPlaneta tipo) {
		super();
		this.cantLunas = cantLunas;
		this.diametro = diametro;
		this.distancia = distancia;
		this.tipo = tipo;
	}
	private int cantLunas;
	private double diametro;
	private double distancia;
	private TipoPlaneta tipo;
	public int getCantLunas() {
		return cantLunas;
	}
	public void setCantLunas(int cantLunas) {
		this.cantLunas = cantLunas;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public TipoPlaneta getTipo() {
		return tipo;
	}
	public void setTipo(TipoPlaneta tipo) {
		this.tipo = tipo;
	}
}
