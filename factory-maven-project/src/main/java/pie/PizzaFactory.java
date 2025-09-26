package pie;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type == null) return null;

        // normalize case and spacing (so "Cheese", "cheese", "GLUTEN FREE" all work)
        String normalized = type.toLowerCase().replace(" ", "-");

        switch (normalized) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "vegan":
                return new VeganPizza();
            case "gluten-free":
                return new GlutenFreePizza();
            case "greek":
                return new GreekPizza();
            default:
                return null; // testCreateUnknownPizza expects null
        }
    }
}
