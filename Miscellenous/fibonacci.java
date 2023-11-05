
/**
 * Write a description of class fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
   System.out.println("Enter How many Terms you want to print the series");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        System.out.println();
    }
    }
