public class GeneradorTurnos {
    private static GeneradorTurnos instancia;
    private int ultimoNumero;
    private int[] numeros;
    private String[] terminales;
    private int total;

    private GeneradorTurnos() {
        this.ultimoNumero = 0;
        this.numeros = new int[25];
        this.terminales = new String[25];
        this.total = 0;
    }

    public static GeneradorTurnos getInstancia() {
        if (instancia == null) {
            instancia = new GeneradorTurnos();
        }
        return instancia;
    }

    public int generarNumero(String terminal) {
        if (total < 25) {
            ultimoNumero++;
            numeros[total] = ultimoNumero;
            terminales[total] = terminal;
            total++;
            System.out.println("Número emitido: " + ultimoNumero + " (Solicitado por: " + terminal + ")");
            return ultimoNumero;
        } else {
            System.out.println("Error: Capacidad máxima del generador alcanzada.");
            return -1;
        }
    }

    public int consultarUltimo() {
        return ultimoNumero;
    }

    public void mostrarHistorial() {
        System.out.println("--- Historial de Números Entregados ---");
        for (int i = 0; i < total; i++) {
            System.out.println("Número: " + numeros[i] + " - Terminal: " + terminales[i]);
        }
    }
}