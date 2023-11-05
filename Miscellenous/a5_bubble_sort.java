public class a5_bubble_sort {
    public void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void sort(int a[]) {
        if (a.length == 0 || a.length == 1) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        a5_bubble_sort obj = new a5_bubble_sort();
        int arr[] = { 2, -1, 12, 5, 1 };
        obj.display(arr);
        obj.sort(arr);
        obj.display(arr);
    }
}
