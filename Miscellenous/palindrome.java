
/**
 * Write a description of class palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome
{
    public static void main(String args[]){
   int n=12521,r,sum=0;
   int m=n;
        while(n>0){
        r=n%10;
        sum=sum*10+r;
        n=n/10;
}
System.out.println("n= "+m);

System.out.println("rev= "+sum);
if(sum==m)
System.out.println("Palindrome Number");
else
System.out.println("Palindrome Number");
}
}
