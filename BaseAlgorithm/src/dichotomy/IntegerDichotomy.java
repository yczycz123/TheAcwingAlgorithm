package dichotomy;

public class IntegerDichotomy {
    public static void main(String[] args) {

    }


    // 检查x是否满足某种性质
    private static boolean check(int x) {
        /* ... */
        return true;
    }

    // 区间[left, right]被划分成[left, mid]和[mid + 1, right]时使用：
// 或者称之为左二分查询，查找左侧第一个满足条件的数
    private static int leftBinarySearch(int[] arr, int left, int right) {
        while (left < right) {
            int mid = arr[left + right >> 1];
            if (check(mid)) {
                right = mid;    // check()判断mid是否满足性质
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // 区间[left, right]被划分成[left, mid - 1]和[mid, right]时使用：
// 或者称之为右二分查询，查找右侧最后一个满足条件的数
    private static int rightBinarySearch(int[] arr, int left, int right) {
        while (left < right) {
            int mid = arr[left + right + 1 >> 1];
            if (check(mid)) {
                left = mid;    // check()判断mid是否满足性质
            } else {
                right = mid - 1;  // 有加必有减
            }
        }
        return left;
    }

        /*
        举例子：例如1 2 2 3 3 4，找出3的起始索引和终止索引，
        那么起始索引就是左侧第一个满足条件的数，终止索引就是右侧最后一个满足条件的数
         */
}
