public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("=== Testing PizzaStore ===");

        testStore(store, PizzaType.CHEESE);
        testStore(store, PizzaType.GREEK);
        testStore(store, PizzaType.PEPPERONI);
        testStore(store, PizzaType.VEGAN);
        testStore(store, PizzaType.GLUTEN_FREE);

        // Test invalid pizza (null)
        System.out.println("\nTesting invalid pizza input:");
        store.orderPizza(null);
    }

    private static void testStore(PizzaStore store, PizzaType type) {
        System.out.println("\nOrdering " + type.getDisplayName() + ":");
        store.orderPizza(type);
    }
}
