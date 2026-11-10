/*Usando la librería de math, vamos a pedir al usuario que eleve un número a la poténcia que quiera */
import java.util.Scanner;
public class E13Tipobucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la potencia: ");
        double exponente = scanner.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
