
/**
 * Write a description of class inserting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class inserting
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        arr[0]=5;
        arr[1]=9;
        arr[2]=6;
        arr[3]=8;
        arr[4]=1;
        arr[5]=3;
        System.out.println("Enter the index to where you want to store the element");
        int index=sc.nextInt();
        System.out.println("Enter the element");
        int n= sc.nextInt();
        for(int i=6;i>index;i--)
            arr[i]=arr[i-1];
        for(int j=0;j<6;j++){
            System.out.print(arr[j]+",");
        }
    }
}
