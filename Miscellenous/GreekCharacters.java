
public class GreekCharacters
{
public static void main(String args[]){
    //char x = 0x0394;
      System.out.println("Greek Characters");
    for(char c = 0x0370; c<=0x03FF;c++)
    {
                                           //***important
    System.out.print(c+" ");             // Explicit Type Conversion form int to char*/
    }
   // System.out.println(x);
   System.out.println();
     System.out.println("Indian Characters");
      for(char c = 0x0900; c<=0x0970;c++)
    {
                                           //***important
    System.out.print(c+" ");             // Explicit Type Conversion form int to char*/
    }
}
}
