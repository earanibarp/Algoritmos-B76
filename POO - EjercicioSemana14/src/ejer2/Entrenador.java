package ejer2;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena al equipo.");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige el partido de futbol.");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }
}
