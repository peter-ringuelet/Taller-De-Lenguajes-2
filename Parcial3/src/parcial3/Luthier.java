package parcial3;

public class Luthier {
	
	public static void afinar(Instrumento ins) {
		if (ins instanceof Cuerdas) {
			ins.afinar(Nota.DO);
			System.out.println("Cuerdas afinadas en DO");
		}
		else if (ins instanceof Percusion) {
			ins.afinar(Nota.RE);
			System.out.println("Percusion afinado en RE");
		}
		else if (ins instanceof Viento) {
			ins.afinar(Nota.SI);
			System.out.println("Viento afinado en SI");
		}
		
		
	}

}
