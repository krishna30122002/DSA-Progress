import java.util.*;

public class recursion10 {
    static int sum = 0;

    static int palin(int n) {
        int z;
        if (n == 0) {
            return 1;
        } else {
            z = n % 10;
            sum = sum * 10 + z;
            palin(n / 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = palin(n);
        if(n==z)
        System.out.println("PALINDROME");
        else
        System.out.println("NOT PALINDROME");
        sc.close();
    }
}
