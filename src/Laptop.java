public class Laptop {
    private double laptopPrice;
    private String laptopBrand;


    public Laptop(double laptopPrice, String laptopBrand)
    {
        super();
        this.laptopPrice = laptopPrice;
        this.laptopBrand = laptopBrand;
    }



    @Override
    public String toString() {
        return "Laptop [laptopPrice=" + laptopPrice + ", laptopBrand=" + laptopBrand + "]";
    }



    public static void main(String[] args)
    {
        Laptop laptop1 = new Laptop(86000, "HP");
        Laptop laptop2 = laptop1; // [Diagram 20-SEP]

        System.out.println("Before Change");
        System.out.println(laptop1);
        System.out.println(laptop2);

        laptop2.laptopBrand = "DELL";
        laptop2.laptopPrice = 95000;

        System.out.println("After Change");
        System.out.println(laptop1);
        System.out.println(laptop2);



    }
}
