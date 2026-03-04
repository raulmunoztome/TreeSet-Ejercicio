import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Principal{

	public static void main(String[] args) {
		
		
		
		try {
			
			Cotxe c1 = new Cotxe("AR36634ET","Tesla","R1","Verde",25000,5,true);
			Cotxe c2 = new Cotxe("EP54782RT","Audi","A7","Blanco",20400,3,false);
			Cotxe c3 = new Cotxe("TT54653KK","Nissan","Mayestic","Blanco",9999,5,false);
			Moto m1 = new Moto("AP43256TG","Toyota","Avispa","Negro",17000,90,"urbana");
			Moto m2 = new Moto("TY35634KL","Peugeot","motomami","Azul",15500,180,"deportiva");
			
			List<Vehicle> lista = new ArrayList<Vehicle>();
			lista.add(c1);
			
			Concesionario con1 = new Concesionario("Calle Riera Baste 41, 08830",lista);
			con1.addVehiculo(c2);
			con1.addVehiculo(c3);
			con1.addVehiculo(m1);
			con1.addVehiculo(m2);
			
			System.out.println("Actualmente hay "+con1.getCantidad() +" vehiculos en el concesionario\n");
			TreeSet<Vehicle> listado = con1.getElementos();
			
			for(Vehicle v : listado) {
				
				if(v instanceof Cotxe) System.out.println("Coche -> "+v+"\nDescuento: "+v.descuento());
				else System.out.println("Moto -> "+v+"\nDescuento: "+v.descuento());
				
			}
			System.out.println("\nMedia de Km: "+con1.mediaKm()+" km\n");
			
			
			if(con1.quitarElemento("AR36634ET"))System.out.println("Vehiculo eliminado");;
			if(con1.quitarElemento(m2))System.out.println("Vehiculo eliminado");
			
			
			System.out.println("\n------DESPUES DE ELIMINAR------\n");
			System.out.println("Actualmente hay "+con1.getCantidad() +" vehiculos en el concesionario\n");
			
			for(Vehicle v : listado) {
				
				if(v instanceof Cotxe) System.out.println("Coche -> "+v+"\nDescuento: "+v.descuento());
				else System.out.println("Moto -> "+v+"\nDescuento: "+v.descuento());
				
			}
			
			System.out.println("\nMedia de Km: "+con1.mediaKm()+" km");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}


}
