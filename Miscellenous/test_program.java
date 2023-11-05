/**
 * test_program
 */
import java.util.*;
public class test_program {

    public static void main(String[] args) {
        ArrayList <Integer> obj=new ArrayList<Integer>();
        obj.add(5);
        obj.add(1005);
        obj.add(1, 56);
        System.out.println(obj);
        System.out.println(obj.get(1));
        System.out.println(obj.set(0, 99));
        System.out.println(obj.get(0));
        Collections.sort(obj);
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
    }
}