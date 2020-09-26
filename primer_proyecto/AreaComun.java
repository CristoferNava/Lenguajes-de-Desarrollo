// Concentra las entidades de aeropuerto, centralNorte y centralSur
// también dentro del archivo tenemos a la clase Persona
public class AreaComun {
    private int aeropuerto; // contador de las personas en el aeropuerto. Máximo 700
    private int aeropuertoCentralNorte; // cantidad de personas en el aeropuerto que van a la central norte
    private int aeropuertoCentralSur; // cantidad de personas en el aeropuerto que van a a la central sur
    private int centralNorte; // contador de las personas en la centralNorte. Máximo 500
    private int centralSur; // contador de las personas en la centralSur. Máximo 200

    // Propiedades que guardan las respuestas a las preguntas de la simulación:
    private int vuelosCentralNorte; // cantidad de vuelos realizados a la central norte
    private int autobusesCentralSur; // cantidad de viajes de autobús realizados a la central su
    private int autosCentralNorte; // cantidad de personas que usaron autos para la central norte
    private int autosCentralSur; // cantidad de personas que usaron autos para le central sur

    public AreaComun() {
        this.aeropuerto = 0;
        this.aeropuertoCentralNorte = 0;
        this.aeropuertoCentralSur = 0;
        this.centralNorte = 0;
        this.centralSur = 0;
        this.vuelosCentralNorte = 0;
        this.autobusesCentralSur = 0;
        this.autosCentralNorte = 0;
        this.autosCentralSur = 0;
    }

    // Deposita personas en el aeropuerto
    public boolean depositaAeropuerto(int persona, int central) {
        // revisamos que podamos agregar personas al aeropuerto
        if (this.aeropuerto + persona <= 700) {
            this.aeropuerto += persona; // agregamos las persona
            // revisamos si la persona va a la central norte o sur
            // 1 para norte y 2 para sur
            if (central == 1) this.aeropuertoCentralNorte++; // va a la central norte
            else if (central == 2) this.aeropuertoCentralSur++; // va a la central sur
            return true;
        }
        return false;
    }

    // lleva personas del aeropuerto a la central norte
    public boolean avionACentralNorte(int cantidad) {
        // revisamos que haya disponibles la cantidad de personas para llevar a la
        // central norte además de que la central norte tenga espacio para poder
        // recibirlas
        if ((cantidad <= this.aeropuertoCentralNorte) && (cantidad + this.centralNorte <= 500)) {
            this.aeropuertoCentralNorte -= cantidad;
            this.aeropuerto -= cantidad;
            this.centralNorte += cantidad;

            this.vuelosCentralNorte++;
            return true;
        }
        return false;
    }

    public boolean autobusCentralSur(int cantidad) {
        // revisamos que haya disponibles la cantidad de personas para llevar a la
        // a la central sur y que la central sur tenga espacio para poder recibirlas
        if ((cantidad <= this.aeropuertoCentralSur) && (cantidad + this.centralSur <= 200)) {
            this.aeropuertoCentralSur -= cantidad;
            this.aeropuerto -= cantidad;
            this.centralSur += cantidad;

            this.autobusesCentralSur++;
            return true;
        }
        return false;
    }


    public void setAutosCentralNorte(int cantidadPersonas) {
        this.autosCentralNorte += cantidadPersonas;
    }

    public void setAutosCentralSur(int cantidadPersonas) {
        this.autobusesCentralSur += cantidadPersonas;
    }

    // regresa la cantidad de personas que se encuentran en el aeropuerto
    public int getArepuerto() {
        return this.aeropuerto;
    }

    public int getVuelosCentralNorte() {
        return vuelosCentralNorte;
    }

    public int getAutobusesCentralSur() {
        return autobusesCentralSur;
    }

    public int getAutosCentralNorte() {
        return autosCentralNorte;
    }

    public int getAeropuertoCentralSur() {
        return aeropuertoCentralSur;
    }

    @Override
    public String toString() {
        return String.format("Vuelos realizados a la central norte: %d\n" +
                             "Autobuses a la central sur: %d\n" +
                             "Personas que usaron auto en la central norte: %d\n" + 
                             "Personas que usaron auto en la central sur: %d\n",
                             this.getVuelosCentralNorte(),
                             this.getAutobusesCentralSur(),
                             this.getAutosCentralNorte(),
                             this.getAutosCentralNorte());
    }
}
