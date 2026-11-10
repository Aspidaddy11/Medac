import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante con el factor de conversión oficial
        final double Millas = 0.621371;

        System.out.println("--- Conversor de Kilómetros a Millas ---");
        
        // Lectura de la cantidad en kilómetros
        System.out.println("Introduce la distancia en kilómetros (km): ");
        double kilometros = scanner.nextDouble();
        double millas = kilometros * Millas;
        System.out.printf("%.2f km equivalen a %.2f millas.%n", kilometros, millas); //En este caso se utilizó el printf ya q es para strings
        
        scanner.close();
    }
}
