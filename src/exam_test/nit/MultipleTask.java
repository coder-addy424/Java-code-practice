package exam_test.nit;

public class MultipleTask
{
    public static void main(String[] args) {
        Thread t1=new Thread(new Task("Task1"));
        Thread t2=new Thread(new Task("Task2"));
        Thread t3=new Thread(new Task("Task3"));
        t1.start();
        t2.start();
        t3.start();
    }
}
class Task implements Runnable
{
    private String taskName;
    Task(String taskName)
    {
        this.taskName=taskName;
    }

    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(taskName+" operation "+i+" at "+System.currentTimeMillis());
                Thread.sleep(3000);
            }
        }catch(InterruptedException e)
        {
            System.out.println(taskName+" was interrupted");
        }
    }
}
