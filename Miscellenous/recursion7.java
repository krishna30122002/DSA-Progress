public class recursion7 {
    static int sumofn(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        } else {
            sum = n + sumofn(n - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumofn(100));
    }
}
