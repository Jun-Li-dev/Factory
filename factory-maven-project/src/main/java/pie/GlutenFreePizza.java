package pie;

public class GlutenFreePizza extends Pizza {
    public GlutenFreePizza() {
        super("Gluten Free Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making gluten-free dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding cheese and veggies...");
    }
}