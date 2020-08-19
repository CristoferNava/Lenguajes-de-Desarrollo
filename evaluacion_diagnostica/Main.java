import java.util.*;

public class Main {
    public static void main(String[] args) {
        start();    
    }

    private static void start() {
        var input = new Scanner(System.in);

        System.out.println("Gestión de Restaurantes");
        var controller = new RestaurantController();
        String option = "d";

        while (!(option.equals("s") || option.equals("S"))) {
            System.out.println("\nElija la opción a realizar:\n1) Agregar\n2) Buscar\n3) Eliminar\n4) Listar\ns) Salir");
            option = input.nextLine();

            if (option.equals("1")) {
                controller.addRestaurant();
            } else if (option.equals("2")) {
                controller.searchRestaurant();
            } else if (option.equals("3")) {
                controller.removeRestaurant();
            } else if (option.equals("4")) {
                controller.listRestaurants();
            } else if (option.equals("s")) {
                System.out.println("Gracias por su visita!");
            } else {
                System.out.println("Opción no válida");
            }
        }
    }
}