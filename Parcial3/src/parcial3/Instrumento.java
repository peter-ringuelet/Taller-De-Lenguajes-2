package parcial3;

public abstract class Instrumento {
	private Nota tono;
	
	public Instrumento() {}

	public Instrumento(Nota tono) {
		super();
		this.tono = tono;
	}


	public Nota getTono() {
		return tono;
	}

	public void setTono(Nota tono) {
		this.tono = tono;
	}

	public abstract void afinar(Nota tono);
}
