public class PizzaFactoryTest {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        System.out.println("=== Testing PizzaFactory ===");

        testPizza(factory, PizzaType.CHEESE, "Cheese Pizza");
        testPizza(factory, PizzaType.GREEK, "Greek Pizza");
        testPizza(factory, PizzaType.PEPPERONI, "Pepperoni Pizza");
        testPizza(factory, PizzaType.VEGAN, "Vegan Pizza");
        testPizza(factory, PizzaType.GLUTEN_FREE, "Gluten Free Pizza");

        // Test null input
        Pizza nullPizza = factory.createPizza(null);
        if (nullPizza == null) {
            System.out.println("Null pizza test passed!");
        } else {
            System.out.println("Null pizza test FAILED!");
        }
    }

    private static void testPizza(PizzaFactory factory, PizzaType type, String expectedName) {
        Pizza pizza = factory.createPizza(type);
        if (pizza != null && pizza.getName().equals(expectedName)) {
            System.out.println(expectedName + " test passed!");
        } else {
            System.out.println(expectedName + " test FAILED!");
        }
    }
}
