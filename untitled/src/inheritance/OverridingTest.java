package inheritance;

public class OverridingTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "Lee");
        int price = customerLee.calcPrice(10000);
        System.out.println("payment is " + price +" and " + customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
        price = customerKim.calcPrice(10000);
        System.out.println("payment is " + price +" and " + customerKim.showCustomerInfo());

        // (가상 메서드) 프로그램에서 어떤 객체의 변수나 메서드의 참조는 그 타입에 따라 이루어짐. 가상 메서드의 경우는 타입과 상관없이 실제 생성된 인스턴스의 메서드가 호출 되는 원리
        // 먼저 Customer의 calcPrice instance가 생성되고 VIPCustomer의 calcPrice instance가 재정의 되어 생성된다.
        // 이 과정에서 재정의된 calcPrice의 메서드가 오버라이딩 되어 호출됨
        Customer customerWho = new VIPCustomer(100010, "Who", 100);
        price = customerWho.calcPrice(10000);
        System.out.println("payment is " + price +" and " + customerWho.showCustomerInfo());

        Customer customerGold = new GoldCustomer();
        price = customerGold.calcPrice(10000);
        System.out.println("payment is " + price +" and " + customerGold.showCustomerInfo());
    }
}
