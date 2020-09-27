import java.util.Random;

// Hilo encargado de recoger personas de la central norte
public class AutoNorte implements Runnable {
    private int ciclos; // cantidad de ciclos que se va a ejecutar la simulación
    private AreaComun areaComun;
    private Random probabilidad;

    public AutoNorte(int ciclos, AreaComun areaComun) {
        this.ciclos = ciclos;
        this.areaComun = areaComun;
        probabilidad = new Random();
    }

    @Override
    public void run() {
        int cantidadPersonas; 
        for (int i = 1; i <= this.ciclos; i++) {
            // cada 3 ciclos un auto es contratado para recoger personas
            // 40% de estos viajes es de 3 personas, 30% de 2 y 30% de 1
            if (i % 3 == 0) {
                if (probabilidad.nextDouble() <= 0.6) cantidadPersonas = 3;
                else {
                    if (probabilidad.nextDouble() >= 0.5) cantidadPersonas = 2;
                    else cantidadPersonas = 1;
                }
                this.areaComun.setAutosCentralNorte(cantidadPersonas);
            }
        }
    }
}
