package pie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    @Test
    void testCreateCheesePizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("Cheese");
        assertNotNull(pizza);
        assertEquals("Cheese Pizza", pizza.getName());
    }

    @Test
    void testCreateGlutenFreePizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("Gluten Free");
        assertNotNull(pizza);
        assertEquals("Gluten Free Pizza", pizza.getName());
    }

    @Test
    void testCreateGreekPizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("Greek");
        assertNotNull(pizza);
        assertEquals("Greek Pizza", pizza.getName());
    }

    @Test
    void testCreatePepperoniPizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("Pepperoni");
        assertNotNull(pizza);
        assertEquals("Pepperoni Pizza", pizza.getName());
    }

    @Test
    void testCreateVeganPizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("Vegan");
        assertNotNull(pizza);
        assertEquals("Vegan Pizza", pizza.getName());
    }

    @Test
    void testCreateUnknownPizza() {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza("Unknown");
        assertNull(pizza);
    }
}