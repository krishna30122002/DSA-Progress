import java.util.Scanner;
public class QuadraticEquation
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Coefficients");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       double root1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
       double root2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
       System.out.println("Root 1 is "+root1+" and Root 2 is "+root2);
   }
}