package pack_classs;

import java.util.ArrayList;
import java.util.Scanner;

/*
Realizar un programa que permita calcular el área de polígonos (triángulos y rectángulos), 
el programa debe de almacenar en un arreglo N triángulos y N rectángulos,
y al final debe mostrar el área y los datos de cada uno. Para ello se debe tener las siguientes clases:
    - Polígono (super clase o clase padre)
    - Triángulo (sub clase o clase hija)
    - Rectángulo (sub clase o clase hija)

 */
public class Main {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entradaT = new Scanner(System.in);

    public static void main(String[] args) {
        //llenar poligono
        llenarPoligono();

        //mostrar datos
        mostrarResultados();
    }

    public static void llenarPoligono() {
        int opc;
        char rpta;
        do {
            do {
                System.out.println("Selecciona el tipo de polígono que deseas ingresar: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectángulo");
                System.out.println("Opción: ");
                opc = entradaT.nextInt();
            } while (opc < 1 || opc > 2);

            switch (opc) {
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }
            System.out.println("\n¿Deseas ingresar ingresar otro polígono? (S/N)");
            rpta = entradaT.next().charAt(0);
            
        } while (rpta == 'S' || rpta == 's');
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.println("\nIngresa el primer lado del triángulo: ");
        lado1 = entradaT.nextDouble();
        System.out.println("\nIngresa el segundo lado del triángulo: ");
        lado2 = entradaT.nextDouble();
        System.out.println("\nIngresa el tercer lado del triángulo: ");
        lado3 = entradaT.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double base, altura;
        
        System.out.println("\nIngresa la base del rectángulo: ");
        base = entradaT.nextDouble();
        System.out.println("\nIngresa la altura del rectángulo: ");
        altura = entradaT.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        for (Poligono pol: poligono){
            System.out.println(pol.toString());
            System.out.println("Area: " + pol.area());
            System.out.println("");
        }
    }
}
