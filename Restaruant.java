package restaruant;

import java.util.Scanner;

public class Restaruant {

    public static void main(String[] args) {
        NormalBurger n = new NormalBurger();
        HealthyBurger h = new HealthyBurger();
        DeluxBurger d = new DeluxBurger();
        System.out.println("Welcome to our restaruant");
        Scanner sc = new Scanner(System.in);
        System.out.println("what you would like to order? you can choose:" + "\n" + "a : Normal Burger beef or chicken" + "\n"
                + "        your chosen meat (beef or chicken), bread(white or brown ), extra cheese - extra tomato - extra potato - extra maunas "
                + " \n  " + "b:Healthy burger beef or chicken" + "\n" + "        your chosen meat (beef or chicken), Your bread is brown roll bread, extra cheese or extra tomato " + "\n"
                + "c:delux beef burger with drink and chips" + "\n" + "       your meat is beef , Your bread white roll bread, chips and drink ");
        char a = sc.next().charAt(0);

        if (a == 'a') {
            System.out.println("a:chicken- b:beef ");
            char g = sc.next().charAt(0);
            System.out.println("wouid you like a:extra tomato - b: extra cheese c:extra maunas d: extra potato e:two extra f:three extra g:all  h: none");
            char c = sc.next().charAt(0);
            switch (c) {
                case 'a':
                    n.ONEextraPrice();
                    break;
                case 'b':
                    n.ONEextraPrice();
                    break;
                case 'c':
                    n.ONEextraPrice();
                    break;
                case 'd':
                    n.ONEextraPrice();
                    break;
                case 'e':
                    System.out.println("which type of extra you woud like to add?");
                    String extra = sc.next();
                    n.TowextraPrice();
                    break;
                case 'f':
                    System.out.println("which type of extra you woud like to add?");
                    String add = sc.next();
                    n.threextraPrice();
                    break;
                case 'g':
                    n.extraPrice();
                    break;
                case 'h':
                    n.Price();
                    break;

            }
        }
        if (a == 'b') {
            System.out.println("a:chicken- b:beef ");
            char k = sc.next().charAt(0);
            System.out.println("wouid you like a:extra tomato - b: extra cheese c:both  d: none");
            char c = sc.next().charAt(0);
            switch (c) {
                case 'a':
                    h.ONEextraPrice();
                    break;
                case 'b':
                    h.ONEextraPrice();
                    break;
                case 'c':
                    h.extraPrice();
                    break;
                case 'd':
                    h.Price();
                    break;

            }
        }
        if (a == 'c') {
            System.out.println("wouid you like a:extra tomato - b: extra cheese c:both  d: none");
            char c = sc.next().charAt(0);
            switch (c) {
                case 'a':
                    d.ONEextraPrice();
                    break;
                case 'b':
                    d.ONEextraPrice();
                    break;
                case 'c':
                    d.extraPrice();
                    break;
                case 'd':
                    d.Price();
                    break;

            }
        }

    }

}
