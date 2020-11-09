public class Main {
    public static void main(String[] args) {
        // Creamos los objetos base
        var areaComun = new AreaComun();
        var rutaObj = new RutaAlimentadora(1_000_000, areaComun);
        var autobusObj = new Autobus(1_000_000, areaComun);
        var avionObj = new Avion(1_000_000, areaComun);
        var autoNorteObj = new AutoNorte(1_000_000, areaComun);
        var autoSurObj = new AutoSur(1_000_000, areaComun);

        // creamos los hilos
        var ruta = new Thread(rutaObj);
        var autobus = new Thread(autobusObj);
        var avion = new Thread(avionObj);
        var autoNorte = new Thread(autoNorteObj);
        var autoSur = new Thread(autoSurObj);

        // ponemos a correr los hilos
        ruta.start();
        autobus.start();
        avion.start();
        autoNorte.start();
        autoSur.start();

        // esperamos a que los hilos terminen de ejecutarse
        while (ruta.isAlive() || autobus.isAlive() || avion.isAlive() || 
               autoNorte.isAlive() || autoSur.isAlive())
        {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

        // vemos los resultados de la simulación
        System.out.println(areaComun);
    }
}