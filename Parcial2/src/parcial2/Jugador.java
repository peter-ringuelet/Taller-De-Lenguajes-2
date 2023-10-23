package parcial2;

public class Jugador {
	private Posicion pos1;
	private Posicion pos2;
	
	public Jugador() {}
	
	public Jugador(Posicion pos1, Posicion pos2) {
		super();
		this.pos1 = pos1;
		this.pos2 = pos2;
	}

	public Posicion getPos1() {
		return pos1;
	}

	public void setPos1(Posicion pos1) {
		this.pos1 = pos1;
	}

	public Posicion getPos2() {
		return pos2;
	}

	public void setPos2(Posicion pos2) {
		this.pos2 = pos2;
	}
	
	
}
