// solves both 4th and 5th problems of module 6 as they are similar.
import java.util.Scanner;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int complement = k - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
            }
            map.put(arr[i], i);
        }
    }
}