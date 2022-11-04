
package ClasesyObjetos;


public class Calculadora {
    //Atributos
    int suma;
    int resta;
    
    //Métodos
    public int sumar(int num1, int num2){
        suma = num1 + num2;
        return suma;
    }
    

    public int restar(int num1, int num2){
        resta = num1 - num2;
        return resta;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
    }
}
