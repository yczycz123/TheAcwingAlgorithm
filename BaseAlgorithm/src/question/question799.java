package question;

import java.util.Scanner;

public class question799 {
    public static void main(String[] args) {
        int N = 100010;
        int[] s = new int[N];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            s[arr[i]]++;
            while (j <= i && s[arr[i]] > 1) {
                s[arr[j]]--;
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
    }
}
