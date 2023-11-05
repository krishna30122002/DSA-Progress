
/**
 * Write a description of class max_num_arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class max_num_arr
{
    static int max(int a[]){
        int maximum=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>maximum){
                maximum=a[i];
            }
        }
        return maximum;
    }
    public static void main(String args[]){
    int arr[]={2,85,9,63,4};
    int m=max(arr);
    System.out.println(m);
    }
}
