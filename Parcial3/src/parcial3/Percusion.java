package parcial3;

public class Percusion extends Instrumento{

	public Percusion() {
		// TODO Auto-generated constructor stub
	}

	public Percusion(Nota tono) {
		super(tono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afinar(Nota tono) {
		// TODO Auto-generated method stub
		super.setTono(tono);
	}

}
