package pie;
public class VeganPizza extends Pizza {
    public VeganPizza() {
        super("Vegan Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making vegan dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding vegan cheese and veggies...");
    }
}