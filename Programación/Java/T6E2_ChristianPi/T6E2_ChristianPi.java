package T6E2_ChristianPi;
import java.util.Random;
public class T6E2_ChristianPi {
    public static void main(String[] args) {
        final int TAMANO = 100;
                final int MIN_VALOR = -50;
                final int MAX_VALOR = 50;
        
                // 1. Declaración e inicialización del vector de 100 elementos enteros
                int[] vector = new int[TAMANO];
                Random random = new Random();
        
                // Rellenar el vector con valores aleatorios dentro del rango [-50, 50]
                for (int i = 0; i < vector.length; i++) {
                    // random.nextInt(101) genera valores de 0 a 100. Restando 50 se obtiene el rango de -50 a 50.
                    vector[i] = random.nextInt(MAX_VALOR - MIN_VALOR + 1) + MIN_VALOR;
                }
        
                // Mostrar vector original
                System.out.println("=== VECTOR ORIGINAL (SIN ORDENAR) ===");
                mostrarVector(vector);
        
                // 2. Ordenación mediante el algoritmo de la burbuja
                ordenarBurbuja(vector);
        
                // Mostrar vector ordenado
                System.out.println("\n=== VECTOR ORDENADO (ALGORITMO DE LA BURBUJA) ===");
                mostrarVector(vector);
            }
        
            /**
             * Ordena un vector de enteros de menor a mayor aplicando el método de la burbuja.
             * Compara elementos adyacentes e intercambia sus posiciones si están desordenados.
             *
             * @param array Vector de enteros a ordenar.
             */
            public static void ordenarBurbuja(int[] array) {
                int n = array.length;
                boolean intercambiado;
        
                for (int i = 0; i < n - 1; i++) {
                    intercambiado = false;
                    for (int j = 0; j < n - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            // Intercambio de valores (swap)
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                            intercambiado = true;
                        }
                    }
                    // Si en una pasada no se realizó ningún intercambio, el vector ya está completamente ordenado
                    if (!intercambiado) {
                        break;
                    }
                }
            }
        
            /**
             * Imprime por pantalla el contenido del vector organizado en filas de 10 elementos.
             *
             * @param array Vector de enteros a mostrar.
             */
            public static void mostrarVector(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    System.out.printf("%4d ", array[i]);
                    if ((i + 1) % 10 == 0) {
                        System.out.println();
                    }
                }
            }
    }
