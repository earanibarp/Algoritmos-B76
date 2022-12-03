package ejer2;

public class Doctor extends Persona {
    private String especialidad;
    private int texperencia;

    public Doctor(String especialidad, int texperencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.texperencia = texperencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTexperencia() {
        return texperencia;
    }

    public void setTexperencia(int texperencia) {
        this.texperencia = texperencia;
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Dar asistencia.");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dar asistencia.");
    }
    
    public void curarLesion(){
        System.out.println("Curar lesión.");
    }
}
