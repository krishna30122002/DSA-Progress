/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here'
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int cnt=1;
		    int n=sc.nextInt();
		    String str=sc.next();
	//	   ArrayList<Character> list=new ArrayList<>();
		//     for(int i=0;i<n;i++){
		//   list.add(str.charAt(i));
		//     }
		    // if(n==0 || n==1){
		    //     System.out.println("Ramos");
		    //     break;
		  //  }
		    // int m=list.size();
		    // for(int i=0;i<m-1;i++){
		    //       if(list.size()==1){
		    //           if(cnt%2==0){
		    //               System.out.println("Zlatan");
            //               break;
		    //           }else{
		    //               System.out.println("Ramos");
            //               break;
		    //           }
		    //       }else{
		    //           if(list.get(i)!=list.get(i+1)){
		    //               list.remove(i);
		    //               list.remove(i+1);
		    //               cnt++;
            //               continue;
		    //           }else{
		    //               cnt++;
		    //               continue;
		    //           }
		        //  } 
		     //   }
            
             for(int i=0;i<n-1;i++)
             {
             if(str.charAt(i)!=str.charAt(i+1))
             {
                cnt++;
             }
             }
             float cnt1=cnt;
             if(cnt/2==cnt1/2)
             {
                System.out.println("zlaten");
             }
             else System.out.println("Ramos");
		}
	}
}
