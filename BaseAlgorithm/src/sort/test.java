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
        int[] brr={1,1};
        int m=0;
        brr[++m]=3;
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
