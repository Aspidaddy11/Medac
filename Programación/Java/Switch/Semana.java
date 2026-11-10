import java.util.Scanner;
public class Semana {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dia;
        System.out.println("Ingrese un número del 1 al 7 para saber el día de la semana: ");
        dia = sc.nextInt();
        String tipodia ="";
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                tipodia = "inicio de semana";
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                tipodia = "Inicio de fin de semana";
                break;
            case 6:
                System.out.println("Sábado");
                tipodia = "Fin de semana";
                break;
            case 7:
                System.out.println("Domingo");
                tipodia = "Fin de semana";
                break;
            default:
                System.out.println("Número inválido. Por favor ingrese un número del 1 al 7.");
        }
        if (!tipodia.isEmpty()) {
            System.out.println("Tipo de día: " + tipodia);
        }
        sc.close();
    }
}
