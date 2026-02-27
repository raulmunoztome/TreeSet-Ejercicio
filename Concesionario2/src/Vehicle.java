import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {
	protected String matricula;
	protected String marca;
	protected String model;
	protected String color;
	protected int km;
	
	public Vehicle(String matricula, String marca, String model, String color, int km) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.km = km;
	}
	public boolean isEsAutomatic() {
		return false;
	}
	public int getCilindrada() {
		return 0;
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

		return Objects.hash(this.getClass().getSimpleName(),model,matricula);

	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;

		if (obj == null) return false;

		if (getClass() != obj.getClass()) return false;

		Vehicle other = (Vehicle) obj;

		return  Objects.equals(getClass().getSimpleName(), other.getClass().getSimpleName()) && Objects.equals(matricula, other.matricula) && Objects.equals(marca, other.marca) && Objects.equals(model, other.model);

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

	public int compareTo(Vehicle p) {
		//Primero comprar las clases
		int comparacionClase = this.getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
		 if (comparacionClase != 0) {
		        return comparacionClase;
		    }
		
	    // Primero comparar por MARCA
	    int comparacionMarca = this.marca.compareTo(p.getMarca());
	    if (comparacionMarca != 0) {
	        return comparacionMarca;
	    }
	    
	    // Si la marca es igual, comparar por MODELO
	    int comparacionModelo = this.model.compareTo(p.getModel());
	    if (comparacionModelo != 0) {
	        return comparacionModelo;
	    }
	    
	    // Si marca y modelo son iguales, comparar por MATRÍCULA (para diferenciar)
	    return this.matricula.compareTo(p.getMatricula());
	}
}
