public class a2_delete_element {
    static int count = 5;
    static int i;

    public void deleteStart(int arr[], int val) {
        for (i = 0; i < count; i++) {
            if (arr[i] == val)
                break;
        }
        if (i == count) {
            System.out.println("Value does not exist");
            return;
        }
        for (int j = i; j < count - 1; j++) {
            arr[j] = arr[j + 1];
        }
        count--;
    }

    public void deletePos(int []arr, int position){
        i=0;
        for(int i=0;i<count;i++){
            if(i==position){
                break;
            }
            else
            continue;
        }
        for (int j = i; j < count - 1; j++) {
            arr[j] = arr[j + 1];
        }
        count--;
    }

    public void display(int arr[]) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[]=new int[count];
        int arr[] = { 2, 5, 7, 11, 15};
        a2_delete_element obj = new a2_delete_element();
        // obj.deleteStart(arr, 2);
        // obj.display(arr);
        // System.out.println();
        obj.deletePos(arr, 2);
        obj.display(arr);
        System.out.println();
    }
}