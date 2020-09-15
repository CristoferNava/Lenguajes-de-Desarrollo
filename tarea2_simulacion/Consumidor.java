import java.util.Random;

public class Consumidor implements Runnable {
    // Encargado de retirar combustible de los contenedores
    private int horas; // Cantidad de horas que va a estar quitando combustible
    private AreaComun areopuerto;
    private Random probabilidadVuelo;

    public Consumidor(int horas, AreaComun areopuerto) {
        this.horas = horas;
        this.areopuerto = areopuerto;
        this.probabilidadVuelo = new Random();
    }

    @Override
    public void run() {
        int horasTranscurridas = 1;
        while (horasTranscurridas <= this.horas) {
            // Cada 3 horas un vuelo toma combustible
            if ((horasTranscurridas % 3 == 0) && (probabilidadVuelo.nextDouble() >= 0.05)) {
                // Vuelo nacional toma 400 litros del primer contenedor
                areopuerto.tomarContenedor1(400);
            }
            // Cada 5 horas un vuelo internacional toma 800 litros del segundo contenedor
            if ((horasTranscurridas % 5 == 0) && (probabilidadVuelo.nextDouble() >= 0.05)) {
                areopuerto.tomarContenedor2(800);
            }
            horasTranscurridas++;
        }
    }
}