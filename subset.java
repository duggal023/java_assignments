
import java.util.Scanner;

public class subset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int f = sc.nextInt();

        subsetTarget(arr, 0, 0, "", f);
    }

    public static void subsetTarget(int[] arr, int vidx, int sum, String asf, int target) {

        if (vidx == arr.length) {
            if (sum == target) {
                System.out.println(asf);
            }

            return;
        }

        subsetTarget(arr, vidx + 1, sum, asf, target);
        subsetTarget(arr, vidx + 1, sum + arr[vidx], asf + arr[vidx] + " ", target);
    }
}