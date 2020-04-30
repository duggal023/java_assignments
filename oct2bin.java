import java.util.Scanner;

public class oct2bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mu = 0;
        int ans = 0;
        while (n != 0) {
            ans += n % 10 * ((int) Math.pow(8, mu++));
            n /= 10;
        }
        ans = dectobin(ans);

        System.out.println(ans);
    }

    public static int dectobin(int n) {
        int mul = 0;
        int r = 0;
        while (n != 0) {
            r += (n % 2) * Math.pow(10, mul++);
            n /= 2;

        }
        return r;
    }
}