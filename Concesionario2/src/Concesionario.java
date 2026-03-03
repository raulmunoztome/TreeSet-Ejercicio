import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
import java.util.List;


public class Concesionario implements ConcessionariOperacions{

	private String direccion;
	private TreeSet<Vehicle> elementos;
	private static final int MAX_VEHICULOS = 10;
	private int cantidad;
	 
	public Concesionario(String direccion, List<Vehicle> listaVehiculos) throws Exception {
		
		if(direccion.isBlank())throw new Exception("no hay direccion");
		this.direccion = direccion;
		
		if(listaVehiculos.isEmpty()) throw new Exception("lista de vehiculos sin datos");
		else if(listaVehiculos.size() > MAX_VEHICULOS) throw new Exception("Lista demasiado grande, número máx de vehiculos: "+MAX_VEHICULOS);
		
		this.elementos = new TreeSet<>(listaVehiculos);
		cantidad = elementos.size();

	}
	
	public boolean quitarElemento(String mat) {
		
		for(Vehicle e : elementos) {
			
			if(e.getMatricula().equalsIgnoreCase(mat)) {
				
				elementos.remove(e);
				--cantidad;
				return true;
				
			}
		}
		return false;
	}
	
	public boolean quitarElemento(Vehicle V) {
		
		for(Vehicle e2 : elementos) {
			
			if(e2.equals(V)) {
				
				elementos.remove(V);
				--cantidad;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		
		if(!direccion.isBlank())this.direccion = direccion;
	}


	

	
	

}
	

