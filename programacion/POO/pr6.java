import java.util.Scanner;

public class pr6 {

    int codigo;
    int stock;
    float precio;
    String nombre;

    public pr6(int codigo, int stock, float precio, String nombre) {
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    public boolean venderProducto(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            return true;
        } else {
            System.err.println("No hay stock suficiente. Stock actual: " + stock);
            return false;
        }
    }

    public boolean comprarProducto(int cantidad) {
        stock += cantidad;
        return true;
    }

    public void mostrarInformacion() {
        System.out.println("Stock disponible: " + stock);
        System.out.println("Codigo de producto: " + codigo);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Nombre del producto: " + nombre);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        pr6 producto1 = new pr6(141252, 124, 199, "Galletas premium");

        System.out.println("""
                WELCUM TO ROASHOP:
                A) Ver Informacion
                B) Comprar Producto
                C) Vender Producto
                D) Exit
        """);

        String resp = sc.nextLine();

        switch (resp) {
            case "A" -> producto1.mostrarInformacion();
            case "B" -> {
                System.out.println("Cantidad a comprar:");
                int c = sc.nextInt();
                producto1.comprarProducto(c);
            }
            case "C" -> {
                System.out.println("Cantidad a vender:");
                int v = sc.nextInt();
                producto1.venderProducto(v);
            }
            case "D" -> { }
            default -> System.out.println("Opción no válida");
        }
    }
}
