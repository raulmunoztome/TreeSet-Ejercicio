import java.util.Objects;

public class Cotxe extends Vehicle {
	
	private int numPuertas;
	private boolean esAutomatic;
	
	

	
	public Cotxe(String matricula, String marca, String model, String color, int km, int numPuertas, boolean esAutomatic) throws Exception {
		
		super(matricula, marca, model, color, km);
		if(numPuertas <= 0) throw new Exception("Error en las puertas");
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

		return Objects.equals(getClass().getSimpleName(), other.getClass().getSimpleName()) && Objects.equals(matricula, other.matricula) && Objects.equals(marca, other.marca) && Objects.equals(model, other.model);


	}
	
	public double descuento(int kilometros) {
		if(this.esAutomatic) return 0;
		
		if((kilometros/10000) > 10 )return 10;
		
		return kilometros/1000;
	}
	
	@Override
	public String toString() {
		return "[numPuertas=" + numPuertas + ", esAutomatic=" + esAutomatic + ", matricula=" + matricula
				+ ", marca=" + marca + ", model=" + model + ", color=" + color + ", km=" + km + "]";
	}
	
}
