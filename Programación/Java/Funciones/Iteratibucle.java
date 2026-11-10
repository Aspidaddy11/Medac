import java.util.Scanner;

public class Iteratibucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (entero): ");
        int exponente = scanner.nextInt();

        if (base == 0 && exponente < 0) {
            System.out.println("Error: no se puede elevar cero a un exponente negativo.");
        } else {
            double resultado = elevadoIterativo(base, exponente);
            System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        }

        scanner.close();
    }

    public static double elevadoIterativo(double base, int exponente) {
        double resultado = 1;
        long exponenteAbsoluto = Math.abs((long) exponente);

        for (long i = 0; i < exponenteAbsoluto; i++) {
            resultado *= base;
        }

        return exponente < 0 ? 1 / resultado : resultado;
    }
}
