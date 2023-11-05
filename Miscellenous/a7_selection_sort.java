public class a7_selection_sort {
    public void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void sort(int a[]) {
        int i, j;
        int c = 0, n = 0, min = 0;
        for (i = 0; i <= a.length - 1; i++) {
            min = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }

                if (min != 1) {
                    int temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        a7_selection_sort obj = new a7_selection_sort();
        int arr[] = { 5, 14, 2, 3, 1 };
        obj.display(arr);
        obj.sort(arr);
        obj.display(arr);
    }
}
