import java.util.Scanner;

public class InsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int k = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
        for (int i : arr) System.out.print(i + " ");
    }
}

/*
Time Complexity: O(n^2) in worst and average case, O(n) in best case, when the array is already sorted.
It is highly efficient for nearly sorted arrays, running in O(n) time in such cases.
*/