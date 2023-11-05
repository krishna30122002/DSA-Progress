import java.util.ArrayList;

public class recursion14 {

    static ArrayList<Integer> findall2(int[] arr, int index, int target) {

    ArrayList<Integer> list2 = new  ArrayList<Integer>();
    if (arr[index] == target) {
        list2.add(index);
    }
    if (index == arr.length -1 ) {
        return list2;
    }
    ArrayList<Integer> ansfindall = findall2(arr, 0, 18);
    list2.addAll(ansfindall);
    return list2;
}

    static ArrayList<Integer> list = new ArrayList<>();

    static void find(int[] arr, int index, int target) {
        if (arr[index] == target) {
            list.add(index);
        }
        if (index == arr.length - 1) {
            return;
        }
        find(arr, index + 1, target);
    }

    static int linear(int[] arr, int index, int target) {
        if (arr[index] == target) {
            return index;
        }
        if (index == arr.length - 1) {
            return -1;
        }
        return linear(arr, index + 1, target);
    }

    static ArrayList<Integer> findall(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (arr[index] == target) {
            list.add(index);
        }
        if (index == arr.length - 1) {
            return list;
        }
        return findall(arr, index + 1, target, list);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 18, 9 };
        System.out.println(linear(arr, 0, 18));
        find(arr, 0, 18);
        System.out.println(list);

        // 2nd Method
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findall(arr, 0, 18, list);
        System.out.println(ans);

        // 3rd method
        //ArrayList<Integer> ansfindall = findall(arr, 0, 18);
        System.out.println(findall2(arr, 0, 18));
    }
}
