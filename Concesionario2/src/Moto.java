import java.util.Objects;

public class Moto extends Vehicle{
	private int cilindrada;
	private String tipus;
	
	public Moto(String matricula, String marca, String model, String color, int km, int cilindrada, String tipus) {
		
		super(matricula, marca, model, color, km);
		this.cilindrada = cilindrada;
		this.tipus = tipus;
	}
	@Override
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Moto other = (Moto) obj;

		return Objects.equals(matricula, other.matricula);

	}
	
}
