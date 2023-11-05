
/**
 * Write a description of class website here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class website
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1;
        System.out.println("Enter a Website");
        str1=sc.nextLine();
        String str2=str1.substring(0,str1.indexOf(":"));
            if(str2.equals("http")){
                System.out.println("Hypertext Transfer Protocol");
            }
            else if(str2.equals("ftp")){
                System.out.println("File Transfer Protocol");
            }
            else{
                System.out.println("Invalid Website");
            }
            
            // important part
            
            String ext=str1.substring(str1.lastIndexOf(".")+1);
            if(ext.equals("com"))
            System.out.println("Commercial Website");
            else if(ext.equals("org"))
            System.out.println("An Organization");
            else if(ext.equals("gov"))
            System.out.println("Government Website");
            else if(ext.equals("net"))
            System.out.println("Networking Website");
            else
            System.out.println("Invalid Website");
        }
    }

