import java.util.*;

public class test_program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int cnt = 0;
            long n = sc.nextLong();
            String str = Long.toString(n);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '4') {
                    cnt += 1;
                } else {
                    continue;
                }
            }
            System.out.println(cnt);
            sc.close();
        }
    }
}