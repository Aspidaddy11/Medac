import java.util.Scanner;
public class pidoint {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num, cont=0, sum=0, min=999999999, max= -999999999;

        do {
            System.out.println("\n Introduce un numero");
            num = sc.nextInt();
            max = num;
            min = num;

        } while (num !=0) {
            cont++;
            sum += num;

            if (max < num) max = num;
            if (min > num) min = num;


            System.out.println("\nIntroduce un número");
            num = sc.nextInt();
        }
        System.out.println("\nEl número máximo es: " + max);
        System.out.println("\nEl número mínimo es: " + min);
        System.out.println("\nLa suma de los números es: " + sum);
        System.out.println("\nEl promedio de los números es: " + (double) sum / cont);
        sc.close();
    }
}
