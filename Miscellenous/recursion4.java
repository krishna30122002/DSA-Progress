public class recursion4{
    static void printnumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        
        //--n or n-1
        printnumber(--n);  
    }
    public static void main(String[] args) {
        printnumber(5);
    }
}