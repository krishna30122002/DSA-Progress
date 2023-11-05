public class recursion8 {
    static int sumdigits(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        } else {
            sum = (n % 10) + (sumdigits(n / 10));
        }
        return sum;
    }

    static int productdigits(int n) {
        int product = 1;
        if (n == 0) {
            return 1;
        } else {
            product = (n % 10) * (productdigits(n / 10));
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println("Sum=" + sumdigits(12345));
        System.out.println("Product=" + productdigits(12345));
    }

}
