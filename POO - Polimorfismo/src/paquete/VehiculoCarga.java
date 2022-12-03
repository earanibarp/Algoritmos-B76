package paquete;

public class VehiculoCarga  extends Vehiculo{
    private int soporte;

    public VehiculoCarga(int soporte, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.soporte = soporte;
    }

    public int getSoporte() {
        return soporte;
    }

    public void setSoporte(int soporte) {
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: "+marca + "\nModelo: " +modelo+ "\nSoporte: " + soporte;
    }
    
    
}
