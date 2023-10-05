package empresaDeTransporteUnahur;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AutomovilTest {
	Auto miAuto=new Auto();
	@Test
	
	/*
	public void alCrearUnAutoSeCreaCon0Km() {
		Integer valorEsperado=0;
		Integer valorObtenido=miAuto.kilometrosRecorridos();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	public void sePuedeAsignarUnChoferAlAuto() {
		//miAuto.recogerPasajero("asd");
		miAuto.cambiarChofer("carlos");
		String valorEsperado="carlos";
		String valorObtenido=miAuto.getChofer();
		assertEquals(valorEsperado,valorObtenido);
	}
	public void alTener3PasajerosNoRecogeMas() {
		while(miAuto.cantidadDePasajeros()<3) {
			miAuto.recogerPasajero("");
		}
		miAuto.recogerPasajero("");
		Integer valorEsperado=3;
		Integer valorObtenido=miAuto.cantidadDePasajeros();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	*/
	
	public void alSubirVariosPasajerosSubenOrdenados() {
		ArrayList<String> esperado= new ArrayList<String>();
		esperado.add("pepe");
		esperado.add("robert");
		esperado.add("jorge");
		miAuto.recogerPasajero("pepe");
		miAuto.recogerPasajero("robert");
		miAuto.recogerPasajero("jorge");
		ArrayList<String> obtenido= miAuto.presentarPasajeros();
		
		assertEquals(esperado,obtenido);
	}


}
