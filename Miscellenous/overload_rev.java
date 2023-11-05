
/**
 * Write a description of class overload_rev here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class overload_rev
{
    static void reverse(int a[]){
        for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+"");
    }
    System.out.println();
    }
    static void reverse(int x){
        int rev=0;
        while(x>0){
        rev=x%10;
        x=x/10;
    System.out.print(rev);
}
System.out.println();
}
public static void main(String args[]){
    int[] arr={2,8,9,7,5};
    int n=588;
    reverse(arr);
    reverse(n);
}
}