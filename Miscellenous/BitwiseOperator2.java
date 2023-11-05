public class BitwiseOperator2
{
    public static void main(String args[])
    {
        /*int x=0b1010;
        int y = 0b0110;
        int z = x^y;
        System.out.println(z);*/
        int x=0b1;
        int y;
        y=x<<1;  //left shift
        System.out.println(y);
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
        
        int z=96;
        System.out.println(String.format("%7s",Integer.toBinaryString(z)));
        
    }
}
