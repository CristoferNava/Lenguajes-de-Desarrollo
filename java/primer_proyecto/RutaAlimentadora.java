import java.util.Random;

// Hilo encargado de llevar personas al aeropuerto
public class RutaAlimentadora implements Runnable {
    private int ciclos; // Cantidad de ciclos que va a ejecutarse la simulación
    private AreaComun areaComun; // Acceso al área común
    private Random probabilidad; // Determina si la persona va a la central norte o sur

    public RutaAlimentadora(int ciclos, AreaComun areaComun) {
        this.ciclos = ciclos;
        this.areaComun = areaComun;
        probabilidad = new Random();
    }

    @Override
    public void run() {
        int central;
        for (int i = 1; i <= this.ciclos; i++) {
            // cada 5 ciclos llega una persona al aeropuerto
            // esta persona tiene 65% de probalidades ir a la central norte
            // y 35% ir a la central sur
            if (i % 5 == 0) {
                // depositamos una persona en el aeropuerto
                if (probabilidad.nextDouble() <= 0.65)  {
                    central = 1; // la persona va a la central norte
                }
                else {
                    central = 2; // va a la central sur
                }
                this.areaComun.depositaAeropuerto(1, central);
            }
        }
    }
}
