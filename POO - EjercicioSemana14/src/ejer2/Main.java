package ejer2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Realizar un programa para simular un equipo de fútbol (entrenador, futbolista y doctor), para lo cual se tiene lo siguiente:
    -Persona (superclase): nombre, apellido y edad.
    -Entrenador (subclase): estrategia utilizada.
    -Futbolista (subclase): dorsal y posición.
    -Doctor (subclase): titulación y años de experiencia.
Además, se debe realizar un menú en donde se tengan las siguientes opciones: 
    -Viaje de equipo
    -Entrenamiento
    -Partido de fútbol
    -Planificar entrenamiento
    -Entrevista
    -Curar lesión
*/
public class Main {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entradaT = new Scanner(System.in);
    
    static Persona entrenador = new Entrenador("Agresiva", "Juan", "Perez", 42);
    static Persona futbolista1 = new Futbolista(5, "Delantero", "Benito", "Juarez", 32);
    static Persona futbolista2 = new Futbolista(10, "Defensa", "Alex", "Mendoza", 29);
    static Persona doctor = new Doctor("Fisioterapeuta", 10, "José", "Lianres", 40);
    
    public static void main(String[] args) {
        persona.add(entrenador);
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(doctor);
        
        menu();
    }
    
    public static void menu(){
        int opc;
        do{
            System.out.println("*************MENU***************");
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opc = entradaT.nextInt();
            
            switch (opc) {
                case 1: viajeEquipo();
                    break;
                case 2: entrenar();
                    break;
                case 3: partidoDeFutbol();
                    break;
                case 4: planificacionEntrenamiento();
                    break;
                case 5: darEntrevista();
                    break;
                case 6: curaLesion();
                    break;
                case 7: break;
                default:
                    System.out.println("Por favor, ingresa una de las alternativas que se muestra en el menú.");
            }
        }while(opc != 7);
    }
    
    public static void viajeEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + ": ");
            equipo.viajar();
        }
    }
    
    public static void entrenar(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + ": ");
            equipo.entrenamiento();
        }
    }
    
    public static void partidoDeFutbol(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos()+ ": ");
            equipo.partidoFutbol();
        }
    }
    
    public static void planificacionEntrenamiento(){
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellidos()+ ": ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    
    public static void darEntrevista(){
        System.out.print(futbolista1.getNombre() + " " + futbolista1.getApellidos()+ ": ");
        ((Futbolista)futbolista1).entrevista();
        
        System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellidos()+ ": ");
        ((Futbolista)futbolista2).entrevista();
    }
    
    public static void curaLesion(){
        System.out.print(doctor.getNombre() + " " + doctor.getApellidos()+ ": ");
        ((Doctor)doctor).curarLesion();
    }
}
