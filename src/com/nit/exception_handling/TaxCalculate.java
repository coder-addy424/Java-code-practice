package com.nit.exception_handling;

public class TaxCalculate
{
    public double calculateTax(Employee emp) throws CountryNotValidException,NameNotValidException,NotEligibleForTaxException
    {
        if(!("Indian").equalsIgnoreCase(emp.getNationality()))
        {
            throw new CountryNotValidException(Message.COUNTRY_NOT_VALID_EXCEPTION_MSG);
        }
        if(emp.getEmployeeName()==null || emp.getEmployeeName().trim().isEmpty())
        {
            throw new NameNotValidException(Message.NAME_NOT_VALID_EXCEPTION_MSG);
        }

        if(emp.getSalary()<100000)
        {
            throw new NotEligibleForTaxException(Message.NOT_ELIGIBLE_FOR_TAX_EXCEPTION_MSG);
        }
        double tax;
        if(emp.getSalary() >=100000)
        {
            tax=emp.getSalary() *0.08;
        }
        else if(emp.getSalary()>=50000)
        {
            tax=emp.getSalary()*0.06;
        }
        else if(emp.getSalary()>=30000)
        {
            tax=emp.getSalary()*0.05;
        }
        else
            tax=emp.getSalary()*0.04;
        return tax;
    }
}

