import java.util.Objects;

public class Cotxe extends Vehicle {
	
	private int numPuertas;
	private boolean esAutomatic;
	
	public Cotxe(String matricula, String marca, String model, String color, int km, int numPuertas, boolean esAutomatic) {
		
		super(matricula, marca, model, color, km);
		this.numPuertas = numPuertas;
		this.esAutomatic = esAutomatic;
		
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	@Override
	public boolean isEsAutomatic() {
		return esAutomatic;
	}
	public void setEsAutomatic(boolean esAutomatic) {
		this.esAutomatic = esAutomatic;
	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Cotxe other = (Cotxe) obj;

		return Objects.equals(matricula, other.matricula);

	}
	
	
}
