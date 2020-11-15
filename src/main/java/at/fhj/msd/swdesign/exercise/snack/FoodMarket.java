package at.fhj.msd.swdesign.exercise.snack;

public class FoodMarket {

    private ISnackbar snackbar;


    public FoodMarket() {
    }

    public void setSnackbar(ISnackbar snackbar) {
        this.snackbar = snackbar;
    }

    public Snack prepareSnack() {
        return this.snackbar.makeSnack();
    }


}
