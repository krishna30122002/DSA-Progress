public class copying2{
    public static void main(String args[]){
        int arr1[]={5,9,7,10,56};
        int arr2[]=new int[10];
        int a=0;
        for(int i =arr1.length-1;i>=0;i--){
                arr2[a]=arr1[i];
                ++a;
            }
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}