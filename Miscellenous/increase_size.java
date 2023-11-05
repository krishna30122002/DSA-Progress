
/**
 * Write a description of class increase_size here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class increase_size
{
    public static void main(String args[]){
    int a[]={5,7,9,10,56};
    int b[]=new int[2*a.length];
    System.out.println("Previous Length: "+a.length);
    for(int i =0;i<a.length;i++){
                b[i]=a[i];
            }
            a=b;
            b=null;
            System.out.println("New Length: "+a.length);
        }
}
