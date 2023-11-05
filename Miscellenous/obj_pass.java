
/**
 * Write a description of class obj_pass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class obj_pass
{
    static void change(int A[],int n,int val){
        A[n]=val;
    }
    static void change2(int x,int val){
        x=val;
    }
    public static void main(String args[]){
        int A[]={2,4,5,9,8};
        change(A,3,50);
        System.out.println(A[3]);
        int x=100;
        change2(x,200);
        System.out.println(x);
    }
}
