import java.util.*;

public class RestaurantController {
    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void addRestaurant() {
        System.out.println("Introduzca el ID para el restaurante:");
        String ID = input.nextLine();

        if (this.search(ID) == -1) {
            System.out.println("Introduzca el número de tablas:");
            String numberTables = input.nextLine();
            System.out.println("Introduzca la hora de apertura:");
            String hour = input.nextLine();
            System.out.println("Introduzca la especialidad:");
            String specialty = input.nextLine();

            var restaurant = new Restaurant(ID, numberTables, hour, specialty);
            this.restaurants.add(restaurant);
            System.out.println("El restaurante se agregó correctamente.");
        } else {
            System.out.println("ID existente. No se ha podido agregar el restaurante.");
        }
    }

    public void searchRestaurant() {
        System.out.println("Introduzca el ID del restaurante:");
        String id = input.nextLine();

        int index = this.search(id);

        if (index != -1) {
            System.out.println(this.restaurants.get(index));
        } else {
            System.out.println("Restaurante no encontrado.");
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