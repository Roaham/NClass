public class pr2 {
    String DNI = null;
    String NombreTitular = null;
    float saldo = 0;

    public static void main(String[] args) {
        pr2 miCuenta = new pr2();
        miCuenta.DNI = "74839823A";
        miCuenta.NombreTitular = "74839823A";
        miCuenta.saldo = 72223;

        miCuenta.MostrarInformacion();
    }

    void SacarDinero (float inCantidad) {
        if (saldo >= inCantidad) {
            saldo = saldo - inCantidad;
        }
        else {
            System.err.println("No tiene suficiente saldo disponible");
        }
    }

    void IngresarDinero (float inCantidad) {
        saldo += inCantidad;
    }

    void MostrarInformacion () {
        System.out.println("Nombre Titular:" + NombreTitular);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo disponible: " + saldo);
    }
}