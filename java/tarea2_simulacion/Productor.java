// Link para probar el código: https://repl.it/@CristoferNava/simulacionturbosina#Main.java

import java.util.Random;

public class Productor implements Runnable {
    // Encargado de depositar combustible en los contenedores
    private int horas; // Cantidad de horas que va a estar depositando combustible
    private AreaComun areopuerto;

    public Productor(int horas, AreaComun areopuerto) {
        this.horas = horas;
        this.areopuerto = areopuerto;
    }

    @Override
    public void run() {
        // Va estar depositando en ambos contenedores
        int horasTranscurridas = 1;
        while (horasTranscurridas <= this.horas) {
            // Cada 24 horas cada contenedor recibe 3600 litros
            if (horasTranscurridas % 24 == 0) {
                areopuerto.depositarContenedor1(3_600);
                areopuerto.depositarContenedor2(3_600);
            }
            horasTranscurridas++;
        }
    }
}