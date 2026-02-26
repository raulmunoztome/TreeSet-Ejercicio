import java.util.Objects;

public class Motos extends Vehicles{
	private int cilindrada;
	private String tipus;
	
	public Motos(String matricula, String marca, String model, String color, int km, int cilindrada, String tipus) {
		
		super(matricula, marca, model, color, km);
		this.cilindrada = cilindrada;
		this.tipus = tipus;
	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Motos other = (Motos) obj;

		return Objects.equals(matricula, other.matricula);

	}
	
}
