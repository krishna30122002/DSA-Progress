public class armstrong
{
    public static void main(String args[]){
        int n=152,sum=0;
        int m=n;
        while(n>0){
        int r=n%10;
        sum=sum+(int)Math.pow(r,3);
        n=n/10;
}
if(sum==m)
System.out.println("Armstrong Number");
else
System.out.println("Not a Armstrong Number");
}
}