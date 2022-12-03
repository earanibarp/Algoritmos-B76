package paquete;

public class Main {
    public static void main(String [] args){
        Planta planta = new Planta();
        Carnivoro animalCarnivoro = new Carnivoro();
        
        planta.alimentarse();
        animalCarnivoro.alimentarse();
    }
}
