package inheritance;

public class Customer {
    // 모든 class는 object를 상속받아 자동으로 super() 호출 됨
    /*
    가시성 외부 class, 하위 class, 동일 package, 내부 class
    public O, O, O, O
    protected X, O, O, O
    default X, X, O, O
    private X, X, X, O
     */

    protected int customerID; // protected -> 같은 패키지, 상속관계에서 가시성이 존재
    protected String customerName;
    protected String customerGrade;
    int bonusPoint; // default -> 같은 패키지 내
    protected double bonusRatio;

    public Customer(){
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        if(customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        }
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 's grade is " + customerGrade + " and bonuspoint is " + bonusPoint + ".";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
