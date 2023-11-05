public class a4_binary_search {
    public int search(int a[], int val, int start, int end) {
        if (a.length == 0 || start > end){
            return -1;
    }
        int m=(start+end)/2;
        if(val==a[m]){
            return m;
        }
        if(val<a[m]){
            return search(a,val,start,m-1);
        }
        else{
            return search(a,val,m+1,end);
        }
    }
        public static void main(String[] args) {
            int arr[] = {4, 96, 122, 885, 1000};
            a4_binary_search obj = new a4_binary_search();
            int c = obj.search(arr, 1000, 0, arr.length - 1);
            if (c == -1) {
                System.out.println("Value does not exist");
            }
            else {
                System.out.println(c);
            }
        }
}
