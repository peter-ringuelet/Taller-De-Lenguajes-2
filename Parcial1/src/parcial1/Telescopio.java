package parcial1;

public class Telescopio {
	
	public static double distancia(Planeta p) {
		return p.getDistancia();
	}
	
	public static void tipo(Planeta p) {
		if (p.getTipo()==TipoPlaneta.ROCOSO) {
			System.out.println("Rocoso");
		}
		if (p.getTipo()==TipoPlaneta.GASEOSO) {
			System.out.println("Gaseoso");
		}
		
	}
	
}
