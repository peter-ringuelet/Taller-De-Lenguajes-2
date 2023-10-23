package parcial1;
import java.util.ArrayList;

public class TestSistemaSolar {

	public static void main(String[] args) {
		SistemaSolar sistemasolar = SistemaSolar.getInstance();
		Planeta tierra = new Planeta(1, 23.4, 99999.9, TipoPlaneta.ROCOSO);
		Planeta jupiter = new Planeta(2, 10.99, 101010.10, TipoPlaneta.GASEOSO);
		ArrayList<Planeta> listaSist = new ArrayList<Planeta>();
		listaSist.add(tierra);
		listaSist.add(jupiter);
		sistemasolar.setPlanetas(listaSist);
		
		System.out.println(sistemasolar.toString());
		
		Telescopio.tipo(tierra);
		System.out.println("La distancia de Jupiter es " + Telescopio.distancia(jupiter));

	}

}
