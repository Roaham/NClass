import java.util.Scanner;

public class pr4 {

    int litrosDisponibles = 0; 
    double precioPorLitro = 1.85;
    String tipoDeCombustible = "Gasolina";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pr4 gasolina = new pr4();
        
        gasolina.litrosDisponibles = 500; 

        System.out.println("""
                WELCOME TO ROASHOP:
                Que le gustaria hacer?
                A) Ver Informacion
                B) Comprar Stock (Rellenar Tanque)
                C) Vender Producto (Repostar Vehiculo)
                D) Exit
        """);
        String resp = sc.nextLine().toUpperCase();

        switch (resp) {
            case "A" -> gasolina.MostrarInformacion();
            case "B" -> {
                System.out.println("Cantidad a comprar al proveedor:");
                int cant = sc.nextInt(); 
                gasolina.rellenarTanqueGasolinera(cant);
                System.out.println("Stock actualizado.");
            }
            case "C" -> {
                System.out.println("Cantidad a vender al cliente:");
                int cant = sc.nextInt(); 
                if (gasolina.repostar(cant)) {
                    System.out.println("Venta realizada con éxito.");
                }
            }
            case "D" -> System.out.println("Adiós!");
            default -> System.out.println("Opción no válida.");
        }
    }

    boolean repostar(int inCantidad) {
        if (this.litrosDisponibles >= inCantidad) {
            this.litrosDisponibles -= inCantidad;
            return true;
        } else {
            System.err.println("No hay stock suficiente. Stock actual: " + litrosDisponibles);
            return false;
        }
    }

    void rellenarTanqueGasolinera(int inCantidad) {
        this.litrosDisponibles += inCantidad;
    }

    void MostrarInformacion () {
        System.out.println("--- INFORMACIÓN ---");
        System.out.println("Combustible: " + tipoDeCombustible);
        System.out.println("Stock disponible: " + litrosDisponibles + "L");
        System.out.println("Precio por Litro: " + precioPorLitro + "€");
    }
}