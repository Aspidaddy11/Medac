import java.util.Scanner;
public class E4Tipobucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini = -1000000000;
        int fin = 1;
        int cont;

        cont = ini;
        while (cont <= fin) {
            System.out.println(cont);
            cont++;
        }
        sc.close();
    }
}
