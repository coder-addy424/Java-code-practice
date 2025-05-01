package com.nit.exception_handling;

public class CountryNotValidException extends Exception
{
    public CountryNotValidException()
    {

    }

    public CountryNotValidException(String errorMsg)
    {
        super(errorMsg);
    }


}
