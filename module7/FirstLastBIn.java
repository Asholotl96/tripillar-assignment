import java.util.Scanner;

public class FirstLastBIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("First: " + find(arr, k, true));
        System.out.println("Last: " + find(arr, k, false));
    }
    static int find(int[] arr, int k, boolean f) {
        int l = 0;
        int h = arr.length - 1;
        int res = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == k) {
                res = m;
                if (f) h = m - 1;
                else l = m + 1;
            } else if (arr[m] < k) l = m + 1;
            else h = m - 1;
        }
        return res;
    }
}