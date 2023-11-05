
/**
 * Write a description of class rotating_array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rotating_array2
{
    public static void main(String args[]){ 
        
        int arr[]=new int[10];
        arr[0]=5;
        arr[1]=9;
        arr[2]=6;
        arr[3]=8;
        arr[4]=1;
        arr[5]=3;
        int temp=arr[5];
        for(int i =6;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int x:arr){
        System.out.print(x+"\t");
    }
    System.out.println();
    }
}
