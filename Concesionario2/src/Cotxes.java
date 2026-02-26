import java.util.Objects;

public class Cotxes extends Vehicles {
	
	private int numPuertas;
	private boolean esAutomatic;
	
	public Cotxes(String matricula, String marca, String model, String color, int km, int numPuertas, boolean esAutomatic) {
		
		super(matricula, marca, model, color, km);
		this.numPuertas = numPuertas;
		this.esAutomatic = esAutomatic;
		
	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Cotxes other = (Cotxes) obj;

		return Objects.equals(matricula, other.matricula);

	}
	
	
}
