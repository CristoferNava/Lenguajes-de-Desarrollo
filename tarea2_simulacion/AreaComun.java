package career;

public class AreaComun {
    private int contenedor1;
    private int contenedor2;
    private int intercambio; // Veces que se pasó combustible de un contenedor a otro
    private int vuelosNacionalesPerdidos; // Número de vuelos perdidos por no haber combustible en ningún contenedor
    private int vuelosInternacionalesPerdidos;

    public AreaComun() {
        this.contenedor1 = 12_000;
        this.contenedor2 = 16_000;
        this.intercambio = 0;
        this.vuelosNacionalesPerdidos = 0;
        this.vuelosInternacionalesPerdidos = 0;
    }

    public synchronized boolean depositarContenedor1(int cantidadLitros) {
        if (cantidadLitros + this.contenedor1 <= 24_000) {
            this.contenedor1 += cantidadLitros;
            return true;
        }
        return false;
    }

    public synchronized boolean depositarContenedor2(int cantidadLitros) {
        if (cantidadLitros + this.contenedor2 <= 32_000) {
            this.contenedor2 += cantidadLitros;
            return true;
        }
        return false;
    }

    public synchronized boolean tomarContenedor1(int cantidadLitros) {
        if (this.contenedor1 >= cantidadLitros) {
            this.contenedor1 -= cantidadLitros;
            if (this.contenedor1 == 0) {
                this.vuelosNacionalesPerdidos++; // Se perdió un vuelo nacional
                // Tomamos 1_000 del segundo contenedor si es que hay
                if (tomarContenedor2(1_000)) {
                    // Se pudo tomar el combustible y lo depositamos en el primer contenedor
                    this.depositarContenedor1(1_000);
                    this.intercambio++; // hubo intercambio de combustible entre los contenedores
                }
            }
            return true;
        }
        return false;
    }

    public synchronized boolean tomarContenedor2(int cantidadLitros) {
        if (this.contenedor2 >= cantidadLitros) {
            this.contenedor2 -= cantidadLitros;
            if (this.contenedor2 == 0) {
                this.vuelosInternacionalesPerdidos++; // Se perdió un vuelo internacional
                // Tomamos 1_000 del primer contenedor si es que hay
                if (tomarContenedor1(1_000)) {
                    // Se pudo tomar el combustible y lo depositamos en el segundo contenedor
                    this.depositarContenedor2(1_000);
                    this.intercambio++; // hubo intercambio de combustible entre los contenedores
                }
            }
            return true;
        }
        return false;
    }

    public int getIntercambio() {
        return intercambio;
    }

    public int getVuelosNacionalesPerdidos() {
        return vuelosNacionalesPerdidos;
    }

    public int getVuelosInternacionalesPerdidos() {
        return vuelosInternacionalesPerdidos;
    }

    public int getContenedor1() {
        return contenedor1;
    }

    public int getContenedor2() {
        return contenedor2;
    }

    @Override
    public String toString() {
        return String.format("Veces que se tuvo que intercambiar combustible de un contenedor a otro: %d\n" +
                             "Vuelos nacionales perdidos: %d\n" +
                             "Vuelos internacionales perdidos: %d\n",
                             this.getIntercambio(),
                             this.getVuelosNacionalesPerdidos(),
                             this.getVuelosInternacionalesPerdidos());
    }
}