
import java.util.Arrays;
import java.util.Scanner;

public class nextg {

    public static int nod(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int artoin(int a[]) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b = b * 10 + a[i];
        }
        return b;

    }

    public static int[] intoar(int n) {
        int i[] = new int[nod(n)];
        int k = i.length - 1;
        while (n != 0 && k >= 0) {
            i[k--] = n % 10;
            n /= 10;
        }
        return i;
    }

    public static boolean pos(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1])
                return false;
        }
        return true;
    }

    public static int permu(int n[]) {
        int ck = 0;
        if (!pos(n)) {
            int i = artoin(n);

            int check[] = n;
            for (int k = n.length - 1; k >= 0; k--) {
                for (int j = k - 1; j > 0; j--) {
                    int temp = n[j];
                    n[j] = n[k];
                    n[k] = temp;
                    ck = artoin(n);
                    if (ck > i)
                        return ck;
                    // n=check;
                }
            }

        }

        return ck;

    }

    public static int show(int n) {
        int k[] = intoar(n);
        int nex = permu(k);
        if (nex > n)
            return nex;
        else {
            int nexa[] = intoar(nex);
            Arrays.sort(nexa);
            nex = artoin(nexa);
            return nex;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = show(n);
        System.out.println(ans);
    }

}
