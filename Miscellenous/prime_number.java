
/**
 * Write a description of class prime_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class prime_number
{
    static int prime(int x){
        int count =0;
        for(int i =2;i<=x;i++){
            if(x%i==0){
                ++count;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=prime(n);
        if(c==1)
        System.out.println("Prime");
        else
        System.out.println("Not a Prime Number");
    }
}
