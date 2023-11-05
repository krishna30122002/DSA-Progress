public class recursion11 {
    static int count=0;
    static int zeroes(int n){
        int z;
        if(n==0){
            return 1;
        }
        else{
            z=n%10;
            if(z==0){
                count+=1;
                zeroes(n/10);
            }
            else{
                zeroes(n/10);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(zeroes(100065));
    }
}