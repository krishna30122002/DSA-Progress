public class array_last_occurence {
    public static int solve(int[] arr,int n, int target, int idx){
        if(idx==-1){
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return solve(arr,n,target,idx-1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8,9,3,4};
        int n = 9;
        int target = 3;
        int res = solve(arr,n,target,n-1);
        System.out.println(res);
    }
}

