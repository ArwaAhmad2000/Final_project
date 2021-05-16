package restaruant;

public class HealthyBurger extends NormalBurger {

    private String brownBread;

    public HealthyBurger() {
    }

    public HealthyBurger(String brownBread) {
        this.brownBread = brownBread;
    }

    public HealthyBurger(String brownBread, String name, String beef, String chicken, String whiteBread, String extraTomata, String extraCheese, double price) {
        super(name, beef, chicken, whiteBread, extraTomata, extraCheese, extraTomata, extraTomata, price);
        this.brownBread = brownBread;
    }

    public String getBrownBread() {
        return brownBread;
    }

    public void setBrownBread(String brownBread) {
        this.brownBread = brownBread;
    }

    @Override
    public void Price() {
        System.out.println("The Healthy Burger's price is 40 ");
    }

    @Override
    public void extraPrice() {
        System.out.println("The Healthy Burger with two addation cost 50 ");
    }

    @Override
    public void ONEextraPrice() {
        System.out.println("The Healthy Burger with one addation cost 45 ");
    }

}
