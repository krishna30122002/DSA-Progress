
/**
 * Write a description of class fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class apseries
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Term");
        int a=sc.nextInt();
        System.out.println("Enter Common Difference");
        int d=sc.nextInt();
        System.out.println("Enter How many Terms you want to print the series");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            a=a+d;
            System.out.print(a+"  ");
        }
    }
    }
