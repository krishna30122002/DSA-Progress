/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class practice {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        // your code goes hereint 
        
        String str = sc.nextLine();
        int c = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '1') {
                if ((str.charAt(i + 1) == '0') && (str.charAt(i + 2) == '1')) {
                
                    System.out.println("GOOD");
                    c++;
                    break;
                }
            } else if (str.charAt(i) == '0') {
                if ((str.charAt(i + 1) == '1') && (str.charAt(i + 2) == '0')) {
                    System.out.println("GOOD");
                    c++;
                    break;
                }
            }
        }
        if (c == 0) {
            System.out.println("BAD");
        }
sc.close();
    }
    }
