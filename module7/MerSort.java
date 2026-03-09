import java.util.Scanner;

public class MerSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sort(arr, 0, n - 1);
        for (int i : arr) System.out.print(i + " ");
    }

    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] A = new int[n1];
        int[] B = new int[n2];
        for (int i = 0; i < n1; i++) A[i] = arr[l + i];
        for (int j = 0; j < n2; j++) B[j] = arr[m + 1 + j];
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) 
            arr[k++] = (A[i] <= B[j]) ? A[i++] : B[j++];
        while (i < n1) arr[k++] = A[i++];
        while (j < n2) arr[k++] = B[j++];
    }
}