package empresaDeTransporteUnahur;
import java.util.ArrayList;

public abstract class Vehiculo {
    ArrayList<String> pasajeros = new ArrayList<String>();
    String chofer = "pepe";
    Integer kilometros = 0;

    public Integer kilometrosRecorridos() {
        return this.kilometros;
    }

    protected void cambiarChofer(String chofer) {
        if (this.cantidadDePasajeros() == 0)
            this.chofer = chofer;
    }
    
    protected void recorrerKm(int km) {
    	this.kilometros+=km;
	}

    public int cantidadDePasajeros() {
        return this.pasajeros.size();
    }

    public String getChofer() {
        return this.chofer;
    }

    protected abstract void recogerPasajero(String pasajero);

    public ArrayList<String> presentarPasajeros() {

        return this.pasajeros;
    }
}
