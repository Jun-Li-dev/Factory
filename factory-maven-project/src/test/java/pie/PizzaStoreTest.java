package pie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class PizzaStoreTest {

    @Test
    void testOrderCheesePizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Cheese");
        assertNotNull(pizza);
        assertEquals("Cheese Pizza", pizza.getName());
    }

    @Test
    void testOrderGreekPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Greek");
        assertNotNull(pizza);
        assertEquals("Greek Pizza", pizza.getName());
    }

    @Test
    void testOrderPepperoniPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Pepperoni");
        assertNotNull(pizza);
        assertEquals("Pepperoni Pizza", pizza.getName());
    }

    @Test
    void testOrderVeganPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Vegan");
        assertNotNull(pizza);
        assertEquals("Vegan Pizza", pizza.getName());
    }

    @Test
    void testOrderGlutenFreePizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Gluten Free");
        assertNotNull(pizza);
        assertEquals("Gluten Free Pizza", pizza.getName());
    }

    @Test
    void testOrderUnknownPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Unknown");
        assertNull(pizza); // passes safely now
    }
}
