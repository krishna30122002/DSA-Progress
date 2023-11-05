
/**
 * Write a description of class overload_details here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class overload_details
{
    static boolean details(String s){
        return s.matches("[a-zA-Z\\s]+");
    }
    static boolean details(int a){
        return a>=3 && a<16;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
        int age=sc.nextInt();
        System.out.println(details(name));
        System.out.println(details(age));
    }
}
