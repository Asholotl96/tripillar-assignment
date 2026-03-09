import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class LongSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxl = 0;
        int st = -1, end = -1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxl = i + 1;
                st = 0;
                end = i;
            }
            if (map.containsKey(sum - k)) {
                int currentLen = i - map.get(sum - k);
                if (currentLen > maxl) {
                    maxl = currentLen;
                    st = map.get(sum - k) + 1;
                    end = i;
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println("Length: " + maxl);
        if (st != -1) {
            int[] result = Arrays.copyOfRange(arr, st, end + 1);
            System.out.println("Subarray: " + Arrays.toString(result));
        }
    }
}