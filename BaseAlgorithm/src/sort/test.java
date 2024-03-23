package sort;

public class test {
    public static void main(String[] args) {

        //++i与i++区别
        int[] arr={1,1};
        int k=0;
        arr[k++]=3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int[] brr = {1, 1};
        int m = 0;
        brr[++m] = 3;
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }



        //  >>1可以做到除以2并向下取整的作用,对于奇数，右移一位，其最末端的二进制1直接没了，相当于向下取整了
        System.out.println();
        int aa=5;
        int bb=1+4>>1;
        System.out.println(Integer.toBinaryString(aa));
        System.out.println(Integer.toBinaryString(bb));

    }
}
