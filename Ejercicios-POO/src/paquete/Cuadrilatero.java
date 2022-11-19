package paquete;

public class Cuadrilatero {
    // Atributos
    private float lado1;
    private float lado2;
    
    // Constructor

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float area(){
        float area = lado1 * lado2;
        return area;
    }
    
    public float perimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
}
