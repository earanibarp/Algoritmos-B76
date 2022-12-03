package paquete;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];
        
        vehiculos[0] = new Vehiculo("ASV-520", "TOYOTA", "YARIS");
        vehiculos[1] = new VehiculoCarga(500, "AHB-202", "XXXX", "XXXXX");
        vehiculos[2] = new VehiculoCarrera(115.9, "CFH-589", "CARRERAS", "RAPIDO");
        vehiculos[3] = new VehiculoUrbano(2, "XVF-123", "URBANO", "URBANO");
        
        for(Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo.toString());
            System.out.println("");
        }
    }
}
