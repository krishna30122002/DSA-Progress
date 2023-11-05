 
/**
 * Write a description of class bubble_sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bubble_sort
{
    static void printArray(int a[]){
           for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");   
        }
    }
    public static void main(){
        int arr1[]={7,8,3,1,2};
        //bubble sort
        for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]>arr1[j+1]){
                    //swap
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        printArray(arr1);
    }
}
