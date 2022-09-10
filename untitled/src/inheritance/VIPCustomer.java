package inheritance;

public class VIPCustomer extends Customer {
    private double saleRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName){
        // super는 상위 클래스를 가리킴
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

}
