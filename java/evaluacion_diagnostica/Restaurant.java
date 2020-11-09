public class Restaurant {
    private String ID;
    private String name;
    private String numberTables;
    private String hour;
    private String specialty;

    public Restaurant(String ID, String name, String numberTables, String hour, String specialty) {
        this.ID = ID;
        this.name = name;
        this.numberTables = numberTables;
        this.hour = hour;
        this.specialty = specialty;
    }

    public String getID() {
        return ID;
    }

    public String getNumberTables() {
        return numberTables;
    }

    public void setNumberTables(String numberTables) {
        this.numberTables = numberTables;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nNúmero de Tablas: %s\nHora de Apertura: %s\nEspecialidad: %s\n", getName(), getNumberTables(), getHour(), getSpecialty());
    }
}
