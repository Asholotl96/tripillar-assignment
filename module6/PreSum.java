import java.util.Scanner;

public class PreSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pre[i] = (i == 0) ? arr[i] : pre[i - 1] + arr[i];
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(l == 0 ? pre[r] : pre[r] - pre[l - 1]);
    }
}