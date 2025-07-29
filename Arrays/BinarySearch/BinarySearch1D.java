package BinarySearch;

public class BinarySearch1D {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        int ans = BinarySearchIncArray(arr, 3);
        int ans1 = BinarySearchDecArray(arr2, 1);
        int ans2 = BinarySearchOrderAgnostic(arr2, 4);
        System.out.println(ans2);
        ;
    }

    public static int BinarySearchIncArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // to avoid integer overflow problem

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int BinarySearchDecArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int BinarySearchOrderAgnostic(int[] arr, int target) {
        // Find order and then call respective function
        if (arr[0] == arr[arr.length - 1]) {
            return arr[0] == target ? 0 : -1;
        } else if (arr[0] < arr[arr.length - 1]) {
            return BinarySearchIncArray(arr, target);
        } else {
            return BinarySearchDecArray(arr, target);
        }
    }

}

/*
 * Key Mistakes
 * Mid calculation should be inside loop to recalculate mid
 * Add extra cond for equal to case
 * Remember conditions for both inc and dec array
 */
