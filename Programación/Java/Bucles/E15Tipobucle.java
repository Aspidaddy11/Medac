import java.util.Scanner;
/*En este ejercício crearemos la tabla de multiplicación en el cual le pediremos al usuario que número vas a usar para la tabla demultiplicación*/
public class E15Tipobucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla;
        System.out.println("que tabla quieres consultar");
        tabla = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.print("\n" + tabla + "X" + "i" + "=" + tabla*i);
            System.out.printf("\n%d * %d = %d",tabla, i,tabla*i);
        }
        sc.close();
    }
}
