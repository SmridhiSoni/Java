package BinarySearch;

public class FindRangeOfInfinite {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 5, 7, 9, 25, 56, 88, 94 };
        findFirst(arr, 2);

    }

    public static void findFirst(int[] arr, int t) {
        int[] ans = findRange(arr, t);
        System.out.println(ans[0] + "," + ans[1]);

        if (ans[0] == -1) {
            System.out.println("Element not found!");
        }
        int fans = BinarySearchFisrtLastOcc(arr, t, true, ans[0], ans[1]);
        System.out.println(fans);
    }

    public static int BinarySearchFisrtLastOcc(int[] arr, int target, boolean findFirst, int st, int en) {
        int start = st;
        int end = en;
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

    public static int[] findRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int s = 0;
        int e = 1;
        while (arr[e] < target) {

            s = e;
            e = 2 * e;

        }
        ans[0] = s;
        ans[1] = e;
        return ans;
    }
}

/*
 * Key misses
 * Start = s +1 is subtly wrong as we are not sure that we checked for s=s+1 as
 * we're doubling our array
 * 
 */
