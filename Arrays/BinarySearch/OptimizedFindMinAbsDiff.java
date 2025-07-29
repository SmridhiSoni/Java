package BinarySearch;

public class OptimizedFindMinAbsDiff {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 12, 13, 15, 19, 23 };
        int target = -1;
        ans(arr, target);
    }

    public static void ans(int[] arr, int target) {
        int[] ans = minDiff(arr, target);
        System.out.println(ans[0] + " " + ans[1] + " " + "Ans");
        int finalAns;
        if (ans[0] == -1) {
            finalAns = Math.abs(target - ans[1]);
            System.out.println(finalAns);
            return;
        }
        if (ans[1] == -1) {
            finalAns = Math.abs(target - ans[0]);
            System.out.println(finalAns);
            return;
        }

        int floorabs = Math.abs(target - ans[0]);
        int ceilabs = Math.abs(target - ans[1]);
        System.out.println(Math.min(floorabs, ceilabs));
        return;
    }

    public static int[] minDiff(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                ans[0] = arr[m];
                ans[1] = arr[m];
                return ans;
            } else if (arr[m] < target) {
                s = m + 1;
                ans[0] = arr[m];
            } else {
                e = m - 1;
                ans[1] = arr[m];
            }
        }
        return ans;
    }
}
