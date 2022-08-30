package cooperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("bus" + busNumber + "passenger count" + passengerCount + "money" + money);
    }
}
