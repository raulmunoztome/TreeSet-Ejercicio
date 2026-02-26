import java.util.TreeSet;

public class Principal{

	public static void main(String[] args) {
		
		Cotxes c1 = new Cotxes("AR36346ET","Tesla","R1","Verde",0,5,true);
		Cotxes c2 = new Cotxes("EP54782RT","Peugeot","A7","Blanco",2000,5,false);
		Cotxes c3 = new Cotxes("TT54653KK","Nissan","Mayestic","Blanco",1000,5,false);
		Motos m1 = new Motos("AP43256TG","Toyota","BMC","Negro",4200,90,"F");
		Motos m2 = new Motos("TY354634KL","Peugeot","Ronda","Azul",4500,125,"S");
		
		try {
			Concesionario con1 = new Concesionario("Calle Riera Baste 41, 08830",c1);
			con1.addVehiculo(c2);
			con1.addVehiculo(c3);
			con1.addVehiculo(m1);
			con1.addVehiculo(m2);
			
			System.out.println("Actualmente hay "+con1.getCantidad() +" vehiculos en el concesionario\n");
			TreeSet<Vehicles> listado = con1.getElementos();
			
			for(Vehicles v : listado) {
				if(v instanceof Cotxes) System.out.println("Coche -> "+v);
				else System.out.println("Moto -> "+v);
			}
			
			con1.quitarElemento("AR36346ET");
			con1.quitarElemento(m2);
			System.out.println("\n------DESPUES DE ELIMINAR------\n");
			
			for(Vehicles v : listado) {
				if(v instanceof Cotxes) System.out.println("Coche -> "+v);
				else System.out.println("Moto -> "+v);
			}
			System.out.println("Media de Km: "+con1.mediaKm()+" km");

			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
