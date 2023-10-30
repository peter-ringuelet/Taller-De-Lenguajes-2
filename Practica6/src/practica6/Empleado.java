package practica6;

public class Empleado extends Persona {
    private long legajo;
    private double sueldo;
    
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre, String apellido, int edad, long legajo, double sueldo) {
		super(nombre, apellido, edad);
		this.legajo=legajo;
		this.sueldo=sueldo;
	}

	public long getLegajo() {
		return legajo;
	}
	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
    public int compareTo(Persona o) {
        if (!(o instanceof Empleado)) {
            return super.compareTo(o);
        }
        Empleado e = (Empleado) o;
        
        int comparison = super.compareTo(e);
        if (comparison != 0) {
            return comparison;
        }
        return Double.compare(this.sueldo, e.sueldo);
    }
    
}