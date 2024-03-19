package sort;

import java.util.Scanner;
import java.util.stream.IntStream;
//快速排序
public class quick_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        // 递归终止条件，如果左边界大于等于右边界则认为递归结束，换言之，如果当前数组就一个数，意味着递归完成
        if (left >= right) {
            return ;
        }

       int kk=(left + right)/2;
        // 设定一个分界值，这里是（left + right）/ 2
        int p = arr[(left + right)/2];
        //int p=arr[(left + right)>>1]; 另一种写法，右移一位也可以当作除以2
        // 左右提前预留一个位置
        int i = left - 1;
        int j = right + 1;
        while (i < j) {

            // 当数值小于分界值时持续遍历，直到找到第一个大于等于分界值的索引
            // 如果是逆序则调整两个while循环
            while (arr[++i] < p); // 等效于do while
            while (arr[--j] > p) ;
            // 交换左右两侧不符合预期的数值
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        // 由于分界值取的是left + right >> 1，因此递归取的是left，j j + 1，right

        quickSort(arr, left, j);
        quickSort(arr, j + 1, right);
    }
}
