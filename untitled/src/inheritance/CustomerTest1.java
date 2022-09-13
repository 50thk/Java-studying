package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        /*
        하위 class 생성 시 상위 class 먼저 생성
         */
//        Customer customerLee = new Customer();
//        customerLee.setCustomerID(10100);
//        customerLee.setCustomerName("Lee");

        // 묵시적 상위클래스로의 형변환 - 업캐스팅, VIPCustomer 대신 Customer 가능
        VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);


        // System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}
