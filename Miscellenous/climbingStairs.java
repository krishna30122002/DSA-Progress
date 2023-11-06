import java.util.Arrays;

public class climbingStairs {
    public static int solve(int idx, int[] dp){
        if(idx==0 || idx==1){
            return 1;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        dp[idx]=solve(idx-1,dp)+solve(idx-2,dp);
        return dp[idx];
    }
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int x = solve(n,dp);
        System.out.println(x);
    }
}
