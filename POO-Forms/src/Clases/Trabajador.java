
package Clases;

public class Trabajador {
    private int codigo;
    private String nombre;
    private String apellido;
    private String cargo;

    public Trabajador(int codigo, String nombre, String apellido, String cargo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    public String mostrarNombre(){
        return nombre;
    }
    
    public String mostrarApellido(){
        return apellido;
    }
    
    public int sueldoBruto(){
        if (cargo.equals("Jefe")){
            return 5000;
        }
        else if (cargo.equals("Analista")){
            return 4000;
        }
        else if (cargo.equals("Programador")){
            return 3000;
        }
        else if (cargo.equals("Soporte")){
            return 2000;
        }
        else
            return 0;
    }
    
    public double dscto(){
        return sueldoBruto() * 0.1;
    }
    
    public double SueldoNeto(){
        return sueldoBruto() - dscto();
    }
}
