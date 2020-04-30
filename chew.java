import java.util.Scanner;

public class chew {
    public static int nod(long n) {
        long c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static long artoin(long a[]) {
        long b = 0;
        for (int i = 0; i < a.length; i++) {
            b = b * 10 + a[i];
        }
        return b;

    }

    public static long[] intoar(long n) {
        long i[] = new int[nod(n)];
        int k = i.length - 1;
        while (n != 0 && k >= 0) {
            i[k--] = n % 10;
            n /= 10;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] i = intoar(n);
        for (int j = 0; j < i.length; j++) {
            if (i[j] >= 5)
                i[j] = 9 - i[j];
        }
        long c = artoin(i);
        System.out.println(c);

    }
}