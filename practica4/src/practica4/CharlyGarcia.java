package practica4;

public class CharlyGarcia {
	private static CharlyGarcia INSTANCE;
	
	private CharlyGarcia() {}
	
	public static CharlyGarcia getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CharlyGarcia();
		return INSTANCE;
	}
	
	public void cantar() {
		System.out.println("Charly Garcia esta cantando");
	}
	
}
