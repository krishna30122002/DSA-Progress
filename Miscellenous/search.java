
/**
 * Write a description of class search here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class search
{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element you want to search in an array");
        int n= sc.nextInt();
        int arr[]={4,9,3,8,9,5,1};
        for(int i =0;i<arr.length;i++){
            if(arr[i]==n){
            System.out.println(arr[i]+" found at index "+i);
            System.exit(0);
        }
    }
    System.out.println("Not Found");
    }
}
