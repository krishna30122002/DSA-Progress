
/**
 * Write a description of class leapyear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class leapyear
{
    public static void main(String args[])
    {
        int year =2022;
        if(year%400==0){
        System.out.println("Leap Year");
    }
        else if(year%100==0){
        System.out.println("Not A Leap Year");
    }
    else if(year%4==0){
        System.out.println("Leap Year");
    }
    else{
    System.out.println("Not A Leap Year");
}
}
    }

