public class array_reverse {
    public static void solve(int[] arr,int n, int idx){
        if(idx==n){
            return;
        }else{
            solve(arr,n,idx+1);
            System.out.print(arr[idx]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n = 5;
        solve(arr,n,0);
    }
}
