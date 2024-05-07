package sort;

public class Binary {
    public static void main(String[] args) {
        int n = 9;
        toBinary(n);
        System.out.println("--------------------------");
        System.out.println(last_one(n));
    }

    public static void toBinary(int n) {
        for (int i = 5; i >= 0; i--) {
            //看一个数二进制各个位置都是几
            System.out.println(n >> i & 1);
        }
    }

    public static int last_one(int n) {
        //求一个数中二进制里面最后一个1的位置
        //-n相当于(~n+1)
        return n & -n;
    }
}
