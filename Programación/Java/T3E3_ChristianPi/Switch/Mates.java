/*En este programa crearemos opciones usando switch las cuales son: 
1. crear raiz cuadrada de un nr que nos de el usuario. 
2. logaritmo base 10 del numero que nos de el usuario. 
3. La factorial del numero que nos de el usuario. 
4. si el numero que nos da el usuario es primo o no */
import java.util.Scanner;
public class Mates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular raíz cuadrada");
        System.out.println("2. Calcular logaritmo base 10");
        System.out.println("3. Calcular factorial");
        System.out.println("4. Verificar si es primo");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese un numero para calcular su raiz cuadrada: ");
                double num = sc.nextDouble();
                double raiz = Math.sqrt(num);
                System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
                break;
            case 2:
                System.out.println("Ingrese un numero para calcular su logaritmo base 10: ");
                double num2 = sc.nextDouble();
                double logaritmo = Math.log10(num2);
                System.out.println("El logaritmo base 10 de " + num2 + " es: " + logaritmo);
                break;
            case 3:
            System.out.println("Ingrese un numero para calcular su factorial: ");
            int num3 = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= num3; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num3 + " es: " + factorial);
            break;
        case 4:
            System.out.println("Ingrese un numero para verificar si es primo: ");
            int num4 = sc.nextInt();
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num4); i++) {
                if (num4 % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            System.out.println("El numero " + num4 + " es: " + (esPrimo ? "primo" : "no primo"));
            break;

    }sc.close();
}
}
