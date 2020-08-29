public class Main {
    public static void main(String[] args) {
        var counter = new Counter(10_000); // New
        var threadCounter = new Thread(counter); // Construct the thread
        threadCounter.start();

        while (threadCounter.isAlive()) {
            try {
                Thread.sleep(20); // Sleep the main method
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        System.out.println(counter.getResult()); // Thread is dead, the object 
        // is in its final state
    }
}