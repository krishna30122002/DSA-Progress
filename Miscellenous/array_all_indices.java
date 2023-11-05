public class array_all_indices{
    public static int[] solve(int[] arr,int n, int target, int idx,int fsf){
        if(idx==n){
            return new int[fsf];
        }
        int[] num;
        if (arr[idx] == target) {
            num = solve(arr, n, target, idx + 1, fsf + 1);
            num[fsf]=idx;
        }else{
            num = solve(arr, n, target, idx + 1, fsf);
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,9,5,8,9,3,4};
        int n = 9;
        int target = 9;
        int[] res = solve(arr,n,target,0,0);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}
