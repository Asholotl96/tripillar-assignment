import java.util.Scanner;

public class BinaryIterRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Iterative Index: " + iterative(arr, k));
        System.out.println("Recursive Index: " + recursive(arr, 0, n - 1, k));
    }

    static int iterative(int[] arr, int k) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == k) return m;
            if (arr[m] < k) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }

    static int recursive(int[] arr, int l, int h, int k) {
        if (l > h) return -1;
        int m = l + (h - l) / 2;
        if (arr[m] == k) return m;
        if (arr[m] < k) return recursive(arr, m + 1, h, k);
        return recursive(arr, l, m - 1, k);
    }
}