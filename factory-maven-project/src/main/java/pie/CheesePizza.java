package pie;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super("Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding cheese...");
    }
}
