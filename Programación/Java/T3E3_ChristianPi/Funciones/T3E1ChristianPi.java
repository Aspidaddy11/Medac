package Programación.Java.Funciones;
import java.util.Scanner;

public class T3E1ChristianPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n----------Ejercicios con condiciones simples-----------");
        System.out.println("\nSelecciona un ejercicio hecho: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Año bisiesto");
        System.out.println("3. DiaSiguienteSimplificado");
        System.out.println("4. DiaSiguiente");

        System.out.print("Introduce la opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("\n-------------Programa que te dice que tipo de triángulo es:-----------");
                System.out.print("Introduce la longitud del primer lado: ");
                double lado1 = sc.nextDouble();
                System.out.print("Introduce la longitud del segundo lado: ");
                double lado2 = sc.nextDouble();
                System.out.print("Introduce la longitud del tercer lado: ");
                double lado3 = sc.nextDouble();

                double a, b, c;
                if (lado1 >= lado2 && lado1 >= lado3) {
                    a = lado1;
                    b = lado2;
                    c = lado3;
                } else if (lado2 >= lado1 && lado2 >= lado3) {
                    a = lado2;
                    b = lado1;
                    c = lado3;
                } else {
                    a = lado3;
                    b = lado1;
                    c = lado2;
                }

                if (a >= b + c) {
                    System.out.println("No se trata de un triángulo.");
                } else if (a * a == b * b + c * c) {
                    System.out.println("Es un triángulo rectángulo.");
                } else if (a * a < b * b + c * c) {
                    System.out.println("Es un triángulo acutángulo.");
                } else {
                    System.out.println("Es un triángulo obtusángulo.");
                }
                break;
            }

            case 2: {
                System.out.println("\n----------------Programa que te dice si un año es bisiesto o no---------------");
                System.out.print("Introduce un año: ");
                int anio = sc.nextInt();

                boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

                if (esBisiesto) {
                    System.out.println("El año " + anio + " ES bisiesto.");
                } else {
                    System.out.println("El año " + anio + " NO es bisiesto.");
                }
                break;
            }

            case 3: {
                System.out.println("\n------------------Programa simplificado el cual dice cual sería el siguiente dia {SIMPLIFICADO}-----------------");
                System.out.print("Introduce el día: ");
                int dia = sc.nextInt();

                System.out.print("Introduce el mes: ");
                int mes = sc.nextInt();

                System.out.print("Introduce el año: ");
                int ano = sc.nextInt();

                dia++;

                if (dia > 30) {
                    dia = 1;
                    mes++;

                    if (mes > 12) {
                        mes = 1;
                        ano++;
                    }
                }

                System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + ano);
                break;
            }

            case 4: {
                System.out.println("\n---------------Programa que explica cuando sería el dia siguiente {No simplificado}----------------------------");
                System.out.print("Introduce el día: ");
                int dia = sc.nextInt();

                System.out.print("Introduce el mes: ");
                int mes = sc.nextInt();

                System.out.print("Introduce el año: ");
                int anio = sc.nextInt();

                int diasMes;

                switch (mes) {
                    case 2:
                        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                            diasMes = 29;
                        } else {
                            diasMes = 28;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        diasMes = 30;
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diasMes = 31;
                        break;
                    default:
                        diasMes = 30;
                        break;
                }

                dia++;

                if (dia > diasMes) {
                    dia = 1;
                    mes++;

                    if (mes > 12) {
                        mes = 1;
                        anio++;
                    }
                }

                System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);
                break;
            }

            default:
                System.out.println("Opción no válida.");
                break;
        }

        sc.close();
    }
}

