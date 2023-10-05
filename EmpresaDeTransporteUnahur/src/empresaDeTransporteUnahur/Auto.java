package empresaDeTransporteUnahur;


public class Auto extends Vehiculo {
	@Override
    protected void recogerPasajero(String pasajero) {
        if (this.cantidadDePasajeros() < 3)
            this.pasajeros.add(pasajero);
    }
}
