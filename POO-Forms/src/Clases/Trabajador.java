
package Clases;

public class Trabajador {
    int codigo;
    String nombre;
    double pagoxHora;
    int horasT;
    
    public Trabajador (int _codigo, String _nombre, double _pagoxHora, int _horasT){
        this.codigo = _codigo;
        this.nombre = _nombre;
        this.pagoxHora = _pagoxHora;
        this.horasT = _horasT;
    }
    public String mostrarNombre(){
        return nombre;
    }
    public double salarioBruto(){
        return pagoxHora * horasT;
    }
    
    public double dscto(){
        return salarioBruto() * 0.13;
    }
    
    public double SalarioNeto(){
        return salarioBruto() - dscto();
    }
}
