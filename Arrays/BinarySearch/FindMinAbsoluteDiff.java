package BinarySearch;

public class FindMinAbsoluteDiff {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 8, 12, 13, 15, 19, 23 };
        int target = 50;
        System.out.println(findAbsDiff(arr, target));
    }

    public static int findAbsDiff(int[] arr, int target) {
        int mid = (arr.length - 1) / 2;
        if (arr[mid] == target) {
            return 0;
        }
        int floor = findFloor(arr, target, 0, mid);
        int ceil = findCeil(arr, target, mid + 1, arr.length - 1);

        int absFloor = Math.abs(target - floor);
        int absCeil = Math.abs(target - ceil);
        if (floor == -1) {
            return absCeil;
        }
        if (ceil == -1) {
            return absFloor;
        }
        return Math.min(absFloor, absCeil);

    }

    public static int findFloor(int[] arr, int target, int st, int end) {
        int floor = -1;
        int s = st;
        int e = end;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                floor = arr[m];
                e = m - 1;

            } else if (arr[m] > target) {
                e = m - 1;
                floor = arr[m];

            } else {
                s = m + 1;
            }
        }
        return floor;
    }

    public static int findCeil(int[] arr, int target, int st, int end) {
        int ceil = -1;
        int s = st;
        int e = end;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                ceil = arr[m];
                s = m + 1;

            } else if (arr[m] > target) {

                e = m - 1;

            } else {
                ceil = arr[m];

                s = m + 1;
            }
        }
        return ceil;
    }
}

/*
 * Key Misses
 * Intialized ceil and floor with arr[st] which is wrong should -1 as it may not
 * be present.
 * Also , we need to handle case in MATH.MIN
 */
