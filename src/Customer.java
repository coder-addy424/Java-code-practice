public class Customer {

    private int customerId;
    private String customerName;


    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
    }

    public static void main(String[] args)
    {
        Customer c1 = new Customer();
        c1.customerId = 111;
        c1.customerName = "Scott";

        Customer c2 = new Customer();
        c2.customerId = c1.customerId;
        c2.customerName = c1.customerName;

        System.out.println("Before Change");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("..................");
        System.out.println("After change in 2nd Object");
        c2.customerId = 222;
        c2.customerName = "Smith";
        System.out.println(c1);
        System.out.println(c2);
    }
}
