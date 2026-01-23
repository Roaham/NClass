
import java.util.Scanner;

public class pr3 {

    int codigo = 0;
    static int stock = 0;
    float precio = 0;
    String nombre = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        pr3 producto1 = new pr3();
        producto1.codigo = 141252;
        producto1.stock = 124;
        producto1.precio = 199;
        producto1.nombre = "Galletas premium";

        System.out.println("""
                WELCUM TO ROASHOP:
                Que le gustaria hacer?
                A) Ver Informacion
                B) Comprar Producto
                C) Vender Producto
                D) Exit
        """);
        String resp = sc.nextLine();

        switch (resp) {
            case "A" -> {
                producto1.MostrarInformacion();
            }
            case "B" -> {
                System.out.println("Introduzca la cantidad de producto a comprar:");
                int productoComprar = sc.nextInt(); 
                if (producto1.ComprarProducto(productoComprar)) {
                    System.out.println("Operación realizada con éxito");
                }
            }
            case "C" -> {
                System.out.println("Introduzca la cantidad de producto a vender:");
                int productoVender = sc.nextInt(); 
                if (producto1.VenderProducto(productoVender)) {
                    System.out.println("Operación realizada con éxito");
                }
            }
            case "D" -> {
                break;
            }
            default -> throw new AssertionError();
        }
    }

    static boolean VenderProducto(int inCantidad) {
        if (stock >= inCantidad) {
            stock = stock - inCantidad;
            return true;
        } 
        else {
            System.err.println("No hay stock suficiente, nuestro stock actual de este producto es de: " + stock);
            return false;
        }
    }

    static boolean ComprarProducto(int inCantidad) {
        stock = stock + inCantidad;
        return true;
    }

    void MostrarInformacion () {
        System.out.println("Stock disponible: " + stock);
        System.out.println("Codigo de producto: " + codigo);
        System.out.println("Precio Unitario: " + precio);
        System.out.println("Nombre del Producto" + nombre);
    }
}