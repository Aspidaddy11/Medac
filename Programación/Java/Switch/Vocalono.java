import java.util.Scanner;

public class Vocalono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("pon una letra: ");
        char letra = scanner.next().charAt(0);
        if (letra == 'a' || letra == 'A' 
            || letra == 'e' || letra == 'E' 
            || letra == 'i' || letra == 'I' 
            || letra == 'o' || letra == 'O' 
            || letra == 'u' || letra == 'U') {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("No es una vocal.");
        }
        scanner.close();
    }
}