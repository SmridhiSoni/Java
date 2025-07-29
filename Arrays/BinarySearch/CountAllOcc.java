package BinarySearch;

public class CountAllOcc {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 4, 4, 4, 4, 16, 18 };
        /*
         * Intution: find first and last occurence and then count no of elements
         */

        int first = BinarySearch.FirstAndLastOcc.BinarySearchFisrtLastOcc(arr, 7, true);
        int last = BinarySearch.FirstAndLastOcc.BinarySearchFisrtLastOcc(arr, 7, false);

        /*
         * Either loop through this idx or use formula (inclusive)
         */
        int ans = 0;
        if (first == -1) {
            ans = -1;
        } else {
            ans = last - first + 1;
        }
        System.out.println(ans);

    }
}
