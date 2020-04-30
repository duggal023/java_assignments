import java.util.Scanner;

public class repla {
    public static long nod(long n) {
        long c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long c = nod(n);
        long k = n;
        if (n == 0)
            k = 5;
        else {
            for (long i = 0; i < c; i++) {
                if (n % 10 == 0)
                    k += 5 * (long) (Math.pow(10, i));
                n /= 10;
            }
        }
        System.out.println(k);
    }

}