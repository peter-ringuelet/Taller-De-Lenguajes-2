package practica6;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Persona[] personas = {
				new Persona("Juan", "Perez", 25),
	            new Persona("Ana", "Lopez", 30),
	            new Persona("Pedro", "Perez", 28)
	        };

	    Arrays.sort(personas);

	    for (Persona p : personas) {
	        System.out.println(p.getApellido() + ", " + p.getNombre());
	    }

	    Empleado[] empleados = {
	            new Empleado("Juan", "Perez", 25, 1234, 3000.50),
	            new Empleado("Ana", "Lopez", 30, 1235, 3200.00),
	            new Empleado("Pedro", "Perez", 28, 1236, 3100.00)
	        };

	        Arrays.sort(empleados, new SueldoComparator());

	        for (Empleado e : empleados) {
	            System.out.println(e.getApellido() + ", " + e.getNombre() + ", $" + e.getSueldo());
	        }
	}

}
