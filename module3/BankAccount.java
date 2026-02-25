public class BankAccount {
    private String accNum;
    private double bal;
    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && bal >= amount) {
            bal -= amount;
        }
    }
    public double getBal() {
        return bal;
    }  
    public String getAccNum() {
        return accNum;
    }
}