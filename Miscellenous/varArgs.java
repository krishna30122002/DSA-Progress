
/**
 * Write a description of class varArgs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class varArgs
{
    static void show(int...x){
 for(int a:x){
     System.out.print(a+"\t");
 }
}
public static void main(String args[]){
    show(10,20,30,40,50,60,70,80,90,100);
}
}
