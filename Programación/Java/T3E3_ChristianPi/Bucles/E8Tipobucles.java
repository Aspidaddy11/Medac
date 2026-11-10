/* En este programa vamos a usar el bucle for para crear intervalos de números */
import java.util.Scanner;
public class E8Tipobucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        for (int i = num; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
