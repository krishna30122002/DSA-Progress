
/**
 * Write a description of class max_num here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class max_num
{
    static int max(int x, int y){ //if not calling by static then use objects
        if(x>y)
        return x;
        else
        return y;
    }
   public static void main(String args[]){
       int a=15,b=7,c;
       c=max(a,b);
       System.out.println(c);
}
}