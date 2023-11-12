import java.util.*;
public class isomorphicStrings {
    public static void main(String[] args) {
        String s1 = "abb";
        String s2 = "xyz";

        int n = s1.length();
        int m = s2.length();

        Map<Character,Character> mp1 = new HashMap<>();
        Map<Character,Boolean> mp2 = new HashMap<>();

        int c = 0;

        if(n!=m){
            System.out.println(false);
        }

        for(int i = 0; i<n; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

                if(mp1.containsKey(ch1)==true){
                    if(mp1.get(ch1)!=ch2) {
                        c++;
                    }
                }else {

                    if(mp2.containsKey(ch2)==true){
                        c++;
                    }else{
                        mp1.put(ch1,ch2);
                        mp2.put(ch2,true);
                    }

                }

        }
        if(c==1){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
