package paquete2;

/*
 Crear un programa que dada una serie de vehículos caracterizados por su marca, 
modelo y precio, imprima las propiedades del vehículo más barato. 
Para ello, las características de cada vehículo deben ser introducidas por teclado, 
por último, crear una clase que represente a cada uno de ellos.
 */
public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatosVehiculo(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio;
    }
    
}
