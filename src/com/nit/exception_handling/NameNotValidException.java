package com.nit.exception_handling;

public class NameNotValidException extends Exception
{
    public NameNotValidException()
    {

    }

    public NameNotValidException(String errorMsg)
    {
        super(errorMsg);
    }
}
