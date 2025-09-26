public class VeganPizza extends Pizza {
    public VeganPizza() {
        super("Vegan Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding toppings: mushrooms, bell peppers, onions, olives...");
    }
}
