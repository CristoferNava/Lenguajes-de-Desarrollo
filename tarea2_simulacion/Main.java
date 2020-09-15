package career;

public class Main {
    public static void main(String[] args) {
        // Creamos los objetos base
        var areopuerto = new AreaComun();
        var objProductor = new Productor(43_800, areopuerto);
        var objConsumidor = new Consumidor(43_800, areopuerto);

        // Creamos los hilos
        var productor = new Thread(objProductor);
        var consumidor = new Thread(objConsumidor);

        // Ponemos a correr los hilos
        productor.start();
        consumidor.start();

        // Esperamos a que los hilos terminen de ejecutarse
       while (productor.isAlive() || consumidor.isAlive()) {
           try {
               Thread.sleep(20);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       // Consultamos el resultado final de la simulación
        System.out.println(areopuerto);
    }
}