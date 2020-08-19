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

            System.out.println("\nElija la opción a realizar:\n1) Agregar\n2) Buscar\n3) Actualizar\n4) Eliminar\ns) Salir");
            String optionCrud = input.nextLine();

            if (optionCrud.equals("1")) {
                controller.addRestaurant();
            } else if (optionCrud.equals("2")) {
                controller.searchRestaurant();
            }

            option = input.nextLine();
        }
    }
}