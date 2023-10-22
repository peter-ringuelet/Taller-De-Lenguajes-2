package practica3a;
import java.util.Scanner;

public class TestIMC {

	public static void main(String[] args) {
		//if (args.length != 2) {
		//	System.out.println("Debe ingresar solo 2 argumentos");
		//	return;
		//}
		
		Scanner scanner = new Scanner(System.in);
		
		
		//double peso = Double.parseDouble(args[0]);
		//double altura = Double.parseDouble(args[1]);
		
		System.out.println("Peso: ");
		double peso = scanner.nextDouble();
		System.out.println("Altura: ");
		double altura = scanner.nextDouble();
		
		IMC imc = new IMC();
		imc.setPeso(peso);
		imc.setAltura(altura);
		
		double valorIMC = imc.calculo();
		
		if (valorIMC<18) {
			System.out.println(valorIMC + " Usted se encuentra por debajo del indice");
		}
		else if (valorIMC>25) {
			System.out.println(valorIMC + " Usted se encuentra por encima del limite");
		}
		else {
			System.out.println(valorIMC + " Usted esta saludable");
		}

	}

}
