//Este ejercício consta en utilizar el bucle while para crear como un juego de la patata caliente, en el que el usuario tiene que adivinar el año de la Revolución Francesa, y tiene 3 intentos para acertar. Si falla, se le indica cuántos intentos le quedan y se le vuelve a pedir que introduzca el año. Si acierta, se le felicita.
package Bucles;
import java.util.Scanner;
public class E1Tipobucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyo;
        int intentos = 2;
        System.out.println("Introduce el año fue la Revolucion Francesa : ");
        anyo = sc.nextInt();

        if (anyo == 1789) {
            System.out.println("Felicidades!! Es la fecha correcta");
        } else {
            System.out.println("Has fallado :-(");
        }

        while (anyo != 1789 && intentos > 1) {
            System.out.println("Has fallado, te quedan " + intentos + " intentos");
            System.out.println("Introduce el año fue la Revolucion Francesa : ");
            anyo = sc.nextInt();
            intentos--;

        }
        sc.close();
    }
}
