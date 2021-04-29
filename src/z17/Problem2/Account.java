package z17.Problem2;

public class Account {
    private double balance;
    private static double rate;

    public void deposit(double money){
        balance += money;
    }
    public void withdraw(double money){
        balance -= money;
    }
    public void transfer(Account account, double money){
        this.balance -= money;
        account.balance += money;
    }
    public static void setInterestRate(double interest){
        rate = interest;
    }
    public void addInterest(){
        balance = (balance * (rate/100)) + balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
