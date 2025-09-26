package pie;
public class Main {
    public static void main(String[] args) {
        // Initialize the pizza factory
        PizzaFactory pizzaFactory = new PizzaFactory();

        // Example of creating a pizza
        Pizza pizza = pizzaFactory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // Additional logic for user interaction can be added here
    }
}