package ejer2;

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena.");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Juega el partido de futbol.");
    }   
    
    public void entrevista(){
        System.out.println("Da entrevistas.");
    }
    
}
