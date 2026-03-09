import java.util.Scanner;

public class RotSortArrBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int l = 0;
        int h = n - 1;
        int res = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == k) {
                res = m;
                break;
            }
            if (arr[l] <= arr[m]) {
                if (k >= arr[l] && k < arr[m]) h = m - 1;
                else l = m + 1;
            } else {
                if (k > arr[m] && k <= arr[h]) l = m + 1;
                else h = m - 1;
            }
        }
        System.out.println("Index: " + res);
    }
}