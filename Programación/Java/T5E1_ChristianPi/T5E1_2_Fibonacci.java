import java.util.Scanner;

public class T5E1_2_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos de la serie de Fibonacci quieres mostrar?: ");
        int n = scanner.nextInt();
        
        // Validamos que el número sea al menos 1
        if (n <= 0) {
            System.out.println("Por favor, introduce un número mayor que 0.");
            scanner.close();
            return;
        }
        
        // Variables para los dos primeros números de la serie
        long a = 0;
        long b = 1;
        long ultimoTermino = 0;
        
        System.out.println("\n--- Serie de Fibonacci ---");
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a + " ");
                ultimoTermino = a;
            } else if (i == 2) {
                System.out.print(b + " ");
                ultimoTermino = b;
            } else {
                // Siguiente número es la suma de los dos anteriores
                long siguiente = a + b;
                System.out.print(siguiente + " ");
                
                // Actualizamos las variables para la siguiente vuelta
                a = b;
                b = siguiente;
                ultimoTermino = siguiente;
            }
        }
        
        System.out.println("\n--------------------------");
        System.out.println("El último término de la serie es: " + ultimoTermino);
        
        scanner.close();
    }
}