
/**
 * Write a description of class email1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class email1
{
    public static void main(String args[])
    {
        String email = "programmer123@gmail.com";
     int m=email.indexOf("@"); 
     int n=email.length();
      for(int i = 0;i<m;i++){    //use substring function
          System.out.print(email.charAt(i));
      }
      System.out.println();
            for(int i = m+1;i<n;i++){
          System.out.print(email.charAt(i));
      }
       System.out.println();
    }
}
