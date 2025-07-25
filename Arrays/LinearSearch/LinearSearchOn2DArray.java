package LinearSearch;

public class LinearSearchOn2DArray {
    public static void main(String[] args) {
        int[][] arr = { {
                2, 2, 34, 2
        }, {
                5, 6, 3, 5
        },
                {
                        5, 6, 3, 4
                } };

        LinearSearch(arr, 5, true);
        LinearSearchMultipleFind2D(arr, 5);
        LinearSearchMultipleFind2DStoreIdx(arr, 5);
        MaxSum1DArrayin2dFindIdx(arr);

    }

    public static void MaxSum1DArrayin2d(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        // if we need to find the idx for array ;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        System.out.println(maxSum);
    }

    public static void MaxSum1DArrayin2dFindIdx(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        // if we need to find the idx for array ;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                idx = i;
            }

        }
        for (int i = 0; i <= idx; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    public static void LinearSearchMultipleFind2DStoreIdx(int[][] arr, int target) {
        // single array of size arr.length* arr[0].length
        int size = arr.length * arr[0].length;
        int[][] ans = new int[size][2];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == target) {
                    ans[counter][0] = i;
                    ans[counter][1] = j;
                    counter++;
                }
            }
        }
        // print the ans array
        for (int i = 0; i < counter; i++) { // Only print up to counter
            System.out.println("[" + ans[i][0] + "][" + ans[i][1] + "]");
        }

    }

    public static void LinearSearchMultipleFind2D(int[][] arr, int target) {
        int[][] ans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == target) {
                    ans[i][j] = target;
                }
            }
        }
        // print the ans array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void LinearSearch(int[][] arr, int target, boolean findLast) {
        int outeridx = -1;
        int inneridx = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    outeridx = i;
                    inneridx = j;
                    if (!findLast) {
                        break;
                    }
                }
            }
            // if (outeridx != -1) {
            // break;
            // }
        }
        System.out.println(outeridx + " " + inneridx);
    }
}
