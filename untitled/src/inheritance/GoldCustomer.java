package inheritance;

public class GoldCustomer extends Customer {

    public GoldCustomer() {
        bonusRatio = 0.05;
        customerGrade = "Gold";
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
