package com.nit.oops;

import java.util.Scanner;

public class Institute {

    int InstituteID;
    String InstituteName;
    double InstituteFees;

    public void setInstituteData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Institute Id : ");
        InstituteID=sc.nextInt();

        System.out.print("Enter Institute Name : ");
        InstituteName=sc.nextLine();
        InstituteName=sc.nextLine();

        System.out.print("Enter Institute Fees : ");
        InstituteFees=sc.nextDouble();
    }

    public void getInstituteData()
    {
        System.out.println(InstituteID+" is your ID");
        System.out.println("The Name of Institute is : "+InstituteName);
        System.out.println("Fees of "+InstituteName+" is : "+InstituteFees);
    }
}
