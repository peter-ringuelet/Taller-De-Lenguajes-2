package parcial.fecha1;

public class Jugador {
	private Gesto gesto;
	private int ganadas;
	private String nombre;

	public Jugador() {
		this.ganadas=0;
	}

	public Jugador(String nombre) {
		this.ganadas=0;
		this.nombre=nombre;
	}

	public Gesto getGesto() {
		return gesto;
	}

	public void setGesto(Gesto gesto) {
		this.gesto = gesto;
	}

	public int getGanadas() {
		return ganadas;
	}

	public void setGanadas(int ganadas) {
		this.ganadas = ganadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void elegir(int gesto) {
		if (gesto==1) {
			this.gesto= new Piedra();
			this.gesto.mostrar();
		}
		else if (gesto==2) {
			this.gesto = new Papel();
			this.gesto.mostrar();
		}
		else if (gesto==3){
			this.gesto = new Tijera();
			this.gesto.mostrar();
		}
	}
	
	public void aumnetarGanadas() {
		this.ganadas++;
	}
}
