package at.fhj.msd.swdesign.exercise.snack;

public class PizzaBar implements ISnackbar {

    private Snack snack;

    public Snack getSnack() {
        return snack;
    }

    public Snack makeSnack() {

        makePizza();
        return snack;
    }

    public void makePizza() {
        this.snack = new Snack(Snack.PIZZA);
    }

    public void makeBurger() {
    }

    public void makeSandwich() {
    }


}
