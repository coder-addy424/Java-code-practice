package com.nit.exception_handling;

public class NotEligibleForTaxException extends Exception
{
    public NotEligibleForTaxException()
    {

    }
    public NotEligibleForTaxException(String errorMsg)
    {
        super(errorMsg);
    }
}
