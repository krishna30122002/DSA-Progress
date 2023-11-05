
/**
 * Write a description of class rotating_array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rotating_array1
{
    public static void main(String args[]){ 
        int arr[]={4,3,8,5,1,9,15,5};
        int temp=arr[0];
        for(int i =1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int x:arr){
        System.out.print(x+"\t");
    }
    System.out.println();
    }
}
