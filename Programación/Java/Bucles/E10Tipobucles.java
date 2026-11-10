/*En este ejercício usaremos un bucle for para crear una semisuma la cual sumará del 1 al 1000 */
public class E10Tipobucles {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 1000; i++) {
            suma += i;
        }
        System.out.println("La suma del 1 al 1000 es: " + suma);
    }
}
