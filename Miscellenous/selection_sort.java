
/**
 * Write a description of class selection_sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class selection_sort
{
    static void printArray(int a[]){
           for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");   
        }
    }
    public static void main(String args[]){
         int arr[]={7,8,3,1,2};
         for(int i=0;i<arr.length-1;i++){
             int smallest=i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[smallest]>arr[j]){
                     smallest=j;
                 }
             }
             int temp=arr[smallest];
             arr[smallest]=arr[i];
             arr[i]=temp;
         }
         printArray(arr);
    }
}
