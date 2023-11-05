public class a1_insert_element {
    int count;

    public void insert(int a[], int val) {
        a[count++] = val;
    }

    public void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void insertStart(int a[], int val) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = val;
    }

    public void insertPos(int a[], int val, int index) {
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = val;
    }

    public static void main(String[] args) {
        int arr[] = new int[6];

        a1_insert_element obj = new a1_insert_element();
        // arr[0]=12;
        // arr[1]=34;
        // arr[2]=15;
        // arr[3]=67;
        // arr[4]=48;

        // arr[5]=56;
        for (int i = 0; i < arr.length; i++) {
            obj.insert(arr, i);
        }
        obj.display(arr);
        System.out.println();
        obj.insertStart(arr, 34);
        obj.display(arr);
        System.out.println();
        obj.insertPos(arr, 121, 2);
        obj.display(arr);
    }
}