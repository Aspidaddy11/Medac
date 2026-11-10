import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculadora Geométrica con Math ---");
        
        // Lectura del radio
        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();
        
        // Validación de que el radio sea un valor lógico
        if (radio < 0) {
            System.out.println("El radio no puede ser negativo.");
        } else {
            // 1. Longitud de la circunferencia: 2 * 𝝅 * r
            double longitud = 2 * Math.PI * radio;
            
            // 2. Área del círculo: 𝝅 * r²
            double area = Math.PI * Math.pow(radio, 2);
            
            // 3. Volumen de la esfera: (4/3) * 𝝅 * r³
            // Nota: Usamos 4.0 / 3.0 para que Java haga la división con decimales correcta
            double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
            
            // Mostrar los resultados formateados a 2 decimales
            System.out.println("\n--- Resultados ---");
            System.out.printf("Longitud de la circunferencia : %.2f%n", longitud);
            System.out.printf("Área del círculo              : %.2f%n", area);
            System.out.printf("Volumen de la esfera          : %.2f%n", volumen);
        }
        
        sc.close();
    }
}
