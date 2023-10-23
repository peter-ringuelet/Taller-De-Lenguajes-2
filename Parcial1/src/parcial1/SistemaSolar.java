package parcial1;
import java.util.ArrayList;

public class SistemaSolar {
	private static SistemaSolar INSTANCE = new SistemaSolar();
	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();
	
	private SistemaSolar() {}
	
	public static SistemaSolar getInstance() {
		return INSTANCE;
	}
	
	public ArrayList<Planeta> getPlanetas(){
		return this.planetas;
	}
	
	public void setPlanetas(ArrayList<Planeta> planetas) {
		this.planetas=planetas;
	}
}
