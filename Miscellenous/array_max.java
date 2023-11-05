public class array_max {
    static int result = 0;
    public static int solve(int[] arr,int n, int idx){

        if(idx==n-1){
            return arr[idx];
        }
         int maxOfFaith=solve(arr,n,idx+1);
            if(arr[idx]>maxOfFaith) {
                return arr[idx];
            }else{
                return maxOfFaith;
        }
    }
    public static void main(String[] args) {
        int[] arr={22,33,4,29,7};
        int n = 5;
        int res = solve(arr,n,0);
        System.out.println(res);
    }
}
