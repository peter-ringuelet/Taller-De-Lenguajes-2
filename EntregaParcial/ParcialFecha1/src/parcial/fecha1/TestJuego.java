package parcial.fecha1;

public class TestJuego {

	public static void main(String[] args) {
		Jugador jug1 = new Jugador("Pedro");
		Jugador jug2 = new Jugador("Fran");
		Juego juego = Juego.getInstance();
		juego.setJug1(jug1);
		juego.setJug2(jug2);
		juego.setRondas(1);
		juego.jugar();

	}

}
