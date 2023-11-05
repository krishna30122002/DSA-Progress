import java.util.Scanner;
public class bunkClass {
    public static long solve(long n, long b, long l, long[] arr){
        long cnt = 0;
        long i = 0;
        double start = (double)b;
        while(b!=0){
            double res1 = arr[i]/l;
            b-=res1;
            double res2 = arr
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long l = sc.nextLong();
        long[] arr = new long[n];
        for(long i = 0; i<n; i++){
            arr[i]=sc.nextLong();
        }
        long result = solve(n,b,l,arr);
        System.out.println(result);
    }
}