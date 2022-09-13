package template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("Human driving");
        System.out.println("Human control handle");
    }

    @Override
    public void stop() {
        System.out.println("Human use break");
    }

    @Override
    public void wiper() {
        System.out.println("Human control wiper");
    }


}
