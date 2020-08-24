public class Old {
    public static void main(String[] args) {
        var t1 = new Test();
    }
}

class Test implements Runnable {
    private Thread t;

    public Test() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        // Tarea que va realizar el hilo
        try {
            Thread.currentThread().sleep(2000);
            System.out.println(Thread.currentThread());
        } catch (InterruptedException e) {
            //TODO: handle exception
        }
    }
} 