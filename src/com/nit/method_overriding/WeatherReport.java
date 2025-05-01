package com.nit.method_overriding;

public class WeatherReport
{
public  void generateReport()
{
    System.out.println("Weather is Good");
}
public  void generateReport(String location)
{
    System.out.println("Weather is bad at this Location : "+location);
}
public  void generateReport(int year, int month, int day)
{
    System.out.println("Weather of "+day+"-"+month+"-"+year+" is Fabulous");
}
}
class HourlyReport extends WeatherReport
{
    @Override
    public void generateReport()
    {
        System.out.println("Weather is Good");
    }
    @Override
    public void generateReport(String location)
    {
        System.out.println("Weather is bad at this Location : "+location);
    }
    @Override
    public void generateReport(int year, int month, int day)
    {
        System.out.println("Weather of "+day+"-"+month+"-"+year+" is Fabulous");
    }
    public void generateReport(int hour)
    {
        System.out.println("After "+hour+" hour Weather will be Bad");
    }
    public void generateReport(int hour,String date)
    {
        System.out.println("On "+date+" After "+hour+" PM/AM Weather will be So Romantic");
    }
}
