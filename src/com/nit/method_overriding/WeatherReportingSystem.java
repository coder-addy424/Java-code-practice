package com.nit.method_overriding;

public class WeatherReportingSystem
{
    public static void main(String[] args) {
        WeatherReport wr=new WeatherReport();
        wr.generateReport();
        wr.generateReport("HYD");
        wr.generateReport(2022,06,25);
        System.out.println();
        HourlyReport hr=new HourlyReport();
        hr.generateReport();
        hr.generateReport(4);
        hr.generateReport(4,"23-09-2022");
    }
}
