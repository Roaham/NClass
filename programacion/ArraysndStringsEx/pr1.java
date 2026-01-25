import java.util.Random;
import java.util.Scanner;

    public class pr1 {

        public static int[][] numInicial(int[][] table) {
            Random rand = new Random();
            
            // 1. Decidir qué número generar
            int prob = rand.nextInt(100) + 1;
            int num = (prob <= 45) ? 2 : (prob <= 80) ? 4 : 6;

            //Marcamos los diferentes ceros
            int ceros = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (table[i][j] == 0) ceros++;
                }
            }

            if (ceros == 0) return table;

            //colocamos un cero aleatoriamente
            int elegido = rand.nextInt(ceros);
            int contador = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (table[i][j] == 0) {
                        if (contador == elegido) {
                            table[i][j] = num;
                            return table;
                        }
                        contador++;
                    }
                }
            }
            return table;
        }

        public static boolean isGameOver(int[][] table) {
            // 1. Si no hay posiciones disponibles
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (table[i][j] == 0) return false;
                }
            }

            // 2. Si no hay  movimientos posibles
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    // Comprobar vecino a la derecha
                    if (j < 3 && table[i][j] == table[i][j + 1]) return false;
                    // Comprobar vecino de abajo
                    if (i < 3 && table[i][j] == table[i + 1][j]) return false;
                }
            }

            return true;
        }
        
        public static void clean() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        public static int[][] calcRight(int[][] table) {
            //Recorremos el array de arriba a abajo
            for (int i = 0; i < table.length; i++) {
                //Recorre el array de izquierda a derecha
                for (int j = 2; j >= 0; j--) {
                    //Si el numero en esa pos es distinto de cero...
                    if (table[i][j] != 0) {
                        int posAct = j;
                        
                        while (posAct + 1 < table[i].length) {
                            int numRight = table[i][posAct + 1];
                            int miNum = table[i][posAct];
                            //Lo desplazamos hacia la derecha
                            if (numRight == 0) {
                                table[i][posAct + 1] = miNum;
                                table[i][posAct] = 0;
                                posAct++;
                            } 
                            //Si se topa con un numero igual al suyo se suman
                            else if (numRight == miNum) {
                                table[i][posAct + 1] = miNum * 2;
                                table[i][posAct] = 0;
                                break;
                            } 
                            //Si se encuentra con un numero diferente del suyo seguimos operando con el siguiente
                            else {
                                break;
                            }
                        }
                    }
                }
            }
            return table;
        }
        
        public static int[][] calcLeft(int[][] table) {
            //Recorremos el array de arriba a abajo
            for (int i = 0; i < table.length; i++) {
                //Recorre el array de derecha a izquierda
                for (int j = 1; j < table[i].length; j++) {
                    //Si el numero en esa pos es distinto de cero...
                    if (table[i][j] != 0) {
                        int posAct = j;
                        
                        while (posAct - 1 >= 0) {
                            int numRight = table[i][posAct - 1];
                            int miNum = table[i][posAct];
                            //Lo desplazamos hacia la izquierda
                            if (numRight == 0) {
                                table[i][posAct - 1] = miNum;
                                table[i][posAct] = 0;
                                posAct--;
                            } 
                            //Si se topa con un numero igual al suyo se suman
                            else if (numRight == miNum) {
                                table[i][posAct - 1] = miNum * 2;
                                table[i][posAct] = 0;
                                break;
                            } 
                            //Si se encuentra con un numero diferente del suyo seguimos operando con el siguiente
                            else {
                                break;
                            }
                        }
                    }
                }
            }
            return table;
        }

        public static int[][] calcDown(int[][] table) {
            //Recorremos el array de izquierda a derecha
            for (int j = 0; j < table.length; j++) {
                //Recorre el array de abajo a arriba
                for (int i = 2; i >= 0; i--) {
                    //Si el numero en esa pos es distinto de cero...
                    if (table[i][j] != 0) {
                        int posAct = i;
                        
                        while (posAct + 1 < table.length) {
                            int numRight = table[posAct + 1][j];
                            int miNum = table[posAct][j];
                            //Lo desplazamos hacia la derecha
                            if (numRight == 0) {
                                table[posAct + 1][j] = miNum;
                                table[posAct][j] = 0;
                                posAct++;
                            } 
                            //Si se topa con un numero igual al suyo se suman
                            else if (numRight == miNum) {
                                table[posAct + 1][j] = miNum * 2;
                                table[posAct][j] = 0;
                                break;
                            } 
                            //Si se encuentra con un numero diferente del suyo seguimos operando con el siguiente
                            else {
                                break;
                            }
                        }
                    }
                }
            }
            return table;
        }

        public static int[][] calcUp(int[][] table) {
            //Recorremos el array de izquierda a derecha
            for (int j = 0; j < table.length; j++) {
                //Recorre el array de arriba a abajo
                for (int i = 1; i < table.length; i++) {
                    //Si el numero en esa pos es distinto de cero...
                    if (table[i][j] != 0) {
                        int posAct = i;
                        
                        while (posAct - 1 >= 0) {
                            int numRight = table[posAct - 1][j];
                            int miNum = table[posAct][j];
                            //Lo desplazamos hacia la derecha
                            if (numRight == 0) {
                                table[posAct - 1][j] = miNum;
                                table[posAct][j] = 0;
                                posAct--;
                            } 
                            //Si se topa con un numero igual al suyo se suman
                            else if (numRight == miNum) {
                                table[posAct - 1][j] = miNum * 2;
                                table[posAct][j] = 0;
                                break;
                            } 
                            //Si se encuentra con un numero diferente del suyo seguimos operando con el siguiente
                            else {
                                break;
                            }
                        }
                    }
                }
            }
            return table;
        }

        //made by gemini
        public static void printArray(int[][] table) {
            System.out.println("\n***************************");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (table[i][j] == 0) {
                        // Imprime un punto en un hueco de 6 espacios
                        System.out.printf("%6s", "."); 
                    } else {
                        // Imprime el número en un hueco de 6 espacios
                        System.out.printf("%6d", table[i][j]);
                    }
                }
                // Forzamos un salto de línea manual y un espacio extra
                System.out.println("\n"); 
            }
            System.out.println("***************************");
        }

        public static String selectArrow() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Selecciona W, A, S, D");
            switch (sc.nextLine().toUpperCase()) {
                case "W":
                    return "up";
                case "A":
                    return "left";
                case "S":
                    return "down";
                case "D":
                    return "right";
                default: {
                    System.out.println("Tecla no válida.");
                    return null;
                }
            }
        }

        public static void main(String[] args) {

            int[][] table = new int[4][4];
            numInicial(table);

            while (isGameOver(table) == false) {
                
                printArray(table);

                switch (selectArrow()) {
                    case "up": 
                        calcUp(table);
                        break;
                    case "down": 
                        calcDown(table);
                        break;
                    case "left": 
                        calcLeft(table);
                        break;
                    case "right": 
                        calcRight(table);
                        break;
                }

                numInicial(table);

                clean();
            }
        }
    }