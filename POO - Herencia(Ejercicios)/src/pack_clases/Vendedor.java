package pack_clases;

public class Vendedor extends Empleado {
    private int nroventas;

    public Vendedor() {
    }

    public Vendedor(int nroventas, String nombre, String apellido, String telefono, String correo, double basico) {
        super(nombre, apellido, telefono, correo, basico);
        this.nroventas = nroventas;
    }

    public int getNroventas() {
        return nroventas;
    }

    public void setNroventas(int nroventas) {
        this.nroventas = nroventas;
    }
    
    public double comision(){
        if (nroventas > 10 && nroventas <= 20){
            return getBasico() * 0.15;
        } else if (nroventas > 20){
            return getBasico() * 0.10;
        } else{
            return 0;
        }
    }
}
