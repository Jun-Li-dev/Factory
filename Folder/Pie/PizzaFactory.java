public class PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        if (type == null) {
            return null; // handle null safely
        }

        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case GREEK:
                return new Pizza("Greek Pizza"); // add toppings if needed
            case VEGAN:
                return new VeganPizza();
            case GLUTEN_FREE:
                return new GlutenFreePizza();
            default:
                return null;
        }
    }
}
