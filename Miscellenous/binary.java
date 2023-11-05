
/**
 * Write a description of class binary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binary
{
    public static void main(String args[]){
        int b= 11001011;
        String str1=String.valueOf(b);
        System.out.println(str1.matches("[01]*"));
    }
}
