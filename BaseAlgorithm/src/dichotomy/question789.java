package dichotomy;

import java.util.Scanner;
import java.util.stream.IntStream;

public class question789 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arr = IntStream.range(0, n).map(item -> in.nextInt()).toArray();
        while (q-- > 0) {
            int k = in.nextInt();
            int[] ans = binarySearch(arr, k);
            IntStream.range(0, 2).mapToObj(item -> ans[item] + " ").forEach(System.out::print);
            System.out.println();
        }
    }

        private static int[] binarySearch(int[] arr, int target){
            // 将返回值放到一个长度为2的数组中
            int[] res = new int[2];
            int n = arr.length;
            int left = 0;
            int right = n - 1;
            // 先LBS，找到左边界
            while (left < right) {
                int mid = left + right >> 1;
                if (arr[mid] >= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            // 如果没有找到，则默认-1 -1
            if (arr[left] != target) {
                return new int[]{-1, -1};
            }
            res[0] = left;
            left = 0;
            right = n - 1;
            // 再RBS，找到右边界
            while (left < right) {
                int mid = left + right + 1 >> 1;
                if (arr[mid] <= target) {
                    left = mid;   //当left = mid时，mid = left + right + 1，mid后面一定要加1，不然有可能死循环
                } else {
                    right = mid - 1; // 有加必有减
                }
            }
            res[1] = left;
            return res;
        }
}
