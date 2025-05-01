package exam_test.nit;

public class PanCard {
    private String panId;
    public PanCard(String panId)
    {
        this.panId="FHBPR6899K";
    }
    public void display()
    {
        System.out.println("Pan Number is: "+this.panId);
    }
}
