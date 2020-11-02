package at.fhj.msd.swdesign.exercise.snack;

public class SnackBarMain {

    public static void main(String[] args) {

        FoodMarket foodMarket = new FoodMarket();

        foodMarket.setSnackbar(new PizzaBar());
        System.out.println(foodMarket.prepareSnack());

        foodMarket.setSnackbar(new BurgerBar());
        System.out.println(foodMarket.prepareSnack());

        foodMarket.setSnackbar(new SandwichBar());
        System.out.println(foodMarket.prepareSnack());

    }
}
