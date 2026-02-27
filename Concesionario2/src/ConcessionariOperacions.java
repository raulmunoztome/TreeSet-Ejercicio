
public interface ConcessionariOperacions {
	
	public boolean quitarElemento(String mat);
	
	public boolean quitarElemento(Vehicle v);
	
	public int getCantidad();
	
	public boolean addVehiculo(Vehicle vc);
	
	public int mediaKm();
	
	public double descuento(Vehicle v);
	
}

