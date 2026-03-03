interface Payment {
    void pay();
}
class CCPayment implements Payment {
    public void pay() {
        System.out.println("Paid via Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Paid via UPI");
    }
}
public class Pay {
    public static void main(String[] args) {
        Payment p1 = new CCPayment();
        Payment p2 = new UPIPayment();
        p1.pay();
        p2.pay();
    }
}