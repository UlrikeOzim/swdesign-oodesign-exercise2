package at.fhj.msd.swdesign.exercise.snack;

public class BurgerBar implements ISnackbar {

    private Snack snack;

    public Snack getSnack() {
        return snack;
    }


    public Snack makeSnack() {
        makeBurger();
        return snack;
    }

    public void makePizza() {

    }

    public void makeBurger() {
        this.snack = new Snack(Snack.BURGER);

    }

    public void makeSandwich() {

    }
}
