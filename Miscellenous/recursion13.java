public class recursion13 {
    static boolean sort(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr={2,8,75,335};
        System.out.println(sort(arr,0));
    }
}
