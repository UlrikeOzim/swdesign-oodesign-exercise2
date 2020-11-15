package at.fhj.msd.swdesign.exercise.snack;

public class SandwichBar implements ISandwichBar {

    private Snack snack;


    public Snack getSnack() {
        return snack;
    }


    public Snack makeSnack() {
        makeSandwich();
        return snack;
    }

   /* public void makePizza() {

    }

    public void makeBurger() {

    }*/

    public void makeSandwich() {
        this.snack = new Snack(Snack.SANDWICH);
    }
}