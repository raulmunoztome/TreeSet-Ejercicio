import java.util.Objects;

public abstract class Vehicles implements Comparable<Vehicles> {
	protected String matricula;
	protected String marca;
	protected String model;
	protected String color;
	protected int km;
	
	public Vehicles(String matricula, String marca, String model, String color, int km) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.km = km;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {

		return Objects.hash(marca,model,matricula);

	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Vehicles other = (Vehicles) obj;

		return Objects.equals(matricula, other.matricula) && Objects.equals(marca, other.marca) && Objects.equals(model, other.model);

	}
	@Override
	public String toString() {
		return " Matricula: "+this.matricula+" Marca: "+this.marca+" KM: "+km;
	}
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int compareTo(Vehicles p) {

	      // Primero comparar por matrícula
        int comparacionMatricula = this.matricula.compareTo(p.getMatricula());
        if (comparacionMatricula != 0) {
            return comparacionMatricula;
        }
        
        // Si matrícula es igual, comparar por marca
        int comparacionMarca = this.marca.compareTo(p.getMarca());
        if (comparacionMarca != 0) {
            return comparacionMarca;
        }
        
        // Si matrícula y marca son iguales, comparar por modelo
        return this.model.compareTo(p.getModel());
	   }
}