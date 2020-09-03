public class Main {
    public static void main(String[] args) {
        var puntos = new Punto2d[100];

        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto2d();
        }

        // Segmentamos los trabajos a realizar
        var t1 = new Punto2d[25];
        var t2 = new Punto2d[25];
        var t3 = new Punto2d[25];
        var t4 = new Punto2d[25];

        System.arraycopy(puntos, 0, t1, 0, 25);
        System.arraycopy(puntos, 25, t2, 0, 25);
        System.arraycopy(puntos, 50, t3, 0, 25);
        System.arraycopy(puntos, 75, t4, 0, 25);

        // Creamos los cuatro objetos que serán envueltos como hilos
        var obj1 = new HiloSuma(t1);
        var obj2 = new HiloSuma(t2);
        var obj3 = new HiloSuma(t3);
        var obj4 = new HiloSuma(t4);

        // Creamos los hilos
        var hilo1 = new Thread(obj1);
        var hilo2 = new Thread(obj2);
        var hilo3 = new Thread(obj3);
        var hilo4 = new Thread(obj4);

        // Ejecutamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        // Ponemos a dormir al proceso main para permitir que los hilos
        // declarados terminen
        while (hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive()) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        // Juntamos la suma de todos los hilos
        double resultado = obj1.getSuma() + obj2.getSuma() + obj3.getSuma() + obj4.getSuma();
        System.out.println(resultado);
    }
}