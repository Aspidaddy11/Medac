/*En este ejercício calcularemos la factorial de un número */
import java.util.Scanner;
public class E11Tipobucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini, fin;
        System.out.println("Ingrese el valor inicial: ");
        ini = sc.nextInt();
        System.out.println("Ingrese el valor final: ");
        fin = sc.nextInt();
        int sum2 = ((fin - ini + 1) * (ini + fin)) / 2;
        System.out.println("La suma de los números entre " + ini + " y " + fin + " es: " + sum2);
        System.out.println("Ingrese un número para calcular su factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        sc.close();
    }
}