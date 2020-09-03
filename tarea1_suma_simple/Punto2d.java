import java.util.Random;

public class Punto2d {
    private double x;
    private double y;

    public Punto2d() {
        var rnd = new Random();
        this.x = rnd.nextInt(11);
        this.y = rnd.nextInt(10) - 5;  // (max - min)  + min
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%f %f", x, y);
    }
}