public class checkRotate {
    public static int solve(String s, String t, int n, int m){
        if(n!=m && n<3){
            return 0;
        }
        boolean res1 = true;
        boolean res2 = true;
        for (int i = 0; i < n; i++) {
            if((s.charAt((i+2)%n)!=t.charAt(i)) && res1!=false){
                res1 = false;
            }
            if((s.charAt((n+i-2)%n)!=t.charAt(i)) && res2!=false){
                res2 = false;
            }
        }
        if(res1!= true && res2!= true){
            return 0;
        }
        return 1;
    }
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        int n = str1.length();
        int m = str2.length();
        int x = solve(str1, str2, n, m);
        if(x==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isRotated("daxjheq","eqdaxjh"));
    }
}
