import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Pizza Store!");
        System.out.println("Available pizzas:");
        for (PizzaType type : PizzaType.values()) {
            System.out.println("- " + type.getDisplayName());
        }

        System.out.print("Please enter the pizza you want: ");
        String input = scanner.nextLine().trim().toLowerCase();

        // Map user input to PizzaType
        PizzaType chosenType = null;
        for (PizzaType type : PizzaType.values()) {
            String typeName = type.getDisplayName().toLowerCase();
            if (input.contains(typeName.replace(" pizza", ""))) { 
                // e.g., "cheese" matches "cheese pizza"
                chosenType = type;
                break;
            }
        }

        if (chosenType != null) {
            store.orderPizza(chosenType);
        } else {
            System.out.println("Sorry, we don't have that pizza.");
        }

        scanner.close();
    }
}
