import java.util.Scanner;

public class thema {
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

    public static int nod(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = intoar(n);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0)
                ar[i] = 5;

        }
        n = artoin(ar);
        System.out.println(n);

    }
}