public class Encapsulation{
    public static void main(String args[]){
    BankAccount account= new BankAccount();
    account.deposit(500);
    account.withdraw(200);
    System.out.println("Balance: " +account.getBalance());
    }
}
class BankAccount{
    private double balance=0;
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;

        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
    }
}