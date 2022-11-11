// SET y GET
package ClaseObjeto;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private int dni;
    
    // Métodos
    //Método constructor
    public Persona(String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad = _edad;
    }
    
    
    public void setEdad(int edad){
        if (edad > 0 && edad <= 110){
            this.edad = edad;
        }
        else
            System.out.println("Tu edad no puede ser menor a 0");
    }
    
    public int getEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
