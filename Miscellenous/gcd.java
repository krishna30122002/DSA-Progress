
/**
 * Write a description of class prime_number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class gcd
{
    static int gcd(int x,int y){
        int m=x,n=y;
    for(int i=1;i<=m;i++){
    if(m>n){
    m=m-n;
    }
    else{
    n=n-m;
    }
    if(m==n)
    break;
    }
    return m;
}
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=gcd(x,y);
     System.out.println("GCD is: "+c); 
    }
}
