
/**
 * Write a description of class insertion_sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class insertion_sort
{
    static void printArray(int a[]){
           for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");   
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
            }
        printArray(arr);
    }
}
