import java.util.Scanner;
public class Cuboid
{
   public static void main(String args[])
   {
       System.out.println("Enter Length, Breadth and Height");
       Scanner sc = new Scanner(System.in);
       int l=sc.nextInt();
       int b=sc.nextInt();
       int h=sc.nextInt();
       long area=2*((l*b)+(b*h)+(h*l));
       long vol=l*b*h;
       System.out.println("Area is "+area+" and Volume is "+vol);
   }
}