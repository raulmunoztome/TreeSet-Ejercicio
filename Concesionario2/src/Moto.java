import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Moto extends Vehicle{

	private int cilindrada;
	private tipoMoto tipus;
	private enum tipoMoto {
	    URBANA, DEPORTIVA, SCOOTER, TRAIL, CUSTOM
	}
	
	public Moto(String matricula, String marca, String model, String color, int km, int cilindrada, String tipus) throws Exception {	
		super(matricula, marca, model, color, km);
		
		this.cilindrada = cilindrada;
		
		boolean encontrado = false;
		for(tipoMoto t : tipoMoto.values()) {
			if(t.name().equalsIgnoreCase(tipus)) {
				this.tipus = t;
	            encontrado = true;
	            break;
			}
		}
		if(!encontrado) throw new Exception("tipo de moto inválido");
	}
	
	public int getCilindrada() {
		
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		
		this.cilindrada = cilindrada;
	}
	
	public tipoMoto getTipus() {
		
		return tipus;
	}
	
	public void setTipus(String tipus) {
		
		boolean encontrado = false;
		
		for(tipoMoto t : tipoMoto.values()) {
			if(t.name().equalsIgnoreCase(tipus)) {
				this.tipus = t;
	            encontrado = true;
	            break;
			}
		}
	}
	
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Moto other = (Moto) obj;

		return Objects.equals(getClass().getSimpleName(), other.getClass().getSimpleName()) && Objects.equals(matricula, other.matricula) && Objects.equals(marca, other.marca) && Objects.equals(model, other.model);


	}
	@Override
	public String toString() {
		
		return "[cilindrada=" + cilindrada + ", tipus=" + tipus + ", matricula=" + matricula + ", marca=" + marca
				+ ", model=" + model + ", color=" + color + ", km=" + km + "]";
	}
	
	@Override
	public int descuento() {
		
		if(cilindrada > 125) {
			
			return this.descuentoReglaCoche();
		}
		
		if((km/5000)*2 > 20) return 20;
		
		return (km/5000)*2;
	}
	
}
