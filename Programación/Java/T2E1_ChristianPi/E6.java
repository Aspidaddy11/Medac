import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculador de Mínimo Número de Billetes y Monedas ---");
        
        // Lectura de la cantidad de dinero
        System.out.print("Introduce una cantidad entera de dinero en euros (€): ");
        int cantidad = sc.nextInt();
        
        // Validación de cantidad positiva
        if (cantidad < 0) {
            System.out.println("La cantidad de dinero no puede ser negativa.");
        } else {
            System.out.println("\nPara formar " + cantidad + "€ se necesita el siguiente desglose mínimo:");
            
            // Cálculo de billetes de 50€
            int billetes50 = cantidad / 50;
            cantidad = cantidad % 50; // El resto de dinero que queda por desglosar
            
            // Cálculo de billetes de 20€
            int billetes20 = cantidad / 20;
            cantidad = cantidad % 20;
            
            // Cálculo de billetes de 10€
            int billetes10 = cantidad / 10;
            cantidad = cantidad % 10;
            
            // Cálculo de billetes de 5€
            int billetes5 = cantidad / 5;
            cantidad = cantidad % 5;
            
            // Cálculo de monedas de 2€
            int monedas2 = cantidad / 2;
            cantidad = cantidad % 2;
            
            // El resto final serán las monedas de 1€
            int monedas1 = cantidad;

            // Mostrar los resultados en pantalla (solo si la cantidad es mayor a 0)
            if (billetes50 > 0) System.out.println("- Billetes de 50€: " + billetes50);
            if (billetes20 > 0) System.out.println("- Billetes de 20€: " + billetes20);
            if (billetes10 > 0) System.out.println("- Billetes de 10€: " + billetes10);
            if (billetes5 > 0)  System.out.println("- Billetes de 5€ : " + billetes5);
            if (monedas2 > 0)   System.out.println("- Monedas de 2€  : " + monedas2);
            if (monedas1 > 0)   System.out.println("- Monedas de 1€  : " + monedas1);
            
            
        }
        
        sc.close();
    }
}
