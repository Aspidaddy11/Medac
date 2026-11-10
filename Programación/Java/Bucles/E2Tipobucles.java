import java.util.Scanner;
//En este ejercício se pide al usuario que imprima un nr entero, para esto se usará el bucle do while, el cual se ejecutará mientras el número ingresado sea menor a 10, y se imprimirá en pantalla el número ingresado.
public class E2Tipobucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int positivo = 0;
        int negativo = 0;
        System.out.print("Ingrese un número entero: ");
        n1 = sc.nextInt();

        if(n1 >0){
            positivo++;
        } 
        
        else if(n1 <0){
            negativo++;
        }
       System.out.println("\n Se han ingresado " + positivo + " números positivos y " + negativo + " números negativos.");

    sc.close();
    }
}
