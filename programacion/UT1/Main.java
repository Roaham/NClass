import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
            Introduce Ejercicio:
            Actividad 2 [A]
            Actividad 3 [B]
            Actividad 4 [C]
            Actividad 5 [D]
            Actividad 6 [E]
            Actividad 7 [F]
            Actividad 8 [G]
            Actividad 9 [H]
            Actividad 10 [I]
            Actividad 11 [J]
            Actividad 13 [K]
                """);
        String option = sc.nextLine();

        switch (option) {

            case "A" -> {
                System.out.println("Bienvenido al comparador de números.");

                System.out.println("Introduce un número:");
                int number1 = sc.nextInt();

                System.out.println("Introduce otro número:");
                int number2 = sc.nextInt();

                if (number1 > number2) {
                    String mensage = String.format("El número %d es mayor que el %d.", number1 , number2);
                    System.out.println(mensage);
                }
                else if (number1 < number2) {
                    String mensage2 = String.format("El número %d es menor que el %d.", number1, number2);
                    System.out.println(mensage2);
                }
                else {
                    System.out.println("Son Iguales, que trolo eres eh?");
                }
            }

            case "B" -> {
                System.out.println("Bienvenido al ordenador de números.");

                System.out.println("Introduce un número:");
                int num1 = sc.nextInt();

                System.out.println("Introduce un segundo número:");
                int num2 = sc.nextInt();

                System.out.println("Introduce un tercer número:");
                int num3 = sc.nextInt();

                if (num1 <= num2 && num1 <= num3) {
                    if (num2 <= num3) {
                        System.out.println(num1 + ", " + num2 + ", " + num3);
                    } else {
                        System.out.println(num1 + ", " + num3 + ", " + num2);
                    }
                } else if (num2 <= num1 && num2 <= num3) {
                    if (num1 <= num3) {
                        System.out.println(num2 + ", " + num1 + ", " + num3);
                    } else {
                        System.out.println(num2 + ", " + num3 + ", " + num1);
                    }
                } else {
                    if (num1 <= num2) {
                        System.out.println(num3 + ", " + num1 + ", " + num2);
                    } else {
                        System.out.println(num3 + ", " + num2 + ", " + num1);
                    }
                }
            }

            case "C" -> {
                System.out.println("Ejercicio de Raix Cuadrada");

                System.out.println("Introduce el valor de a:");
                int a = sc.nextInt();
                System.out.println("Introduce el valor de b:");
                int b = sc.nextInt();
                System.out.println("Introduce el valor de c:");
                int c = sc.nextInt();
                
                double raiz = b * b -4 * a * c;
                double raiz2 = Math.sqrt(raiz);
                double x1 = (-b + raiz2) / (2 * a);
                double x2 = (-b - raiz2) / (2 * a);

                if (raiz2 > 0) {
                    System.out.println("La ecuación tiene dos soluciones reales:" + x1 + " y " + x2);
                }
                else if (raiz2 == 0) {
                    System.out.println("La ecuación no tiene una solución real:" + x1);
                }
                else {
                    System.out.println("La ecuación no tirne soluciones reales.");
                }   
            }

            case "D" -> {
                System.out.println("Ejercicio Indescriptible");
                System.out.println("Introduce un número del 1 al 100.000:");
                int num = sc.nextInt();

                if (num < 0 && num > 100000) {
                    System.out.println("Número no válido.");
                }
                else {
                    int cifras = String.valueOf(Math.abs(num)).length();
                    System.out.println("Tu numero tiene " + cifras + " cifras.");
                }
            }

            case "E" -> {
                System.out.println("Ejercicio de ajustar horas");
                System.out.println("Inntroduce las horas:");
                int horas = sc.nextInt();
                System.out.println("Introduce los minutos:");
                int minutos = sc.nextInt();
                System.out.println("Introduce los segundos:");
                int segundos = sc.nextInt();

                if (horas > 60 || minutos > 60 || segundos > 60 || horas < 0 || minutos < 0 || segundos < 0) {
                    System.out.println("Hora no válida.");
                }
                else {
                    System.out.println("La hora es: " + horas + ":" + minutos + ":" + (segundos + 1));
                }
            }

            case "F" -> {
                System.out.println("Es año bisiesto?");
                System.out.println("Introduce el año:");
                int year = sc.nextInt();
                if (year % 400 == 0|| year % 4 == 0) {
                    System.out.println("El año" + year + " es bisiesto");
                }
                else {
                    System.out.println("El año" + year + " no es bisiesto");
                }
                
            }

            case "G" -> {
                System.out.println("Ejercicio de ajustar dias");
                System.out.println("Introduce el año:");
                int year = sc.nextInt();
                System.out.println("Introduce el mes:");
                int month = sc.nextInt();
                System.out.println("Introduce el dia:");
                int day = sc.nextInt();

                if (month > 12 || day > 31 || year < 0 || month < 0 || day < 0) {
                    System.out.println("Hora no válida.");
                }
                else if (year % 400 == 0|| year % 4 == 0) {
                    if (month == 2 && month > 29) {
                        System.out.println("Febrero aunque sea bisiento no tiene mas de 29 dias tonto");
                    }
                    else if(month % 2 != 0 && day > 30){
                        System.out.println("Este mes no tiene 31 dias");
                    }
                    else {
                        System.out.println("El dia es: " + year + ":" + month + ":" + (day + 1));  
                    }
                }
                else if(month % 2 != 0 && day > 30){
                System.out.println("Este mes no tiene 31 dias");
                }
                else if (month == 2 && month > 28) {
                    System.out.println("Febrero no tiene más de 28 dias");
                }
                else {
                    System.out.println("El dia es: " + year + ":" + month + ":" + (day + 1));
                }

            }

            case "H" -> {
                System.out.println("Lector de notas");
                System.out.println("Introduce tu nota del 1 al 10");
                int num = sc.nextInt();
                switch (num) {
                    case 1, 2, 3, 4 -> System.out.println("Insuficiente");
                    case 5 -> System.out.println("Suficiente");
                    case 6 -> System.out.println("Bien");
                    case 7, 8 -> System.out.println("Notable");
                    case 9, 10 -> System.out.println("Sobresaliente");
                    default -> System.out.println("Nota no válida");
                }
            }
            
            case "I" -> {
                System.out.println("Selector de dias de la semana:");
                System.out.println("Introduce un número del 1 al 7");
                int num = sc.nextInt();
                switch (num) {
                    case 1 -> System.out.println("Lunes");
                    case 2 -> System.out.println("Martes");
                    case 3 -> System.out.println("Miércoles");
                    case 4 -> System.out.println("Jueves");
                    case 5 -> System.out.println("Viernes");
                    case 6 -> System.out.println("Sábado");
                    case 7 -> System.out.println("Domingo");
                    default -> System.out.println("Ese número no es válido");
                }    
            }
            
            case "J" -> {
                System.out.println("Fechas correctas:");
                System.out.println("Introduce un año");
                int year = sc.nextInt();
                System.out.println("Introduce un mes");
                int month = sc.nextInt();
                System.out.println("Introduce un dia");
                int day = sc.nextInt();

                int resp = switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        yield 31;
                    }
                    case 4, 6, 9, 11 -> {
                        yield 30;
                    }
                    case 2 -> {
                        if (year % 400 == 0|| year % 4 == 0 || year % 100 !=0) {
                            yield 29;
                        }
                        else {
                            yield 28;
                        }   
                    }
                    default -> {
                        System.out.println("El mes no es válido");
                        yield -1;
                    }
                };

                if (day < 1 || day > 31) {
                    System.out.println("El dia no es válido");
                }

                else if (day > resp) {
                    System.out.println("El dia no es válido");
                }

                else {
                    System.out.println("Es una fecha correcta");
                }
            }

            case "K" -> {
                System.out.println("");
                while (true) {
                    System.out.println("Pulsa el número 0 para salir");
                    int number = sc.nextInt();

                    boolean esPar = false;
                    boolean esNegativo = false;

                    if (number == 0) {
                        System.out.println("El programa se ha cerrado");
                    }

                    else if (number % 2 == 0) {
                        esPar = true;
                    }

                    else if (number < 0) {
                        esNegativo = true;
                    }

                    else {
                        System.out.println("Tremenrdo error");
                    }

                    if (esPar == true && esNegativo == true) {
                        System.out.println("El número es par, es negativo y su cuadrado es " + number * 2);
                    }

                    else if (esPar == false && esNegativo == false) {
                        System.out.println("El número es inpar, es positivo y su cuadrado es " + number * 2);

                    }

                    else if (esPar == true && esNegativo == false) {
                        System.out.println("El número es par, es positivo y su cuadrado es " + number * 2);
                    }
                     
                    else if (esPar == false && esNegativo == true) {
                        System.out.println("El número es inpar, es negativo y su cuadrado es " + number * 2);
                    }


                }
            }

            case "L" -> {
                int edadMax = 0;
                int edadMin = 120;
                while (true) {

                    System.out.println("Ha elegido la Actividad 14, introduzca varios años de varias personas, -1 para finalizar.");
                    int year = sc.nextInt();

                    if (year == -1) {
                        System.out.println("Finalizando");
                        break;
                    }

                    else if (year < 0) {
                        System.out.println("Edad no válida");
                    }

                    else if (year > edadMax) {
                        edadMax = year;
                    }
                    
                    if (year < edadMin) {
                        edadMin = year;
                    }
                
                }

                System.out.println("La Edad Máxima es " + edadMax + "y la edad mínima es " + edadMin);
            }

            case "M" -> {
                boolean finPrograma = false;

                do {
                    int num1 = (int)(Math.random() * 100);
                    int num2 = (int)(Math.random() * 100);
                    String opera;

                    if (Math.random() > 0.5) {
                       opera = "-";
                    }

                    else {
                        opera = "+";
                    }

                    System.out.printf("Calcula: %d %s %d%n",num1, opera, num2);
                    int resp = sc.nextInt();

                    if (opera.equals("+") && resp == num1 + num2) {
                        System.out.println("Correcto!");
                    }

                    else if (opera.equals("-") && resp == num1 - num2) {
                        System.out.println("Correcto!");
                    }

                    else {
                        System.out.println("Respuesta Incorrecta, Cerrando el programa...");
                        finPrograma = true;
                    }
                } while (!finPrograma);
            }

            case "N" -> {
                System.out.println("Introduzca un número");
                int num = sc.nextInt();
                if (num >= 0) {
                    for(int i = 0; i < num; i++) {
                    System.out.println("eco...");
                }
                }
                
                else {
                    System.out.println("Ese caracter no es válido");
                }
            }

            case "O" -> {
                System.out.println("Introduzca un número");
                int num = sc.nextInt();
                if (num >= 1) {
                    
                    for(int i = 0; i <= num; i++) {
                    System.out.println(i);
                    }

                    for(int i = num - 1; i >= num; i--) {
                        System.out.println(i);
                    }
                }

                else {
                System.out.println("Ese caracter no es válido");
            }
            }
                
            case "P" -> {
                System.out.println("Introduzca una tabla de multiplicar");
                int num = sc.nextInt();
                if (num >= 1) {
                    for(int i = 1; i <= 10; i++) {
                        System.out.println(num + "X" + i + num * i);
                    }
                }
                else {
                System.out.println("Ese caracter no es válido");
                }
            }  

            default -> {
                System.out.println("Ese caracter no corresponde a ninguna actividad");
            }
        }
        sc.close();
    }
}