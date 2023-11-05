
/**
 * Write a description of class trim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class trim
{
    public static void main(String args[]){
        String str1 = "   RAJ      VERMA   ";
        System.out.println(str1.replaceAll("\\s+"," ").trim());
    }
}
