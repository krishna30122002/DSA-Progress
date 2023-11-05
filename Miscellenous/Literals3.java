class Literals3{
    public static void main(String args[]){
        long l=999999999999999l;
        long l2=999_999_999_999_999l; //underscores are ignored by the compiler in t he output
        int i =125;
        System.out.println(l);
        
        float f=12.56f;
        double d= 12.56;
        System.out.println(f);
        System.out.println(d);
    }
}