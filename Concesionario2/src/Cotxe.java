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
		
		if(numPuertas > 0) this.numPuertas = numPuertas;
	}
	
	@Override
	public boolean isEsAutomatic() {
		return esAutomatic;
	}
	
	public void setEsAutomatic(boolean esAutomatic) {
		this.esAutomatic = esAutomatic;
	}
	
	
	@Override
	public int descuento() {
		return this.descuentoReglaCoche();
	}
	
	@Override
	public String toString() {
		return "[numPuertas=" + numPuertas + ", esAutomatic=" + esAutomatic + ", matricula=" + matricula
				+ ", marca=" + marca + ", model=" + model + ", color=" + color + ", km=" + km + "]";
	}
	
}
