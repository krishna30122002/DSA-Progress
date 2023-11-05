import java.util.Scanner;
public class gpseries
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Term");
        int a=sc.nextInt();
        System.out.println("Enter Common Ratio");
        int r=sc.nextInt();
        System.out.println("Enter How many Terms you want to print the series");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int sum=a*(int)(Math.pow(r,i));
            System.out.print(sum+"  ");
        }
        System.out.println();
    }
}