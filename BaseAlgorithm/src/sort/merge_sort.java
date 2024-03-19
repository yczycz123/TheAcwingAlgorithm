package sort;
//归并排序
public class merge_sort {
    public static void main(String[] args) {
        System.out.println();
    }

    private static int[] mergeSort(int[] arr, int left, int right) {
        // 递归终止条件，如果左边界大于等于右边界则认为递归结束
        if (left >= right) {
            return arr;
        }
        // 设定一个分界值，这里是（left + right）/ 2
        int mid = (left + right)/2;
        // 切割
        arr = mergeSort(arr, left, mid);
        arr = mergeSort(arr, mid + 1, right);
        // 归并，长度刚好是 left 到 right
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        // 用来归并的索引
        int k = 0;
        while (i <= mid && j <= right) {
            // 如果是逆序则调整if条件
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // 根据归并后的数组重新赋值排序后的数组
        for (i = left, j = 0; i <= right; i++, j++) {
            arr[i] = temp[j];
        }
        return arr;
    }

}
