/*Ejemplo factorial copiado del profesor */
import java.util.Scanner;
public class E12Tipobucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.println("Ingrese un número para calcular su factorial: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);
        sc.close();
    }
}
