package BinarySearch;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 4, 8, 12, 16 };
        int target = 4;
        int idx = BinarySearchFisrtLastOcc(arr, target, true);
        int idx2 = BinarySearchFisrtLastOcc(arr, target, false);
        System.out.println(idx + " " + idx2);
    }

    public static int BinarySearchFisrtLastOcc(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
/*
 * Key Misses
 * How to write recursive binary search
 * How can i pass reduced new array to this function
 * Identify base condition for recursive cond
 * 
 * What I eventually thought was re-using binary search and not returnng once i
 * find element
 * and continuing search in smaller search space
 * 
 * Key Misses
 * 
 * When arr[mid] == target in and increasing array I forgot to do end = mid-1 .
 * Hence got stuck in loop.
 */
