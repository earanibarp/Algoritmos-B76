package ClaseObjeto;

public class Main {
    public static void main(String [] args){
        Persona p1 = new Persona("Luis", 20);
        p1.setEdad(1000);
        System.out.println("Tienes " + p1.getEdad() + " años");
    }
}
