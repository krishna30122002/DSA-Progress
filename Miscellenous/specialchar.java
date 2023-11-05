
/**
 * Write a description of class specialchar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class specialchar
{
    public static void main(String args[]){
        String str1="a!B@c#1$2%3";
        System.out.println(str1.replaceAll("\\W+",""));
    }
}
