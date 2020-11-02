package at.fhj.msd.swdesign.exercise.snack;

public class Snack {

    public final static String PIZZA = "Pizza";
    public final static String BURGER = "Burger";
    public final static String SANDWICH = "Sandwich";

    private String snackType;

    public Snack(String type) {
        snackType = type;
    }

    @Override
    public String toString() {
        return "This is a tasty " + this.snackType;
    }
}
