package pie;
public class GreekPizza extends Pizza {
    public GreekPizza() {
        super("Greek Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making the dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding feta cheese, olives, and veggies...");
    }
}