
package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        Calculadora calc1 = new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        calc1.sumar(num1, num2);
        calc1.restar(num1, num2);
        calc1.mostrarResultado();
    }
}
