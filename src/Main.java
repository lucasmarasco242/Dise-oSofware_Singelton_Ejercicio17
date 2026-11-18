public class Main {
    public static void main(String[] args) {
        GeneradorTurnos terminal1 = GeneradorTurnos.getInstancia();
        GeneradorTurnos terminal2 = GeneradorTurnos.getInstancia();
        GeneradorTurnos terminal3 = GeneradorTurnos.getInstancia();

        System.out.println("¿Es la misma instancia en las 3 terminales?: " + (terminal1 == terminal2 && terminal2 == terminal3));
        System.out.println("Simulando 20 solicitudes alternadas...\n");

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 1) {
                terminal1.generarNumero("Terminal-1");
            } else if (i % 3 == 2) {
                terminal2.generarNumero("Terminal-2");
            } else {
                terminal3.generarNumero("Terminal-3");
            }
        }

        System.out.println("\nÚltimo número emitido (sin incrementar contador): " + terminal1.consultarUltimo());

        System.out.println();
        terminal1.mostrarHistorial();
    }
}
