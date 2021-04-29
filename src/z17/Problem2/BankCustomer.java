package z17.Problem2;

public class BankCustomer {
    private Person person;
    private Account account = new Account();

    public BankCustomer(Person person) {
        this.person = person;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "person=" + person +
                ", account=" + account +
                '}';
    }
}
