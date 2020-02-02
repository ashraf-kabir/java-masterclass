package sixnseven.oop.polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(4, "Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}
