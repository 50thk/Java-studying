package template;

public abstract class Car {
    // 템플릿 메서드 : 추상 메서드나 구현된 메서드를 활용하여 전체 기능의 흐름(시나리오)을 정의하는 메서드, final로 선언하면 하위 클래스에서 재정의 불가

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();
    // 재정의해서 사용
    public void washCar() {}

    public void startCar() {
        System.out.println("On");
    }

    public void turnOff() {
        System.out.println("Off");
    }

    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
