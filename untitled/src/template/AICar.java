package template;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("Auto driving");
        System.out.println("AI control handle");
    }

    @Override
    public void stop() {
        System.out.println("AI use break");
    }

    @Override
    public void wiper() {
        System.out.println("AI control wiper");
    }

    @Override
    public void washCar() {
        System.out.println("Auto wash car");
    }
}
