package practica4;

public class TestCharly {

	public static void main(String[] args) {
		CharlyGarcia charly = CharlyGarcia.getInstance();
		
		charly.cantar();
		
		CharlyGarcia otraInstancia = CharlyGarcia.getInstance();
		
		System.out.println(charly==otraInstancia);

	}

}
