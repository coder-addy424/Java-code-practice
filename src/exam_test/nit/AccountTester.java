package exam_test.nit;

public class AccountTester
{
    public static void main(String[] args) {

        Account account=new Account(1000);
        account.deposit(500);
        account.withdraw(200);

        Thread t1=new Thread(()-> {
            for(int i=0;i<5;i++)
            {
                account.deposit(100);
            }
        });

        Thread t2=new Thread(()-> {
            for(int i=0;i<5;i++)
            {
                account.withdraw(50);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Balance : "+account.getBalance());
    }
}
