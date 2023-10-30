package practica6;
import java.util.Comparator;

public class SueldoComparator implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return Double.compare(e1.getSueldo(), e2.getSueldo());
    }
}
