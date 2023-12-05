package Q1;
public class Q1 {

    public int removeDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            arr[count] = arr[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[] arr1 = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(q1.removeDuplicates(arr1));
        System.out.println(q1.removeDuplicates(arr2));
    }
}