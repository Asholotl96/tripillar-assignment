import java.util.Scanner;

public class Diffarr {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] diff = new int[n + 1];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) diff[i] = arr[i] - arr[i - 1];
        int l = sc.nextInt();
        int r = sc.nextInt();
        int val = sc.nextInt();
        diff[l] += val;
        if (r + 1 < n) diff[r + 1] -= val;
        int[] res = new int[n];
        res[0] = diff[0];
        for (int i = 1; i < n; i++) res[i] = res[i - 1] + diff[i];
    }
}