public class array_1st_occurence {
        public static int solve(int[] arr,int n, int target, int idx){
            if(idx==n){
                return -1;
            }else{
                if(arr[idx]==target){
                    return idx;
                }
                return solve(arr,n,target,idx+1);
            }
        }
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,8,9,3,4};
            int n = 9;
            int target = 9;
            int res = solve(arr,n,target,0);
            System.out.println(res);
        }
    }

