// Link para probar el código:
// https://repl.it/@CristoferNava/Tarea1#Main.java


public class HiloSuma implements Runnable {
    private Punto2d[] puntos;
    private double suma;


    public HiloSuma(Punto2d[] puntos) {
        this.puntos = puntos;
        suma = 0;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public void run() {
        // Hacemos la suma en paralelo
        for (Punto2d p : puntos) {
            suma += (p.getX() * p.getX()) + (2 * p.getY()) - (p.getX()); 
        }
    }
}