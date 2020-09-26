// Hilo encargado de llevar personas a la central norte
// el hilo está revisando cada que el areopuerto llegue al 85% de su capacidad 
// para enviar personas a la central norte
public class Avion implements Runnable {
    private int ciclos;
    private AreaComun areaComun;

    public Avion(int ciclos, AreaComun areaComun) {
        this.ciclos = ciclos;
        this.areaComun = areaComun;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.ciclos; i++) {
            // Revisamos si el aeropuerto ha llegado al 85% de su capacidad
            // es decir a las 595 personas.
            if (this.areaComun.getArepuerto() >= 595) {
                this.areaComun.avionACentralNorte(100); // enviamos 100 personas en el avión
                // tenemos que esperar 70 iteraciones
                for (int j = 1; j <= 40; j++) {
                }
            }
        }
    }
}
