 
/**
 * Write a description of class discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discount
{
    static int max(int ...A){
        int m;
        if(A.length==0)
        return Integer.MIN_VALUE;
        else{
        m=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>m)
            m=A[i];
        }
    }
    return m;
    }
    static int sum(int ...a){
        int sum=0;
        for(int x:a){
            sum=sum+x;
        }
        return sum;
    }
    static double discount(double ...d){
        double dis=0.0;
        for(int i=0;i<d.length;i++){
            dis=dis+d[i];
        }
        
        if(dis>499.0 && dis<1000.0){
        dis=(dis*10)/100;
    }
        else if(dis>4999.0 && dis<7500.0){
        dis=(dis*20)/100;
    }
        else if(dis>9999.0){
        dis=(dis*30)/100;
    }
        else{
        dis=0.0;
   }
    return dis;
}
    public static void main(String args[]){
        /*int arr[]={5,8,15,98,5,47};
        int max=max(arr);
        System.out.println(max);
        */
       System.out.println(max());
       System.out.println(max(58,98,7));
       System.out.println(max(122,998,256,1008));
       System.out.println(sum(45,98,55,347,2655,145));
       System.out.println(discount(46.55,4598.2,55.4,347.99,2655.0,145.1));
    }
}
