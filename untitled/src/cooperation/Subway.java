package cooperation;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("subway" + lineNumber + "passenger count" + passengerCount + "money" + money);
    }
}
