
/**
 * Write a description of class second_largest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class second_largest
{
    public static void main(String args[]){ 
        int arr[]={4,3,8,5,1,9,15,5};
        int max1=arr[0];
        int max2=arr[0];
        int i,j;
        for(i =0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
        }
        else if(arr[i]>max2){
            max2= arr[i];
        }
        }
        System.out.println("Maximum Element: "+max1);
        System.out.println("Second Maximum Element: "+max2);
    }
}