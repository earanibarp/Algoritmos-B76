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
                case 1:
                    break;
                case 2:
                    break;
            }
            System.out.println("\n¿Deseas ingresas ingresar otro polígono? (S/N");
            rpta = entradaT.next().charAt(0);
            
        } while (rpta == 'S' || rpta == 's');
    }
}
