package paquete;

public class VehiculoCarrera extends Vehiculo{
    private double velocidad;

    public VehiculoCarrera(double velocidad, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: "+marca + "\nModelo: " +modelo + "\nVelocidad: " + velocidad;
    }
    
    
}
