
/**
 * Write a description of class StringObj2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringObj2
{
    public static void main(String args[])
    {
        String str1="JAVA";
        String str2="JAVA";
        System.out.println(str1==str2);
        
        String str3="Java";
        String str4=new String("Java");
        System.out.println(str3==str4);
    }
}
