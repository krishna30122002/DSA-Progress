public class recursion12 {
    static int count = 0;

    static int steps(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return (count+=1);
        } else {
            if (n % 2 == 0) {
                count += 1;
                steps(n / 2);
            } else {
                count += 1;
                steps(n - 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(steps(14));
    }

}
