import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Sort array
        Arrays.sort(arr);

        long result = 0;

        // Calculate minimum miles
        for (int i = 0; i < n; i++) {
            result += arr[n - 1 - i] * (1L << i); // 2^i
        }

        // Output
        System.out.println(result);

        sc.close();
    }
}
