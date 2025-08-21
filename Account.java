public class Account {
    private double balance;
    public Account (double bal){
        this.balance = bal;
    } 
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void display(){
        System.out.println("Balance is : "+ balance );
    }
    public static void main(String[] args) {
        Account a = new Account(1000);
        System.out.println(a.getBalance());
        
        a.deposit(300);
        
        a.display();
    }
}
