/*En este ejercício se creará el juego de la patata caliente cuya pregunta es cuando terminó la revolución francesa */
public class E9Tipobucles {
    public static void main(String[] args) {
        int r = 1799;
        System.out.println("¿Cuándo terminó la revolución francesa?");
        //Crearemos unos bucles y unas probabilidades las cuales nos dirán si estamos cerca de la fecha, lejos o es la fecha correcta.

        for (int respuestaUsuario = 0; respuestaUsuario != r;) {
            System.out.println("Introduce tu respuesta: ");
            respuestaUsuario = Integer.parseInt(System.console().readLine());
            if (respuestaUsuario < r) {
                System.out.println("Tu respuesta es mas corta, intenta de nuevo.");
            } else if (respuestaUsuario > r) {
                System.out.println("Tu respuesta es larga, intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has acertado la fecha correcta.");
                System.out.println("La respuesta era: " + r);
            }
        }
    }
}
