import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculador de Resistencia Equivalente en Paralelo ---");
        
        // Lectura de la primera resistencia
        System.out.print("Introduce el valor de R1 (en ohmios): ");
        double r1 = sc.nextDouble();
        
        // Lectura de la segunda resistencia
        System.out.print("Introduce el valor de R2 (en ohmios): ");
        double r2 = sc.nextDouble();
        
        // Validación de valores físicos
        if (r1 < 0 || r2 < 0) {
            System.out.println("Error: Los valores de las resistencias no pueden ser negativos.");
        } else if (r1 + r2 == 0) {
            System.out.println("Error: Ambas resistencias no pueden ser cero (división por cero indefinida).");
        } else {
            // Aplicación de la fórmula: Req = (R1 * R2) / (R1 + R2)
            double rEq = (r1 * r2) / (r1 + r2);
            
            // Mostrar el resultado formateado a 2 decimales
            System.out.printf("%n La resistencia equivalente en paralelo es: %.2f %n", rEq);
        }
        
        sc.close();
    }
}
