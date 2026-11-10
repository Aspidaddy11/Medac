import java.util.Scanner;

public class CalculadoraFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora de Factorial ===");
        System.out.print("Introduce un número entero positivo: ");
        
        // Validamos que la entrada sea un número entero
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            
            // Verificamos que el número no sea negativo
            if (numero < 0) {
                System.out.println("Error: El factorial no está definido para números negativos.");
            } else {
                long factorial = 1;
                
                // Bucle para calcular el factorial
                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }
                
                // Mostramos el resultado
                System.out.println("El factorial de " + numero + " es: " + factorial);
            }
        } else {
            System.out.println("Error: Debes introducir un número entero válido.");
        }
        
        scanner.close();
    }
}