import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Concesionario implements ConcessionariOperacions{

	private String direccion;
	private TreeSet<Vehicle> elementos = new TreeSet<>();
	private static final int MAX_VEHICULOS = 10;
	private static int cantidad = 0;
	 
	public Concesionario(String direccion, Vehicle veh) throws Exception {
		this.direccion = direccion;
		if(cantidad == MAX_VEHICULOS) throw new Exception("Máximo de vehiculos alcanzado");
		++cantidad;
		this.elementos.add(veh);

	}
	
	public boolean quitarElemento(String mat) {
		for(Vehicle e : elementos) {
			if(e.getMatricula().equals(mat)) {
				elementos.remove(e);
				return true;
			}
		}
		return false;
	}
	
	public boolean quitarElemento(Vehicle V) {
		for(Vehicle e2 : elementos) {
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
	public TreeSet<Vehicle> getElementos() {
		return elementos;
	}
	public boolean addVehiculo(Vehicle vc) {
		if(cantidad == MAX_VEHICULOS) return false;
		elementos.add(vc);
		++cantidad;
		return true;
	}
	
	public int mediaKm() {
		int media = 0;
		Iterator<Vehicle> revisar = elementos.iterator();
		while(revisar.hasNext()) {
			media += revisar.next().getKm();
		}
		return media/elementos.size();
	}
	public double descuento(Vehicle v) {
		if(v.getClass().getSimpleName().equals("Cotxes")) {
			if(v.isEsAutomatic()) return 0;
			int dato = v.getKm();
			if((dato/10000) > 10 )return 10;
			return dato/1000;
		}
		else {
			if(v.getCilindrada() > 125) {
				int dato = v.getKm();
				if((dato/10000) > 10 )return 10;
				return dato/1000;
			}
			int motokm = v.getKm();
			if((motokm/5000)*2 > 20) return 20;
			return (v.getKm()/5000)*2;
		}
		
	}

	
	

}
	