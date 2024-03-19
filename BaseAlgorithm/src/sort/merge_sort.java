package sort;
//归并排序
public class merge_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void mergeSort(int[] arr, int left, int right) {
        // 递归终止条件，如果左边界大于等于右边界则认为递归结束
        if (left >= right) {
            return;
        }
        // 设定一个分界值，这里是（left + right）/ 2
        int mid = (left + right)/2;
        // 切割
        mergeSort(arr,left, mid);
        mergeSort(arr,mid + 1, right);


        // 归并，长度刚好是 left 到 right
        int[] temp = new int[right - left + 1];  //temp是一个临时储存的数组
        int i = left;
        int j = mid + 1;

        int k = 0;// 用来归并的索引
        while (i <= mid && j <= right) {
            // 如果是逆序则调整if条件
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //剩下的直接补到后面去
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
    }

}
