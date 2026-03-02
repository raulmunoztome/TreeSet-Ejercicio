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
		
		if(cilindrada <= 0) throw new Exception("Cilindrada no válida");
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
		
		if(cilindrada > 0)this.cilindrada = cilindrada;
	}
	
	public String getTipus() {
		
		return tipus.name();
	}
	
	public void setTipus(String tipus) {
		
		for(tipoMoto t : tipoMoto.values()) {
			
			if(t.name().equalsIgnoreCase(tipus)) {
				
				this.tipus = t;
	            break;
			}
		}
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
