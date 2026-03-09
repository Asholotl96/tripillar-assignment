import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tot = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) sum += sc.nextInt();
        System.out.println(tot - sum);
    }
}