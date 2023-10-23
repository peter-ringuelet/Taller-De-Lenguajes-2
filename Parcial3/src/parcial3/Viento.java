package parcial3;

public class Viento extends Instrumento {

	public Viento() {
		super();
	}

	public Viento(Nota tono) {
		super(tono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afinar(Nota tono) {
		super.setTono(tono);
		
	}
	

}
