public class Pizza {
    String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Making dough...");
        System.out.println("Spreading the sauce...");
        System.out.println("Adding toppings for " + name + "...");
    }

    public void bake() {
        System.out.println("Baking " + name + "...");
        System.out.println("15 minutes til ready...");
        System.out.println("10 minutes til ready...");
        System.out.println("5 minutes til ready...");
        System.out.println("Pizza ready!");
    }

    public void cut() {
        System.out.println("Cutting pizza into 8 slices!");
    }

    public void box() {
        System.out.println("Boxing pizza.");
        System.out.println("Here is your " + name + "!");
    }

    public String getName() {
        return name;
    }
}
