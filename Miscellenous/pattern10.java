public class pattern10
{
   public static void main(String args[])
   {
       for(int i=1;i<=5;i++){
           for(int j=1;j<=5;j++){
               if((i+j)>5)
               System.out.print("* ");
               else if((i+j)<6)
               System.out.print("  ");
           }
           for(int k=2;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
        }
        
        
           for(int l=4;l>0;l--){
               for(int m=0;m<5;m++){
               if((m+l)>=5)
               System.out.print("* ");
               else if((m+l)<5)
               System.out.print("  ");
           }
           for(int n=2;n<=l;n++){
               System.out.print("* ");
           }
           System.out.println();
       }
       
       
   }
}
