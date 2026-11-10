import java.util.Scanner;

public class T3E2ChristianPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------Ejercicios con condicionales multiples y bucles while-------------");

        //Ahora pondré todos los ejercicios que toca enviar
        System.out.println("\n----------Ejercicios con condicionales multiples y bucles while---------");
        System.out.println("1. Parque Acuático (T3E2_1)");
                System.out.println("2. Precio Hotel (T3E2_2)");
                System.out.println("3. Semáforo (T3E2_3)");
                System.out.println("4. Estaciones (T3E2_4)");
                System.out.println("5. Calculadora (T3E2_5)");
                System.out.println("6. Día de la semana (T3E2_6)");
                System.out.println("7. Mes del año (T3E2_7)");
                System.out.print("Elige una opción (1-7): ");
                
                int opcionMenu = sc.nextInt();
        
                switch (opcionMenu) {
        
                    // =========================================================
                    // Ejercicio 1: T3E2_1_ParqueAcuatico
                    // =========================================================
                    case 1:
                        System.out.println("\n--- T3E2_1: PARQUE ACUÁTICO ---");
                        System.out.print("Entradas adulto medio día (25€): ");
                        int advMedio = sc.nextInt();
                        System.out.print("Entradas adulto día completo (40€): ");
                        int advCompleto = sc.nextInt();
        
                        System.out.print("Entradas niño medio día (17,50€): ");
                        int ninoMedio = sc.nextInt();
                        System.out.print("Entradas niño día completo (28€): ");
                        int ninoCompleto = sc.nextInt();
        
                        System.out.print("Cantidad de tumbonas extra (3€/unidad): ");
                        int tumbonas = sc.nextInt();
                        System.out.print("Cantidad de consignas extra (1€/unidad): ");
                        int consignas = sc.nextInt();
        
                        double totalEntradas = (advMedio * 25.0) + (advCompleto * 40.0) 
                                             + (ninoMedio * 17.50) + (ninoCompleto * 28.0);
                        double totalExtras1 = (tumbonas * 3.0) + (consignas * 1.0);
                        double totalParque = totalEntradas + totalExtras1;
        
                        System.out.println("\n--- RESUMEN DE RESERVA ---");
                        System.out.println("Entradas adultos (Medio/Completo): " + advMedio + " / " + advCompleto);
                        System.out.println("Entradas niños (Medio/Completo): " + ninoMedio + " / " + ninoCompleto);
                        System.out.println("Extras - Tumbonas: " + tumbonas + " | Consignas: " + consignas);
                        System.out.println("Importe total entradas: " + totalEntradas + "€");
                        System.out.println("Importe total extras: " + totalExtras1 + "€");
                        System.out.println("IMPORTE TOTAL: " + totalParque + "€");
                        break;
        
                    // =========================================================
                    // Ejercicio 2: T3E2_2_PrecioHotel
                    // =========================================================
                    case 2:
                        System.out.println("\n--- T3E2_2: PRECIO HOTEL ---");
                        System.out.print("Número de personas: ");
                        int numPersonas = sc.nextInt();
                        System.out.print("Número de noches: ");
                        int noches = sc.nextInt();
        
                        System.out.println("Seleccione régimen de estancia:");
                        System.out.println("1 - AD (Alojamiento y Desayuno: 130€/noche hab. doble)");
                        System.out.println("2 - MP (Media Pensión: 180€/noche hab. doble)");
                        System.out.println("3 - PC (Pensión Completa: 230€/noche hab. doble)");
                        System.out.print("Opción régimen: ");
                        int regOp = sc.nextInt();
        
                        double precioHabDoble = 0;
                        switch (regOp) {
                            case 1: precioHabDoble = 130.0; break;
                            case 2: precioHabDoble = 180.0; break;
                            case 3: precioHabDoble = 230.0; break;
                            default: 
                                System.out.println("Régimen no válido. Se asigna AD por defecto.");
                                precioHabDoble = 130.0; 
                                break;
                        }
        
                        System.out.print("Noches de parking (10€/noche): ");
                        int nochesParking = sc.nextInt();
                        System.out.print("Personas para visita al centro histórico (35€/persona): ");
                        int persVisita = sc.nextInt();
                        System.out.print("Personas para cata de vinos (27€/persona): ");
                        int persCata = sc.nextInt();
        
                        // Cálculo de habitaciones dobles e individuales
                        int habDoblesPares = numPersonas / 2;
                        boolean tieneHabIndividual = (numPersonas % 2 != 0);
        
                        double costeHabNoche = (habDoblesPares * precioHabDoble);
                        if (tieneHabIndividual) {
                            // Habitación con 1 sola persona -> 35% de descuento
                            costeHabNoche += (precioHabDoble * 0.65);
                        }
        
                        double subtotalHotel = costeHabNoche * noches;
                        double subtotalExtras2 = (nochesParking * 10.0) + (persVisita * 35.0) + (persCata * 27.0);
                        double totalHotel = subtotalHotel + subtotalExtras2;
        
                        System.out.println("\n--- RESUMEN DE LA ESTANCIA ---");
                        System.out.println("Habitaciones dobles (2 pers): " + habDoblesPares);
                        System.out.println("Habitaciones uso individual (desc. 35%): " + (tieneHabIndividual ? 1 : 0));
                        System.out.println("Subtotal alojamiento: " + subtotalHotel + "€");
                        System.out.println("Subtotal extras: " + subtotalExtras2 + "€");
                        System.out.println("IMPORTE TOTAL ESTANCIA: " + totalHotel + "€");
                        break;
        
                    // =========================================================
                    // Ejercicio 3: T3E2_3_Semáforo
                    // =========================================================
                    case 3:
                        System.out.println("\n--- T3E2_3: SEMÁFORO ---");
                        System.out.print("Introduce un color del semáforo (rojo/amarillo/verde): ");
                        String color = sc.next().toLowerCase();
        
                        switch (color) {
                            case "rojo":
                                System.out.println("Acción: PARAR");
                                break;
                            case "amarillo":
                                System.out.println("Acción: FRENAR / PRECAUCIÓN");
                                break;
                            case "verde":
                                System.out.println("Acción: PASAR");
                                break;
                            default:
                                System.out.println("Color no válido.");
                                break;
                        }
                        break;
        
                    // =========================================================
                    // Ejercicio 4: T3E2_4_Estaciones
                    // =========================================================
                    case 4:
                        System.out.println("\n--- T3E2_4: ESTACIONES DEL AÑO ---");
                        System.out.print("Introduce el número de mes (1-12): ");
                        int mesEstacion = sc.nextInt();
        
                        switch (mesEstacion) {
                            case 12: case 1: case 2:
                                System.out.println("Estación: Invierno");
                                break;
                            case 3: case 4: case 5:
                                System.out.println("Estación: Primavera");
                                break;
                            case 6: case 7: case 8:
                                System.out.println("Estación: Verano");
                                break;
                            case 9: case 10: case 11:
                                System.out.println("Estación: Otoño");
                                break;
                            default:
                                System.out.println("Número de mes no válido.");
                                break;
                        }
                        break;
        
                    // =========================================================
                    // Ejercicio 5: T3E2_5_Calculadora
                    // =========================================================
                    case 5:
                        System.out.println("\n--- T3E2_5: CALCULADORA ---");
                        System.out.println("1. Suma");
                        System.out.println("2. Resta");
                        System.out.println("3. Multiplicación");
                        System.out.println("4. División");
                        System.out.println("5. Raíz cuadrada");
                        System.out.println("6. Ecuación de 2º grado");
                        System.out.print("Elige una operación: ");
                        int operacion = sc.nextInt();
        
                        switch (operacion) {
                            case 1: // Suma
                                System.out.print("Número 1: ");
                                double s1 = sc.nextDouble();
                                System.out.print("Número 2: ");
                                double s2 = sc.nextDouble();
                                System.out.println("Resultado: " + (s1 + s2));
                                break;
                            case 2: // Resta
                                System.out.print("Número 1: ");
                                double r1 = sc.nextDouble();
                                System.out.print("Número 2: ");
                                double r2 = sc.nextDouble();
                                System.out.println("Resultado: " + (r1 - r2));
                                break;
                            case 3: // Multiplicación
                                System.out.print("Número 1: ");
                                double m1 = sc.nextDouble();
                                System.out.print("Número 2: ");
                                double m2 = sc.nextDouble();
                                System.out.println("Resultado: " + (m1 * m2));
                                break;
                            case 4: // División
                                System.out.print("Numerador: ");
                                double d1 = sc.nextDouble();
                                System.out.print("Denominador: ");
                                double d2 = sc.nextDouble();
                                if (d2 != 0) {
                                    System.out.println("Resultado: " + (d1 / d2));
                                } else {
                                    System.out.println("Error: División por cero no permitida.");
                                }
                                break;
                            case 5: // Raíz cuadrada
                                System.out.print("Introduce un número: ");
                                double numRaiz = sc.nextDouble();
                                if (numRaiz >= 0) {
                                    System.out.println("Raíz cuadrada: " + Math.sqrt(numRaiz));
                                } else {
                                    System.out.println("Error: No existe raíz real para números negativos.");
                                }
                                break;
                            case 6: // Ecuación 2º grado: ax^2 + bx + c = 0
                                System.out.print("Coeficiente a: ");
                                double a = sc.nextDouble();
                                System.out.print("Coeficiente b: ");
                                double b = sc.nextDouble();
                                System.out.print("Coeficiente c: ");
                                double c = sc.nextDouble();
        
                                if (a == 0) {
                                    System.out.println("No es una ecuación de 2º grado (a no puede ser 0).");
                                } else {
                                    double discriminante = (b * b) - (4 * a * c);
                                    if (discriminante > 0) {
                                        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                                        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                                        System.out.println("Dos soluciones reales: x1 = " + x1 + ", x2 = " + x2);
                                    } else if (discriminante == 0) {
                                        double x = -b / (2 * a);
                                        System.out.println("Una solución real única: x = " + x);
                                    } else {
                                        System.out.println("No existen soluciones en el conjunto de los números reales.");
                                    }
                                }
                                break;
                            default:
                                System.out.println("Operación no válida.");
                                break;
                        }
                        break;
        
                    // =========================================================
                    // Ejercicio 6: T3E2_6_DiaSemana
                    // =========================================================
                    case 6:
                        System.out.println("\n--- T3E2_6: DÍA DE LA SEMANA ---");
                        System.out.print("Introduce un número (1-7): ");
                        int dia = sc.nextInt();
        
                        switch (dia) {
                            case 1: System.out.println("1 - Lunes"); break;
                            case 2: System.out.println("2 - Martes"); break;
                            case 3: System.out.println("3 - Miércoles"); break;
                            case 4: System.out.println("4 - Jueves"); break;
                            case 5: System.out.println("5 - Viernes"); break;
                            case 6: System.out.println("6 - Sábado"); break;
                            case 7: System.out.println("7 - Domingo"); break;
                            default: System.out.println("Error: Número incorrecto (debe ser de 1 a 7)."); break;
                        }
                        break;
        
                    // =========================================================
                    // Ejercicio 7: T3E2_7_Mes
                    // =========================================================
                    case 7:
                        System.out.println("\n--- T3E2_7: MES DEL AÑO ---");
                        System.out.print("Introduce un número (1-12): ");
                        int mesNum = sc.nextInt();
        
                        switch (mesNum) {
                            case 1: System.out.println("1 - Enero"); break;
                            case 2: System.out.println("2 - Febrero"); break;
                            case 3: System.out.println("3 - Marzo"); break;
                            case 4: System.out.println("4 - Abril"); break;
                            case 5: System.out.println("5 - Mayo"); break;
                            case 6: System.out.println("6 - Junio"); break;
                            case 7: System.out.println("7 - Julio"); break;
                            case 8: System.out.println("8 - Agosto"); break;
                            case 9: System.out.println("9 - Septiembre"); break;
                            case 10: System.out.println("10 - Octubre"); break;
                            case 11: System.out.println("11 - Noviembre"); break;
                            case 12: System.out.println("12 - Diciembre"); break;
                            default: System.out.println("Error: Número incorrecto (debe ser de 1 a 12)."); break;
                        }
                        break;
        
                    default:
                        System.out.println("Opción de menú no válida.");
                        break;
                }
        
                sc.close();
            }

    }

