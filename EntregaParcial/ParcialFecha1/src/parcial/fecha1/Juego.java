package parcial.fecha1;
import java.lang.Math;

public class Juego {
	private static Juego INSTANCE = new Juego();
	private int rondas;
	private Jugador jug1;
	private Jugador jug2;

	private Juego() {}
	
	public static Juego getInstance() {
		return INSTANCE;
	}

	public int getRondas() {
		return rondas;
	}

	public void setRondas(int rondas) {
		this.rondas = rondas;
	}

	public Jugador getJug1() {
		return jug1;
	}

	public void setJug1(Jugador jug1) {
		this.jug1 = jug1;
	}

	public Jugador getJug2() {
		return jug2;
	}

	public void setJug2(Jugador jug2) {
		this.jug2 = jug2;
	}
	
	public void jugar() {
		int rondasRestantes=this.rondas;
		int random1;
		int random2;
		
		while (rondasRestantes != 0) {
			int ronda = 1;
			System.out.println("Ronda " + ronda);
			
			random1 = (int)(Math.random() * 3) + 1;
			System.out.print("Jugador1: ");
			this.jug1.elegir(random1);
			
			random2 = (int)(Math.random() * 3) + 1;
			System.out.print("Jugador2: ");
			this.jug2.elegir(random2);
			
			if ((random1==1 && random2==3) || (random1==2 && random2==1) || (random1==3 && random2==2)) {
				this.jug1.aumnetarGanadas();
				System.out.println("Ronda ganada por el jugador 1");
			}
			else if ((random2==1 && random1==3) || (random2==2 && random1==1) || (random2==3 && random1==2)) {
				this.jug2.aumnetarGanadas();
				System.out.println("Ronda ganada por el jugador 2");
			}
			else {
				System.out.println("Ronda empatada");
			}
			rondasRestantes--;
			ronda++;
			System.out.println("");
		}
		if (this.jug1.getGanadas() > this.jug2.getGanadas()) {
			System.out.println("El jugador 1(" + this.jug1.getNombre() + ") ha ganado la partida");
		}
		else if (this.jug2.getGanadas() > this.jug1.getGanadas()) {
			System.out.println("El jugador 2(" + this.jug2.getNombre() + ") ha ganado la partida");
		}
		else {
			System.out.println("Hubo un empate en la partida");
		}
		
	}
	
	

}
