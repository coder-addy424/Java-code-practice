package exam_test.nit;

public class Account
{
    private int balance;
    public Account(int initialBalance)
    {
        this.balance=initialBalance;
    }
    public synchronized void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Deposited : "+amount);
        System.out.println("CurrentBalance : "+balance);
    }
    public synchronized void withdraw(int amount)
    {
        balance-=amount;
        System.out.println("Withdraw : "+amount);
        System.out.println("CurrentBalance : "+balance);
    }
    public int getBalance()
    {
        return balance;
    }
}
