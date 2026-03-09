import java.util.Scanner;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int candi = 0, count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (count == 0) candi = arr[i];
            count += (arr[i] == candi) ? 1 : -1;
        }
        System.out.println(candi);
    }
}