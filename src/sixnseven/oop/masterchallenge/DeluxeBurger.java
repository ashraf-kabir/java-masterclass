package sixnseven.oop.masterchallenge;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 15.54, "white");
        super.addHamburgerAdditional1("Chips", 2.75);
        super.addHamburgerAdditional2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAdditional1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditional2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditional3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAdditional4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
