package empresaDeTransporteUnahur;

public class Moto extends Vehiculo{
	
	@Override
	protected void recogerPasajero(String pasajero) {		// TODO Auto-generated method stub
		if(this.cantidadDePasajeros()==0);
			this.pasajeros.add(pasajero);
	}



}
