package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 56, 5, 2, 56 };
        // int ans = LinearSearch(arr, 3);
        // int ans1 = LinearSearch(arr, 56, true);
        // allOccurence(arr, 56);
        findMin(arr);
        // System.out.println(ans);
        // System.out.println(ans1);

    }

    public static int LinearSearch(int[] arr, int val) {
        // Find first occ
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearch(int[] arr, int val, boolean findLast) {
        // Find last occ
        // can use same logic in Find first and reverse the loop as well
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                ans = i;
                if (!findLast) {
                    break;
                }
            }
        }
        return ans;
    }

    // You can keep a counter to know how many ele are there in ans array instead of
    // loop
    public static void allOccurence(int[] arr, int val) {
        int[] ans = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                ans[counter] = i;
                counter++;
            }
        }
        // To avoid printing 0 you can make loop till the counter
        for (int i = 0; i < counter; i++) {
            System.out.println(ans[i]);
        }
    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
