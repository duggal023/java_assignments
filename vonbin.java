import java.util.Scanner;

public class vonbin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            dispdec(s);
        }
    }

    public static void dispdec(int n) {
        int mu = 0;
        int ans = 0;
        while (n != 0) {
            ans += n % 10 * Math.pow(2, mu++);
            n /= 10;
        }
        System.out.println(ans);

    }
}