public class recursion3binarysearch {

    static int binary(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m]==target){
            return m;
        }
        if (target < m) {
            return binary(arr, target, s, m - 1);
        }
        return binary(arr, target, m + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 8, 10 };
        int s = 0;
        int e = arr.length-1;
        int target = 8;         
        // Not Working for 5
        int z = binary(arr, target, s, e);
        System.out.println(z);
    }
}