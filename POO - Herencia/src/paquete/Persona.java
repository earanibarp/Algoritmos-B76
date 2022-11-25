package paquete;

public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    
    //Métodos

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
}
