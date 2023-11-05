public class a3_linear_search{
    public int search(int a[], int val){
        if(a.length==0){
            return -1;
        }
        else{
        for(int i=0;i<a.length;i++){
            if(a[i]==val){
                return i;
            }
        }
    }
    return -1;
}
    public static void main(String[] args) {
        a3_linear_search obj = new a3_linear_search();
        int arr[]={4,31,65,14,89};
        int c=obj.search(arr, 14);
        if(c==-1)
        System.out.println("Value Does Not Exist");
        else
        System.out.println(c);
    }
}