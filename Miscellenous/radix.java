
/**
 * Write a description of class radix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class radix
{
    public static void main(String args[]){
        int b = 10011101;
        String str1=String.valueOf(b);
                String str2="12357";
                        String str3="A25BCD";
                        if(str1.matches("[01]*"))
                        System.out.println("Binary Number");
                        if(str2.matches("[1-7]+"))
                        System.out.println("Octal Number");
                        if(str3.matches("[1-9A-F]+"))
                        System.out.println("Hexadecimal Number");
                        else
                        System.out.println("Not any Type of Number");
                        }
}
