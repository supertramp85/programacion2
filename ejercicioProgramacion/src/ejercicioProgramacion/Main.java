package ejercicioProgramacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear la persona usando los datos ingresados
        Persona persona = crearPersona(scanner);
        
        // Mostrar la información de la persona
        persona.mostrarInformacion();
        
        scanner.close();
    }
    
    // Método para crear un objeto Persona
    public static Persona crearPersona(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        return new Persona(nombre, edad);
    }
}
