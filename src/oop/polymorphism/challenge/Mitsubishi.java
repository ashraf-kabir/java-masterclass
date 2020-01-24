package oop.polymorphism.challenge;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi -> brake()");
    }
}
