package pack_clases;

public class Supervisor extends Empleado{
    private String categoria;

    public Supervisor() {
    }

    public Supervisor(String categoria, String nombre, String apellido, String telefono, String correo, double basico) {
        super(nombre, apellido, telefono, correo, basico);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double bono(){
        if (categoria.equals("Senior")){
            return getBasico() * 0.10;
        } else if (categoria.equals("Junior")){
            return getBasico() * 0.05;
        } else{
            return 0;
        }
    }
}
