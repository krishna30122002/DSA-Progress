
/**
 * Write a description of class fact_by_recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fact_by_recursion
{
    static int factorial(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
            factorial(n-1);
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
}
}
