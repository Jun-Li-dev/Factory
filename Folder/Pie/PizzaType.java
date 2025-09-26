public enum PizzaType {
    CHEESE("Cheese Pizza"),
    PEPPERONI("Pepperoni Pizza"),
    GREEK("Greek Pizza"),
    VEGAN("Vegan Pizza"),
    GLUTEN_FREE("Gluten Free Pizza");

    private final String displayName;

    PizzaType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
