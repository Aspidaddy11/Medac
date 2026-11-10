/*En este ejercício iremos con  */
import java.util.Scanner;
public class E6Tipobucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini = 1;
        int fin = 1000;
        int cont = ini;
        while (cont <= fin) {
            if (cont % 2 == 0) {
                System.out.println(cont + " es par");
            }
            if (cont % 5 == 0) {
                System.out.println(cont + " es multiple de 5");
            }
            cont++;
        }
    }
}
