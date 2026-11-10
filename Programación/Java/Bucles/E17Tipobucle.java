import java.util.Scanner;

public class E17Tipobucle {
    public static void main(String[] args) {
        boolean esprimo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        for (int i=2; i <=(numero-1); i++) {
            if (numero % i == 0) {
                esprimo = false;
                System.out.println("El numero"+numero+"No es primo");
                break;
            }
            if(esprimo){
                System.out.println("El numero"+numero+"Es primo");
                break;
            }
        }
        sc.close();
    }
}
