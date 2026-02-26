import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Concesionario{

	private String direccion;
	private TreeSet<Vehicles> elementos = new TreeSet<>();
	private static final int MAX_VEHICULOS = 10;
	private static int cantidad = 0;
	 
	public Concesionario(String direccion, Vehicles veh) throws Exception {
		this.direccion = direccion;
		if(cantidad == MAX_VEHICULOS) throw new Exception("Máximo de vehiculos alcanzado");
		++cantidad;
		this.elementos.add(veh);

	}
	
	public boolean quitarElemento(String mat) {
		for(Vehicles e : elementos) {
			if(e.getMatricula().equals(mat)) {
				elementos.remove(e);
				return true;
			}
		}
		return false;
	}
	
	public boolean quitarElemento(Vehicles V) {
		for(Vehicles e2 : elementos) {
			if(e2.equals(V)) {
				elementos.remove(V);
				return true;
			}
		}
		return false;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	public TreeSet<Vehicles> getElementos() {
		return elementos;
	}
	public boolean addVehiculo(Vehicles vc) {
		if(cantidad == MAX_VEHICULOS) return false;
		elementos.add(vc);
		++cantidad;
		return true;
	}
	
	public int mediaKm() {
		int media = 0;
		Iterator<Vehicles> revisar = elementos.iterator();
		while(revisar.hasNext()) {
			media += revisar.next().getKm();
		}
		return media/elementos.size();
	}

	
	

}
	