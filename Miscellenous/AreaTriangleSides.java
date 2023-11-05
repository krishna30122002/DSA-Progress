import java.util.Scanner; 
public class AreaTriangleSides
 {     
     public static void main(String[] args) 
     {         
         Scanner sc = new Scanner(System.in);         
         System.out.println("Enter sides of triangle");         
         int a=sc.nextInt();         
         int b=sc.nextInt();         
         int c=sc.nextInt();         
         float s =((a+b+c)/2f);         
         double area =Math.sqrt((s)*(s-a)*(s-b)*(s-c));         
         System.out.println("Area is "+area);    
        } 
    }