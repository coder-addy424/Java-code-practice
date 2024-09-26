package com.nit.constructor;
public class Employee {
    String customerName;
    int customerAge;
    String customerDepartment;
    double customerSalary;
    String customerPerformance;
    public Employee( int customerAge,String customerName,String customerDepartment, double customerSalary)
    {
        this.customerDepartment=customerDepartment;

        if(customerAge<=0)
        {
            System.err.println("Invalid Input..Age must be a Positive Integer");
        }
        else
            this.customerAge=customerAge;
        this.customerName=customerName;
        this.customerSalary=customerSalary;

    }
    public double updateSalary(String customerPerformance)
    {
        if(customerPerformance.equals("Good"))
        {
            this.customerSalary=this.customerSalary+10000;
            this.customerPerformance="Good";
        }
        else if(customerPerformance.equals("Average"))
        {
            this.customerSalary=this.customerSalary+5000;
            this.customerPerformance="Average";
        }
        else
        {
            this.customerSalary=this.customerSalary;
            this.customerPerformance="Null";
        }
        return this.customerSalary;
    }
    public String toString()
    {
        return "Customer Details [CustomerName="+this.customerName+" , CustomerAge="+this.customerAge+" , CustomerDepartment="+this.customerDepartment+", CustomerSalary="+this.customerSalary+",CustomerPerformance="+this.customerPerformance+"]";
    }


}
