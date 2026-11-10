import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Comprobador de Ecuaciones Ax + B = 0 ---");
        
        // Lectura de los coeficientes y de la incógnita
        System.out.print("Introduce el valor de A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Introduce el valor de B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Introduce el valor de X para comprobar: ");
        double x = scanner.nextDouble();
        
        // Calculamos el resultado del lado izquierdo de la ecuación
        double resultado = (a * x) + b;
        
       System.out.println("El resultado final es: " + resultado);
        
        scanner.close();
    }
}
