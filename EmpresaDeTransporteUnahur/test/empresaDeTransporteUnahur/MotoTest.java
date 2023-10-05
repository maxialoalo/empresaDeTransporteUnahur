package empresaDeTransporteUnahur;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotoTest {

	Moto miMoto= new Moto();
	@Test
	
	/*
	public void cuandoSeCreaLaMotoNoTienePasajeros() {
		Boolean valorEsperado=Boolean.FALSE;
		Boolean valorObtenido=miMoto.tienePasajero();
		assertEquals(valorEsperado,valorObtenido);
	}
	public void sePuedeAgregarUnAcompañanteALaMoto() {
		//preparacion
		miMoto.agregarPasajero();
		Boolean valorEsperado=Boolean.TRUE;
		//ejecucion
		Boolean valorObtenido=miMoto.tienePasajero();
		//contrastacion
		assertEquals(valorEsperado,valorObtenido);
	}
	public void SiNoTieneAcompanianteLaMotoPuedeCambiarDeChofer() {
		miMoto.cambiarChofer("carlos");
		String valorEsperado="carlos";
		String valorObtenido=miMoto.getChofer();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	public void siLaMotoTieneAcompanianteNoCambiaElChofer() {
		miMoto.agregarPasajero();
		miMoto.cambiarChofer("ortencia");
		String valorEsperado="pepe";
		String valorObtenido=miMoto.getChofer();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	*/
	public void cuandoRecorreSumaLosKm() {
		miMoto.recorrerKm(30);
		Integer valorEsperado=30;
		Integer valorObtenido=miMoto.kilometrosRecorridos();
		assertEquals(valorEsperado,valorObtenido);
	}
}
