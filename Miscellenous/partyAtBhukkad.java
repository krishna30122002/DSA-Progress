import java.util.Scanner;
public class partyAtBhukkad {
    public static int solve(int x, int y, int a, int b, int z){
        int res1=x*a;
        int res2=y*b;
        int result = (int)(res1/z)+(int)(res2/z);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = sc.nextInt();
        int result = solve(x,y,a,b,z);
        System.out.print(result);
    }
}
