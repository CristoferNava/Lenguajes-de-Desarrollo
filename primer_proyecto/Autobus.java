// Hilo encargado de llevar personas a la central sur
public class Autobus implements Runnable {
    private int ciclos; // cantidad de veces que va a ejecutarse la simulación
    private AreaComun areaComun; // acceso al área común 

    public Autobus(int ciclos, AreaComun areaComun) {
        this.ciclos = ciclos;
        this.areaComun = areaComun;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.ciclos; i++) {
            // Revisamos si el aeropuerto ha llegado al 85% de su capacidad
            // es decir a las 595 personas
            if (this.areaComun.getArepuerto() >= 595) {
                this.areaComun.autobusCentralSur(70); // enviamos 70 personas en autobus
                // tenemos que esperar 60 iteraciones
                for (int j = 1; j <= 60; j++) {
                }
            }
        }
    }
    
}
