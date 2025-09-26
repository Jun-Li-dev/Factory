public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super("Pepperoni Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding cheese and pepperoni slices...");
    }
}
