package abstractex;

public abstract class Computer {
    // 추상 클래스를 만드는 이유 - 상속 받는 쪽에서 구현

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("System On");
    }

    public void turnOff() {
        System.out.println("System Off");
    }
}
