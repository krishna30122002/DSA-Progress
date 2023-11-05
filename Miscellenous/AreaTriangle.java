
/**
 * Write a description of class AreaTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AreaTriangle
{
   public static void main(String args[])
   {
       System.out.println("Enter base and height of triangle");
       Scanner sc = new Scanner(System.in);
       float b=sc.nextFloat();
       float h=sc.nextFloat();
       double Area=0.5f*b*h;
       
       System.out.println("Area is "+Area);
       
   }
}
