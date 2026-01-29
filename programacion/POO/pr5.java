public class pr5 {

    String DNI;
    String nombreTitular;
    float saldo;

    public pr5(String DNI, String nombreTitular) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public pr5(String DNI, String nombreTitular, float saldoInicial) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    void sacarDinero(float cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.err.println("No tiene suficiente saldo disponible");
        }
    }

    void ingresarDinero(float cantidad) {
        saldo += cantidad;
    }

    void mostrarInformacion() {
        System.out.println("Nombre titular: " + nombreTitular);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo disponible: " + saldo);
    }

    public static void main(String[] args) {
        pr5 cuenta1 = new pr5("74839823A", "Juan Pérez");
        pr5 cuenta2 = new pr5("12345678Z", "Ana López", 72223);

        cuenta1.mostrarInformacion();
        System.out.println();
        cuenta2.mostrarInformacion();
    }
}
