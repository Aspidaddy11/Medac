/*A continuación haremos una tabla de multiplicación del 1 hasta al 10 */

public class E16Tipobucle {
    public static void main(String[] args) {
        int tabla;

        //Recorre las tablas de multiplicar
        
         for (int i = 0; i <= 10; i++) {
           // System.out.print("\n tabla del" +i);
           // System.out.print("\n --------------- \n\n");
           // Recorre cada fila de una tabla de multiplicar
            for (int j = 0; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i*j) + "\t");
                System.out.print("\t");
            }
        } 
    }
}
