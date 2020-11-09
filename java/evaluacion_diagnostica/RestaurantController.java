import java.util.*;

public class RestaurantController {
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void addRestaurant() {
        System.out.println("Introduzca el ID para el restaurante:");
        String ID = input.nextLine();

        if (this.search(ID) == -1) {
            System.out.println("Introduzca el nombre del restaurante:");
            String name = input.nextLine();
            System.out.println("Introduzca el número de tablas:");
            String numberTables = input.nextLine();
            System.out.println("Introduzca la hora de apertura:");
            String hour = input.nextLine();
            System.out.println("Introduzca la especialidad:");
            String specialty = input.nextLine();

            var restaurant = new Restaurant(ID, name, numberTables, hour, specialty);
            this.restaurants.add(restaurant);
            System.out.println("El restaurante se agregó correctamente.");
        } else {
            System.out.println("ID existente. No se ha podido agregar el restaurante.");
        }
    }

    public void searchRestaurant() {
        System.out.println("Presione 1 para buscar por especialidad o 2 para buscar por ID");
        String option = input.nextLine();
        if (option.equals("1")) {
            System.out.println("Introduzca la especialidad:");
            String specialty = input.nextLine();
            
            // Buscamos todos los restaurantes que contengan esa especialidad
            if (restaurants.size() == 0) {
                System.out.println("No se ha encontrado ningún restaurante con esa especialidad");
                return;
            }
            for (Restaurant r : restaurants) {
                if (r.getSpecialty().equals(specialty)) {
                    System.out.println(r);
                }
            }
        } else {
            System.out.println("Introduzca el ID del restaurante:");
            String id = input.nextLine();
    
            int index = this.search(id);
    
            if (index != -1) {
                System.out.println(this.restaurants.get(index));
            } else {
                System.out.println("Restaurante no encontrado.");
            }
        }
    }

    public void removeRestaurant() {
        System.out.println("Introduzca el ID del restaurante a eliminar");
        String ID = input.nextLine();
        int index = this.search(ID);

        if (index != -1) {
            this.restaurants.remove(index);
            System.out.println("El restaurante se eliminó correctamente.");
        } else {
            System.out.println("ID no existente.");
        }
    }

    public void listRestaurants() {
        System.out.println("Lista de restaurantes: ");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }

    private int search(String ID) {
        for (int i = 0; i <= this.restaurants.size() - 1; i++) {
            if (this.restaurants.get(i).getID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }
}