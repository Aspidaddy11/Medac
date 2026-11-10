import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        switch (opcion) {

    // 1. CONVERSIÓN DE TEMPERATURAS (T4E2_1)
    case 1:
        System.out.println("\n--- CONVERSIÓN DE TEMPERATURAS ---");
        System.out.println("a) Celsius a Fahrenheit | b) Fahrenheit a Celsius | c) Celsius a Kelvin | d) Kelvin a Celsius");
        System.out.print("Elija una opción: ");
        String opTemp = sc.next().toLowerCase();

        switch (opTemp) {
            case "a":
                System.out.print("Temperatura en ºC: ");
                double c = sc.nextDouble();
                System.out.printf("%.2f ºC = %.2f ºF\n", c, (c * 9.0 / 5.0) + 32.0);
                break;
            case "b":
                System.out.print("Temperatura en ºF: ");
                double f = sc.nextDouble();
                System.out.printf("%.2f ºF = %.2f ºC\n", f, (f - 32.0) * 5.0 / 9.0);
                break;
            case "c":
                System.out.print("Temperatura en ºC: ");
                double cK = sc.nextDouble();
                System.out.printf("%.2f ºC = %.2f K\n", cK, cK + 273.15);
                break;
            case "d":
                System.out.print("Temperatura en K: ");
                double k = sc.nextDouble();
                System.out.printf("%.2f K = %.2f ºC\n", k, k - 273.15);
                break;
            default:
                System.out.println("Opción de temperatura no válida.");
        }
        break;

    // 2. GENERADOR DE FACTURAS (T4E2_2)
    case 2:
        System.out.println("\n--- FACTURA CON IVA ---");
        double baseTotal = 0.0, ivaTotal = 0.0;
        String continuar;
        do {
            sc.nextLine(); // Limpiar búfer de entrada
            System.out.print("Nombre del producto: ");
            String prod = sc.nextLine();
            System.out.print("Cantidad: ");
            int cant = sc.nextInt();
            System.out.print("Precio unitario (€): ");
            double precio = sc.nextDouble();

            System.out.print("Tipo de IVA (1: Normal 21%, 2: Reducido 10%, 3: Superreducido 4%): ");
            int tipoIva = sc.nextInt();
            double pctIva = (tipoIva == 2) ? 0.10 : (tipoIva == 3) ? 0.04 : 0.21;

            double subtotal = cant * precio;
            double ivaLinea = subtotal * pctIva;
            baseTotal += subtotal;
            ivaTotal += ivaLinea;

            System.out.printf("Línea añadida: %s x%d = %.2f€ (IVA: %.2f€)\n", prod, cant, subtotal, ivaLinea);
            System.out.print("¿Añadir otro producto? (s/n): ");
            continuar = sc.next().toLowerCase();
        } while (continuar.equals("s"));

        System.out.printf("\nBASE IMPONIBLE: %.2f € | TOTAL IVA: %.2f € | IMPORTE TOTAL: %.2f €\n", 
                          baseTotal, ivaTotal, baseTotal + ivaTotal);
        break;

    // 3. COMBINATORIA (T4E2_3)
    case 3:
        System.out.println("\n--- CÁLCULOS COMBINATORIOS ---");
        System.out.println("C: Comb. sin rep. | V: Var. sin rep. | P: Permutación");
        System.out.println("CR: Comb. con rep. | VR: Var. con rep. | PR: Perm. con rep.");
        System.out.print("Seleccione fórmula: ");
        String opComb = sc.next().toUpperCase();

        switch (opComb) {
            case "C":
                System.out.print("Total elementos (n): "); long nC = sc.nextLong();
                System.out.print("Elementos a elegir (k): "); long kC = sc.nextLong();
                long cRes = 1;
                for (long i = 1; i <= kC; i++) cRes = cRes * (nC - i + 1) / i;
                System.out.println("C(" + nC + ", " + kC + ") = " + cRes);
                break;
            case "V":
                System.out.print("n: "); long nV = sc.nextLong();
                System.out.print("k: "); long kV = sc.nextLong();
                long vRes = 1;
                for (long i = 0; i < kV; i++) vRes *= (nV - i);
                System.out.println("V(" + nV + ", " + kV + ") = " + vRes);
                break;
            case "P":
                System.out.print("n: "); long nP = sc.nextLong();
                long pRes = 1;
                for (long i = 1; i <= nP; i++) pRes *= i;
                System.out.println("P(" + nP + ") = " + pRes);
                break;
            case "CR":
                System.out.print("n: "); long nCR = sc.nextLong();
                System.out.print("k: "); long kCR = sc.nextLong();
                long nCR_val = nCR + kCR - 1, crRes = 1;
                for (long i = 1; i <= kCR; i++) crRes = crRes * (nCR_val - i + 1) / i;
                System.out.println("CR(" + nCR + ", " + kCR + ") = " + crRes);
                break;
            case "VR":
                System.out.print("n (base): "); long nVR = sc.nextLong();
                System.out.print("k (exponente): "); long kVR = sc.nextLong();
                System.out.println("VR(" + nVR + ", " + kVR + ") = " + (long) Math.pow(nVR, kVR));
                break;
            case "PR":
                System.out.print("n total: "); long nPR = sc.nextLong();
                System.out.print("k1: "); long k1 = sc.nextLong();
                System.out.print("k2: "); long k2 = sc.nextLong();
                long factN = 1, factK1 = 1, factK2 = 1;
                for (long i = 1; i <= nPR; i++) factN *= i;
                for (long i = 1; i <= k1; i++) factK1 *= i;
                for (long i = 1; i <= k2; i++) factK2 *= i;
                System.out.println("PR(" + nPR + "; " + k1 + ", " + k2 + ") = " + (factN / (factK1 * factK2)));
                break;
            default:
                System.out.println("Fórmula combinatoria no válida.");
        }
        break;

    // 4. PAR O IMPAR (Temario Tema 2/3)
    case 4:
        System.out.print("Ingrese un número entero: ");
        int numPar = sc.nextInt();
        System.out.println("El número " + numPar + " es " + (numPar % 2 == 0 ? "PAR." : "IMPAR."));
        break;

    // 5. SUMA HASTA NÚMERO NEGATIVO (Temario Tema 3)
    case 5:
        int sumaAcumulada = 0, valorIngresado;
        do {
            System.out.print("Ingrese un número (negativo para terminar): ");
            valorIngresado = sc.nextInt();
            if (valorIngresado >= 0) sumaAcumulada += valorIngresado;
        } while (valorIngresado >= 0);
        System.out.println("Suma total: " + sumaAcumulada);
        break;

    // 6. CUENTA ATRÁS (Temario Tema 4)
    case 6:
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("¡Despegue!");
        break;

    // 7. NÚMEROS COMPRENDIDOS ENTRE DOS ENTEROS (Temario Tema 4)
    case 7:
        System.out.print("Primer entero: ");
        int a = sc.nextInt();
        System.out.print("Segundo entero: ");
        int b = sc.nextInt();
        int min = Math.min(a, b), max = Math.max(a, b);
        System.out.println("Números entre " + min + " y " + max + ":");
        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        break;

    // 8. NOTA MEDIA EN ARRAY (Temario Tema 6)
    case 8:
        System.out.print("Cantidad de elementos: ");
        int tamNotas = sc.nextInt();
        int[] notas = new int[tamNotas];
        int sumaNotas = 0;
        for (int i = 0; i < tamNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            sumaNotas += notas[i];
        }
        System.out.printf("La nota media es: %.2f\n", (double) sumaNotas / tamNotas);
        break;

    // 9. CONTADOR DE VOCALES EN ARRAY DE CHAR (Temario Tema 6)
    case 9:
        System.out.print("Cantidad de caracteres: ");
        int tamChars = sc.nextInt();
        char[] caracteres = new char[tamChars];
        int totalVocales = 0;
        for (int i = 0; i < tamChars; i++) {
            System.out.print("Carácter " + (i + 1) + ": ");
            caracteres[i] = sc.next().charAt(0);
            char minus = Character.toLowerCase(caracteres[i]);
            if ("aeiou".indexOf(minus) != -1) totalVocales++;
        }
        System.out.println("Total de vocales: " + totalVocales);
        break;

    // 10. VALOR MÁXIMO EN ARRAY (Temario Tema 6)
    case 10:
        System.out.print("Tamaño del array: ");
        int tamMax = sc.nextInt();
        int[] arrMax = new int[tamMax];
        for (int i = 0; i < tamMax; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arrMax[i] = sc.nextInt();
        }
        int maximo = arrMax[0];
        for (int i = 1; i < arrMax.length; i++) {
            if (arrMax[i] > maximo) maximo = arrMax[i];
        }
        System.out.println("El valor máximo es: " + maximo);
        break;

    case 0:
        System.out.println("Saliendo...");
        break;

    default:
        System.out.println("Opción no válida.");
    }
    sc.close();
}

}
