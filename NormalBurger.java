package restaruant;

public class NormalBurger {

    private String name;
    private String beef;
    private String chicken;
    private String whiteBread;
    private String extraTomata;
    private String extraCheese;
    private String extra_maunas;
    private String extra_potato;
    private double price;

    public NormalBurger() {

    }

    public NormalBurger(String name, String beef, String chicken, String whiteBread,
            String extraTomata, String extraCheese, String extra_maunas, String extra_potato, double price) {
        this.name = name;
        this.beef = beef;
        this.chicken = chicken;
        this.whiteBread = whiteBread;
        this.extraTomata = extraTomata;
        this.extraCheese = extraCheese;
        this.extra_maunas = extra_maunas;
        this.extra_potato = extra_potato;
        this.price = price;
    }

    public String getBeef() {
        return beef;
    }

    public void setBeef(String beef) {
        this.beef = beef;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getWhiteBread() {
        return whiteBread;
    }

    public void setWhiteBread(String whiteBread) {
        this.whiteBread = whiteBread;
    }

    public String getExtraTomata() {
        return extraTomata;
    }

    public void setExtraTomata(String extraTomata) {
        this.extraTomata = extraTomata;
    }

    public String getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(String extraCheese) {
        this.extraCheese = extraCheese;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExtra_maunas() {
        return extra_maunas;
    }

    public void setExtra_maunas(String extra_maunas) {
        this.extra_maunas = extra_maunas;
    }

    public String getExtra_potato() {
        return extra_potato;
    }

    public void setExtra_potato(String extra_potato) {
        this.extra_potato = extra_potato;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Price() {
        System.out.println("The Normal Burger's price is 50 ");
    }

    public void extraPrice() {
        System.out.println("The Normal Burger with four addation cost 70 ");
    }

    public void ONEextraPrice() {
        System.out.println("The Normal Burger with one addation cost 55 ");
    }

    public void TowextraPrice() {
        System.out.println("The Normal Burger with tow addation cost 60 ");
    }

    public void threextraPrice() {
        System.out.println("The Normal Burger with three addation cost 65 ");
    }

}
