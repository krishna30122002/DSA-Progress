public class recursion9 {
    static int sum=0;
    static int rev(int n) {
        int z;
        if (n == 0) {
            return 1;
        } else {
            z = n % 10;
            sum = sum*10 + z;
            rev(n/10);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(rev(1003));
    }
}
