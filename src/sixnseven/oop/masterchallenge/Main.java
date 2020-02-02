package sixnseven.oop.masterchallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        hamburger.addHamburgerAdditional1("Tomato", 0.27);
        hamburger.addHamburgerAdditional2("Lettuce", 0.75);
        hamburger.addHamburgerAdditional3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.66);
        healthyBurger.addHamburgerAdditional1("Egg", 5.43);
        healthyBurger.addHealthAdditional1("Lentils", 3.41);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAdditional1("Do not do this", 5.7);
        deluxeBurger.itemizedHamburger();
    }
}
