package z17.Problem2;

public class SBanking {
    public static void main(String[] args) {
        Person johnP = new Person("John"),
                maryP = new Person("Mary");
        BankCustomer john = new BankCustomer(johnP);
        BankCustomer mary = new BankCustomer(maryP);

        john.getAccount().deposit(1000);
        mary.getAccount().deposit(2000);
        john.getAccount().transfer(mary.getAccount(),  500);
        mary.getAccount().withdraw(1000);

        System.out.println();
        System.out.println(john);
        System.out.println(mary);

        Account.setInterestRate(4.5);
        john.getAccount().addInterest();
        mary.getAccount().addInterest();

        System.out.println();
        System.out.println(john);
        System.out.println(mary);
    }
}
