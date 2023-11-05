import java.util.Scanner;
public class BitwiseOperator
{
   public static void main(String args[])
   {
       int x,y;
       Scanner sc = new Scanner(System.in);
       x=sc.nextInt();   //can be written as binary number
       y=sc.nextInt();
       int z1=x&y;
       int z2=x|y;
       int z3=x^y;
       System.out.println(z1);
       
       System.out.println(z2);
       
       System.out.println(z3);
   }
}