package pack_classs;

public class Rectangulo extends Poligono{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(2);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "\nBase: " + base + "\nAltura=" + altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
    
}
