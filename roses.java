import java.util.Scanner;

public class roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (; t > 0; t--) {
            int n = sc.nextInt();
            int rp[] = new int[n];
            for (int i = 0; i < n; i++)
                rp[i] = sc.nextInt();
            int m = sc.nextInt();
            int a = 0;
            int b = 1000000000;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((rp[i] + rp[j]) == m) {
                        if ((rp[i] - rp[j]) < (a - b) || (rp[j] - rp[i]) < (a - b) || (rp[i] - rp[j]) < (b - a)
                                || (rp[j] - rp[i]) < (b - a)) {
                            a = rp[i];
                            b = rp[j];
                        }

                    }
                }
            }
            System.out.println("Deepak should buy roses whose prices are " + (int) (Math.min(a, b)) + " and "
                    + (int) (Math.max(a, b)));
            System.out.println();
        }
    }
}