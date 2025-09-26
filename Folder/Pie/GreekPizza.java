public class GreekPizza extends Pizza {
    public GreekPizza() {
        super("Greek Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding toppings: feta cheese, olives, tomatoes, spinach...");
    }
}
