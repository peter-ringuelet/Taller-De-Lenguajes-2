package unlp.info.animal;



public class PerroPeligroso implements unlp.info.animalespeligrosos.AnimalPeligroso, unlp.info.domestico.PerroDomestico {
	public void muerde() { 
		System.out.println("GRRRR!");
	}
	public void ladra() { 
		System.out.println("GUAU GUAU!");
	}
	public void mueveCola() { 
		System.out.println("Mueve cola");
	} 
}