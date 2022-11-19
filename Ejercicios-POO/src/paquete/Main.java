package paquete;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Cuadrilatero c1;
        //Scanner entradaT = new Scanner()
        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer lado: "));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo lado: "));
        
       if(lado1 == lado2){
           c1 = new Cuadrilatero(lado1);
       }
       else {
           c1 = new Cuadrilatero(lado1, lado2);
       }
       
        System.out.println("El perimetro es: " + c1.perimetro());
        System.out.println("El área es: " + c1.area());
    }
}
