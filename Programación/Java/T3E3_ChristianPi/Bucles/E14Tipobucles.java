/*Pedimos al usuario que introduzca el nr de filas y columnas que quiera tener para que se imprima el nr de asteriscos */
import java.util.Scanner;
public class E14Tipobucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();
        //Recorro todas las filas y columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
        }
        scanner.close();
    }
}
