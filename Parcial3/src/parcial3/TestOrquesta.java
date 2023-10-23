package parcial3;

public class TestOrquesta {

	public static void main(String[] args) {
		Cuerdas cuerdas1 = new Cuerdas();
		Cuerdas cuerdas2 = new Cuerdas();
		Cuerdas cuerdas3 = new Cuerdas();
		
		Percusion percusion1 = new Percusion();
		
		Viento viento1 = new Viento();
		Viento viento2 = new Viento();
		Viento viento3 = new Viento();

		Luthier.afinar(viento3);
		Luthier.afinar(viento2);
		Luthier.afinar(viento1);
		
		Luthier.afinar(cuerdas1);
		Luthier.afinar(cuerdas2);
		Luthier.afinar(cuerdas3);
		
		Luthier.afinar(percusion1);
	}

}
