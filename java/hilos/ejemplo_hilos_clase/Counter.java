import java.util.Random;

public class Counter implements Runnable {
    private int size;
    private int[] data;
    private int result;

    public Counter(int size) {
        this.size = size;
        data = new int[size];

        var rnd = new Random();
        // Fill the data with random numbers between 0 and 1
        for (int i = 0; i < size; i++) {
            data[i] = rnd.nextInt(2);
        }
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    // Código que corre en paralelo
    @Override
    public void run() {
        for (int i : data) {
            this.result += i;
        }
    }
}