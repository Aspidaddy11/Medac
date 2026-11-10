 import java.util.Scanner;
    
    public class T5E1_3_Collatz {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long numero;
    
            // Lectura y validación de entrada
            do {
                System.out.print("Introduce un número entero positivo: ");
                while (!scanner.hasNextLong()) {
                    System.out.println("Error: Debes ingresar un número entero válido.");
                    scanner.next();
                }
                numero = scanner.nextLong();
                if (numero <= 0) {
                    System.out.println("El número debe ser mayor que 0.");
                }
            } while (numero <= 0);
    
            System.out.println("\n--- Secuencia de Collatz para n = " + numero + " ---");
            int pasos = resolverCollatzRecursivo(numero, 0);
            System.out.println("\n\nSe alcanzó el valor 1 en " + pasos + " pasos.");
    
            scanner.close();
        }
    
        
        public static int resolverCollatzRecursivo(long n, int pasos) {
            // Imprimir el estado actual
            System.out.print(n + " ");
    
            // Caso base: si alcanzamos el 1, detendremos la recursión
            if (n == 1) {
                return pasos;
            }
    
            // Caso inductivo: comprobación de paridad
            if (n % 2 == 0) {
                return resolverCollatzRecursivo(n / 2, pasos + 1);
            } else {
                return resolverCollatzRecursivo(3 * n + 1, pasos + 1);
            }
        }
    }

