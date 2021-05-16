package restaruant;

public class DeluxBurger extends NormalBurger {

    private static String chips;
    private static String drink;

    public DeluxBurger() {
    }

    public DeluxBurger(String chips, String drink) {
        DeluxBurger.chips = chips;
        DeluxBurger.drink = drink;
    }

    public DeluxBurger(String chips, String drink, String name, String beef, String chicken, String whiteBread, String extraTomata, String extraCheese, double price) {
        super(name, beef, chicken, whiteBread, extraTomata, extraCheese, extraTomata, extraTomata, price);
        DeluxBurger.chips = chips;
        DeluxBurger.drink = drink;
    }

    public DeluxBurger(String name, String beef, String chicken, String whiteBread, String extraTomata, String extraCheese, double price) {
        super(name, beef, chicken, whiteBread, extraTomata, extraCheese, extraTomata, extraTomata, price);
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        DeluxBurger.chips = chips;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public void Price() {
        System.out.println("The Delux Burger's price is 60 ");
    }

    @Override
    public void extraPrice() {
        System.out.println("The Delux Burger with two addation cost 70 ");
    }

    @Override
    public void ONEextraPrice() {
        System.out.println("The Delux Burger with one addation cost 65 ");
    }
}
