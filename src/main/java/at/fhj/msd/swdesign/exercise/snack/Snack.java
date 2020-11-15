package at.fhj.msd.swdesign.exercise.snack;

public abstract class Snack {

    //public final static String PIZZA = "Pizza";
    //public final static String BURGER = "Burger";
  //  public final static String SANDWICH = "Sandwich";

    private String snackType;
//protected for further "extend" see new classes "SnackXXX"
    protected Snack(String snackType) {
        this.snackType = snackType;
    }

    @Override
    public String toString() {
        return "This is a tasty " + this.snackType;
    }
}
