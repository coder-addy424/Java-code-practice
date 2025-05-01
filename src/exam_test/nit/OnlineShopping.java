package exam_test.nit;

import com.nit.inheritance.Clothing;
import com.nit.inheritance.Electronics;

public class OnlineShopping {
    public static void main(String[] args) {
        Electronics et=new Electronics("Fan",2500.45,2,"Bajaj");
        et.displayInfo();
        System.out.println("==========");
       Clothing c=new Clothing("Killer",3000.32,4,"Medium");
       c.displayInfo();
    }
}
