public class maximum_element
{
    public static void main(String args[]){
        int max=0;      
        int arr[]={4,9,3,8,9,5,1};
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Maximum Element: "+max);
    }
}