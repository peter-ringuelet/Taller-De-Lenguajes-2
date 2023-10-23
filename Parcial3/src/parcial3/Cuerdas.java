package parcial3;

public class Cuerdas extends Instrumento {

	public Cuerdas() {
		super();
	}

	public Cuerdas(Nota tono) {
		super(tono);
		// TODO Auto-generated constructor stub
	}
	
	public void afinar(Nota tono) {
		super.setTono(tono);
	}

}
