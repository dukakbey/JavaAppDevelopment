package org.sceylan.util.date;

public class DateUtil {

    static int [] daysOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
    static String [] monthsOfYear = {"ocak","subat","mart","nisan","mayis","haziran",
            "temmuz","agustos","eylul","ekim","kasim","aralik"};
    static String [] daysOfWeek = {"pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"};
    static void getDay()
    {

    }
    public static String getDateString(int day,int month,int year)
    {
        return String.valueOf(day)+" "+ monthsOfYear[month-1]+" " + year +" "+getDay(day,month,year);
    }
    public static int getTotalDays(int day,int month,int year)
    {
        int totalDays = day;
        for(int i = 0;i<month-1;i++)
            totalDays += daysOfMonths[i];
        return isLeapYear(year)?totalDays+1:totalDays;
    }
    public static boolean isLeapYear(int year)
    {
        return year%4 == 0;
    }
    public static boolean isValidDate(int day,int month,int year)
    {
        return day>0 && day<32 && 0<month && month<12 && year>0;
    }
    public static String getDay(int day,int month,int year)
    {
        if(isValidDate(day,month,year))
        {
            int total = 0;
            for(int i =1934;i<year;i++)
            {
                total += getTotalDays(31,12,i);
            }
            total += getTotalDays(day,month,year)-1;
            return  daysOfWeek[total%7];
        }
        else
            System.out.println("invalid date!!");
        return "";

    }
}
