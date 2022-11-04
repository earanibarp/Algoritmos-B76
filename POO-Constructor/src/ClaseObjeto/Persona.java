
package ClaseObjeto;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    
    // Métodos
    //Método constructor
    public Persona(String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad = _edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("La edad de la persona es: " + edad);
    }
    
}
