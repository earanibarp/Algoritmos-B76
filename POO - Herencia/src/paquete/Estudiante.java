package paquete;

public class Estudiante extends Persona {
    //Atributos propios de la clase
    private int codigo;
    private float notaFinal;
    
    //Métodos

    public Estudiante(int codigo, float notaFinal, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre()+ "\nApellido: " + getApellidos() + 
                    "\nEdad: " + getEdad() + "\nCódigo: " + codigo + "\nNota Final: " + notaFinal);
    }
}
