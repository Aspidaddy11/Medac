/*
Se pondrán ejercicios en base a un menú que aparecerá en consola,
con una variedad de ejercicios hechos con Scanner, condicionales,
bucles, uso de la librería Math, switch y más cosas.
*/
import java.util.Scanner;

public class Pretest {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Menú de ejercicios
        System.out.println("Bienvenido al Pretest de Java");
        System.out.println("Seleccione un ejercicio:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio navideño");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("En este ejercicio se pedirá al usuario que ingrese un número y se mostrará si es par o impar.");
                System.out.println("Ingrese un número:");
                int nn1 = sc.nextInt();
                if (nn1 % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
                break;

            case 2:
                System.out.println("En este ejercicio se utilizará el bucle for para mostrar los números del 1 al 10.");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;

            case 3:
                System.out.println("En este ejercicio, se utilizará el bucle while para mostrar los números del 1 al 10.");
                int i = 1;
                while (i <= 10) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();
                break;

            case 4:
                System.out.println("En este ejercicio, se pedirá al usuario que ingrese un número y se mostrará su raíz cuadrada utilizando la librería Math.");
                System.out.println("Ingrese un número:");
                double nn2 = sc.nextDouble();
                System.out.println("La raíz cuadrada de " + nn2 + " es: " + Math.sqrt(nn2));
                break;

            case 5:
                System.out.println("En este ejercicio, se pedirá al usuario que ingrese un número y se mostrará su valor absoluto utilizando la librería Math.");
                System.out.println("Ingrese un número:");
                double nn3 = sc.nextDouble();
                System.out.println("El valor absoluto de " + nn3 + " es: " + Math.abs(nn3));
                break;

            case 6:
                System.out.println("En este ejercicio, se pedirá al usuario que ingrese un número y se mostrará su valor redondeado utilizando la librería Math.");
                System.out.println("Ingrese un número:");
                double nn4 = sc.nextDouble();
                System.out.println("El valor redondeado de " + nn4 + " es: " + Math.round(nn4));
                break;

            case 7:
                System.out.println("En este ejercicio, se pedirá al usuario que ingrese el número de filas deseadas para construir un árbol navideño.");
                System.out.println("Ingrese el número de filas deseadas:");
                int nn5 = sc.nextInt();
                for (int j = 1; j <= nn5; j++) {
                    for (int k = 1; k <= nn5 - j; k++) {
                        System.out.print(" ");
                    }
                    for (int l = 1; l <= (2 * j - 1); l++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();
    }
}
