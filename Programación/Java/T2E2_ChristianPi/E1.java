import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Registro de Usuario ---");
        
        // Lectura del nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.next();
        
        // Lectura del primer apellido
        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.next();
        
        // Lectura del segundo apellido
        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.next();
        
        // Construcción y muestra del mensaje final
        System.out.println("\nHola " + nombre + " " + apellido1 + " " + apellido2 + ", ¡bienvenido a Java!");
        
        sc.close();
    }
}
