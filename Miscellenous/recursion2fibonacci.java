public class recursion2fibonacci {
    static int fibonacci(int n) {

        if (n < 2)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int z = fibonacci(6);
        System.out.println(z);
    }
}
