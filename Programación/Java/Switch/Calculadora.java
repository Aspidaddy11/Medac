import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        do {
            System.out.println("Elige una operación:");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("0 - Salir");
            op = sc.nextInt();
            
            if (op >= 1 && op <= 4) {
                System.out.print("Introduzca el primer número: ");
                double num1 = sc.nextDouble();
                System.out.print("Introduzca el segundo número: ");
                double num2 = sc.nextDouble();
                
                switch (op) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (op != 0) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (op != 0);
        System.out.println("Gracias por usar la calculadora.");
        sc.close();
    }
}
