package empresaDeTransporteUnahur;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AutobusTest {

	Autobus miAutobus= new Autobus(); 
	@Test
	/*public void cuandoCreoUnAutobusSeCreaVacio() {
		//preparacion
		Integer valorEsperado=0;
		Integer valorObtenido=miAutobus.cantidadDePasajeros();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	public void cuandoCreoUnAutobusSeAsignaElChofer() {
		String valorEsperado="pepe";
		String valorObtenido=miAutobus.getChofer();
	
		assertEquals(valorEsperado,valorObtenido);
	}
	
	public void elAutobusPuedeRecojerPasajeros() {
		miAutobus.recogerPasajero("aladin");
		Integer valorEsperado=1;
		Integer valorObtenido=miAutobus.cantidadDePasajeros();
		assertEquals(valorEsperado,valorObtenido);
	}

	public void cuandoCreoElAutobusSeCreaSinKm() {
		Integer valorEsperado=0;
		Integer valorObtenido=miAutobus.kilometrosRecorridos();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	public void elAutobusAumentaLosKilometrosQueRecorre() {
		miAutobus.recorrerKm(20);
		miAutobus.recorrerKm(3);
		Integer valorEsperado=23;
		Integer valorObtenido=miAutobus.kilometrosRecorridos();
		assertEquals(valorEsperado,valorObtenido);
	}
	public void sePuedeCambiarAlChoferDelAutobus() {
		//miAutobus.recogerPasajero("asd");
		miAutobus.cambiarChofer("carlos");
		String valorEsperado="carlos";
		String valorObtenido=miAutobus.getChofer();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	public void elAutobusNoPuedeRecojerMasDe20Pasajeros() {
		while(miAutobus.cantidadDePasajeros()<20) {
			miAutobus.recogerPasajero("");
		}
		Integer esperado=20;
		Integer obtenido=miAutobus.cantidadDePasajeros();
		assertEquals(esperado,obtenido);
	}
	*/
	public void alSubirVariosPasajerosSubenOrdenados() {
		ArrayList<String> esperado= new ArrayList<String>();
		esperado.add("pepe");
		esperado.add("robert");
		esperado.add("jorge");
		miAutobus.recogerPasajero("pepe");
		miAutobus.recogerPasajero("robert");
		miAutobus.recogerPasajero("jorge");
		ArrayList<String> obtenido= miAutobus.presentarPasajeros();
		
		assertEquals(esperado,obtenido);
	}
}
