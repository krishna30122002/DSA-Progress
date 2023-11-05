public class copying{
    public static void main(String args[]){
        int arr1[]={5,9,7,10,56};
        int arr2[]=new int[10];
        for(int i =0;i<arr1.length;i++){
                arr2[i]=arr1[i];
            }
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}