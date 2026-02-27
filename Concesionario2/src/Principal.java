import java.util.TreeSet;

public class Principal{

	public static void main(String[] args) {
		
		Cotxe c1 = new Cotxe("AR36346ET","Tesla","R1","Verde",0,5,true);
		Cotxe c2 = new Cotxe("EP54782RT","Peugeot","A7","Blanco",2000,5,false);
		Cotxe c3 = new Cotxe("TT54653KK","Nissan","Mayestic","Blanco",1000,5,false);
		Moto m1 = new Moto("AP43256TG","Aurum","BMC","Negro",4200,90,"F");
		Moto m2 = new Moto("TY354634KL","Peugeot","Ronda","Azul",4500,125,"S");
		
		try {
			Concesionario con1 = new Concesionario("Calle Riera Baste 41, 08830",c1);
			con1.addVehiculo(c2);
			con1.addVehiculo(c3);
			con1.addVehiculo(m1);
			con1.addVehiculo(m2);
			
			System.out.println("Actualmente hay "+con1.getCantidad() +" vehiculos en el concesionario\n");
			TreeSet<Vehicle> listado = con1.getElementos();
			
			for(Vehicle v : listado) {
				if(v instanceof Cotxe) System.out.println("Coche -> "+v);
				else System.out.println("Moto -> "+v);
			}
			
			con1.quitarElemento("AR36346ET");
			con1.quitarElemento(m2);
			System.out.println("\n------DESPUES DE ELIMINAR------\n");
			
			for(Vehicle v : listado) {
				if(v instanceof Cotxe) System.out.println("Coche -> "+v);
				else System.out.println("Moto -> "+v);
			}
			System.out.println("Media de Km: "+con1.mediaKm()+" km");

			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
