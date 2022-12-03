package paquete;

public class VehiculoUrbano extends Vehiculo{
    private int nroPuertas;

    public VehiculoUrbano(int nroPuertas, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.nroPuertas = nroPuertas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: "+marca + "\nModelo: " +modelo + "\nNro de puertas: " + nroPuertas;
    }
    
    
}
