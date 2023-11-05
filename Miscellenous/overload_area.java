
/**
 * Write a description of class overload_area here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class overload_area
{
    static int area(int x,int y){
    int area =x*y;
return area;
}
static double area(int r){
    double area=Math.PI*r*r;
    return area;
}
static int area(int x,int y,int z){
    int area=x*y*z;
    return area;
}
   public static void main(String args[]){
       int a=area(4,5);
       double b=area(5);
       int c=area(3,4,5);
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
   }
}
