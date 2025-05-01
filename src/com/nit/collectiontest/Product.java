package com.nit.collectiontest;

public record Product(Integer pId, String pName)
{
    public Product
    {
        if(pId<=0)
        {
            throw new IllegalArgumentException("Id can't be zero");
        }
    }

}



