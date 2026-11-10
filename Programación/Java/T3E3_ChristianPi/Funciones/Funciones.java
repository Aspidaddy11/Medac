public class Funciones {
    public static void main(String[] args) {
        
        for(int num = 2; num <= 1000000; num++)
            if(esPrimo(num))
                System.out.println("\n" + num);
    }

    public static boolean esPrimo(int n){
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
}
