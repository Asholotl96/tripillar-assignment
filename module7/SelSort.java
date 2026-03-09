import java.util.Scanner;

public class SelectionSortApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) System.out.print(i + " ");
    }
}

/*
Time Complexity: O(n^2) in all cases.
Unlike bubble sort, selection sort always performs O(n^2) comparisons regardless of initial order of elements in the array. 
*/
