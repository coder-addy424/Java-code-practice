package com.nit.method_overriding;

public class MultimediaSystem
{
    public static void main(String[] args) {
        Image i=new Image("Adi",5,"10PX");
       Image img= i.getDetails();
        System.out.println(img);
        Video v=new Video("Verma Beta",10,"50PX");
        Video vi=v.getDetails();
        System.out.println(vi);
    }
}
