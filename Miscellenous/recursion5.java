public class recursion5 {
    static void printnumber(int n) {
        if(n==0){
            return;
        }
        
        //for print reverse
        System.out.println(n);
        
        printnumber(n-1);
        
        // for print forward
        System.out.println(n);
    }

    public static void main(String[] args) {
        printnumber(5);
    }

}