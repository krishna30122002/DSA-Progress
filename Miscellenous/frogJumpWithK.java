import java.util.Arrays;

public class frogJumpWithK {
    public static void main(String[] args) {
        int k = 1;
        int n = 3;
        int[] heights = {2,5,2};
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;

        for(int i = 1; i<n; i++){
            int minSteps = Integer.MAX_VALUE;
            for(int j = 1; j<=k; j++){
                if(i-j>=0){
                    int jump = dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i]=minSteps;
        }
        System.out.println(dp[n-1]);
    }
}
