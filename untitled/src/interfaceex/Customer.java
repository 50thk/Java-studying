package interfaceex;

public class Customer implements Buy, Sell{


    @Override
    public void buy() {
        System.out.println("buy");
    }

    @Override
    public void sell() {
        System.out.println("sell");
    }

    @Override
    public void order() {
        System.out.println("customer sell order");
    }
}
