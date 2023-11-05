public class a6_insertion_sort {
    public void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void sort(int a[]) {
        int i,k,j;
        if (a.length == 0 || a.length == 1) {
            return;
        }
        for (i = 1; i < a.length; i++) {
              k = a[i];
              for( j=i-1;j>=0 && k<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=k;
            }
        }
    

    public static void main(String[] args) {
        a6_insertion_sort obj = new a6_insertion_sort();
        int arr[] = { 2, -1, 12, 5, 1 };
        obj.display(arr);
        obj.sort(arr);
        obj.display(arr);
    }
}
