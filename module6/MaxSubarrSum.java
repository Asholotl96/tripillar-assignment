import java.util.Scanner;

public class MaxSubarrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            cur += x;
            if (cur > max) max = cur;
            if (cur < 0) cur = 0;
        }
        System.out.println(max);
    }
}