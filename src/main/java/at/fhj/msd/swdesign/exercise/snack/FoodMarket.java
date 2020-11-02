package at.fhj.msd.swdesign.exercise.snack;

public class FoodMarket {

    private PizzaBar pizzahead;
    private BurgerBar burgerqueen;
    private SandwichBar tramway;


    public FoodMarket() {
    }

    public void setSnackbar(BurgerBar burgerqueen) {
        this.burgerqueen = burgerqueen;
    }

    public void setSnackbar(PizzaBar pizzahead) {
        this.pizzahead = pizzahead;
    }

    public void setSnackbar(SandwichBar tramway) {
        this.tramway = tramway;
    }

    public Snack prepareSnack() {

        Snack snack = null;

        if (pizzahead != null) {
            snack = this.pizzahead.makeSnack();
        }

        if (burgerqueen != null) {
            snack = this.burgerqueen.makeSnack();
        }

        if (tramway != null) {
            snack = this.tramway.makeSnack();
        }

        return snack;
    }

}
