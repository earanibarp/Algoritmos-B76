package paquete;

public class Estatico {
    // Atributos
    private static String palabra = "Frase 1";
    
    //Método
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    
   public static void main(String[] args){
        System.out.println(Estatico.palabra);
        System.out.println("La suma de los números es: " + Estatico.sumar(5, 3));
    }
       
}
