
import java.util.Scanner;
public class E3Tipobucles {
    public static void main(String[] args) {
        /*En este ejercício vamos a calcular la media de 3 números */
        /*int valores = 0;
        int sumatorio = 0;
         */
        Scanner sc = new Scanner(System.in);
       int nr;
       int valores;
       int sumatorio;
       double media;

       System.out.println("Introduce el numero");
       nr = sc.nextInt();

       while (nr != 0) {
        valores++;
        sumatorio = sumatorio + nr;
       }
       if (valores !=0) {
        media = sc.nextInt();
       }
       System.out.println("\n La media de los nr introducidos es:" + media);
        sc.close();
    }
}
