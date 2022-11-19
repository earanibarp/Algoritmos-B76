package paquete2;

import java.util.Scanner;

public class Main {
    public static int indiceCocheBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i = 1; i < coches.length; i++){
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entradaT = new Scanner(System.in);
        //Variables
        String marca;
        String modelo;
        float precio;
        int numVehiculos;
        int indiceVBarato;
        
        System.out.println("Ingrese la cantidad de vehiculos: ");
        numVehiculos = entradaT.nextInt();
        
        //Creando un objeto para cada vehiculo
        Vehiculo coches[] = new Vehiculo[numVehiculos];
        
        for (int i = 0; i < coches.length; i++){
            System.out.println("\n Ingrese las características del vehiculo " + (i + 1) + ": ");
            System.out.println("\n Ingrese la marca: ");
            marca = entradaT.next();
            System.out.println("\n Ingrese el modelo: ");
            modelo = entradaT.next();
            System.out.println("\n Ingrese el precio: ");
            precio = entradaT.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceVBarato = indiceCocheBarato(coches);
        System.out.println("\n El vehiculo más barato es: ");
        System.out.println(coches[indiceVBarato].mostrarDatosVehiculo());
    }
}
