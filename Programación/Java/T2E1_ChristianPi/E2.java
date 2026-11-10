import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculador de (Ax² + Bx + C)² ---");
        
        // Entrada de coeficientes y de la variable X
        System.out.print("Introduce el valor de A: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce el valor de B: ");
        double b = sc.nextDouble();
        
        System.out.print("Introduce el valor de C: ");
        double c = sc.nextDouble();
        
        System.out.print("Introduce el valor de X: ");
        double x = sc.nextDouble();
        
        // 1. Calculamos primero el interior del paréntesis: Ax² + Bx + C
        double resultado = (a * x * x) + (b * x) + c;
        
        System.out.println("El resultado final es: "+ resultado);
        
        sc.close();
    }
}
