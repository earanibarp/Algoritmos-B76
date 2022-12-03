package pack_classs;

public abstract class Poligono {
    protected int nroLados;

    public Poligono(int nroLados) {
        this.nroLados = nroLados;
    }

    public int getNroLados() {
        return nroLados;
    }

    public void setNroLados(int nroLados) {
        this.nroLados = nroLados;
    }

    @Override
    public String toString() {
        return "Nro lados: " + nroLados;
    }
    
    public abstract double area();
}
