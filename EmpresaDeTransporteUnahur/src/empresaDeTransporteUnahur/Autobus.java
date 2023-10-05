package empresaDeTransporteUnahur;


public class Autobus extends Vehiculo {
	@Override
    protected void recogerPasajero(String nombre) {
        if (this.cantidadDePasajeros() < 20)
            pasajeros.add(nombre);
    }
}