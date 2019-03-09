import java.util.Scanner;

public class anytoany {
    public static int anytodec(int num, int base) {
        int mu = 0;
        int ans = 0;
        while (num != 0) {
            ans += num % 10 * ((int) Math.pow(base, mu++));
            num /= 10;
        }
        return (ans);
    }

    public static int dectoany(int n, int base) {
        int mul = 0;
        int r = 0;
        while (n != 0) {
            r += (n % base) * Math.pow(10, mul++);
            n /= base;

        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ob = sc.nextInt();
        int db = sc.nextInt();
        int n = sc.nextInt();
        int dec = anytodec(n, ob);
        int ans = dectoany(dec, db);
        System.out.println(ans);
    }
}