
/**
 * Write a description of class website2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class website2
{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the type of website");
        int i =1;
       
        String web=sc.nextLine();
        String ext=web.substring(web.lastIndexOf(".")+1);
        switch(ext){
            case "com": System.out.println("commercial Website");
            break;
            case "gov": System.out.println("Government Website");
            break;
            case "net": System.out.println("Networking Website");
            break;
            default: System.out.println("Invalid Type");
            break;
        }
   }
}
