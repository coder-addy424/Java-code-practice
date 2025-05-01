package com.nit.multi_threading.education_institute;

public class ClassOffer
{
    String offerText;

    public ClassOffer(String offerText)
    {
        this.offerText=offerText;
    }
    public String getOfferText()
    {
        return offerText;
    }

    @Override
    public String toString() {
        return "ClassOffer{" +
                "offerText='" + offerText + '\'' +
                '}';
    }
}
