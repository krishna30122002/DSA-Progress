
/**
 * Write a description of class menudriven1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class menudriven1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("MENU\n1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE");
        sc.nextLine();
        String option=sc.nextLine();
        switch(option){
            case "ADD": System.out.println(a+b); 
            break;
            case "SUBTRACT": System.out.println(a-b);
            break;
            case "MULTIPLY": System.out.println(a*b);
            break;
            case "DIVIDE": System.out.println((float)a/b);
            break;
            default: System.out.println("Invalid Choice");
            break;
        
        }
}
}