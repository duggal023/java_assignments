import java.util.Scanner;

public class pascal {

    public static void printPascal(int n) {

        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++)
                System.out.print(binomialCoeff(line, i) + " ");

            System.out.println();
        }
    }

    public static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPascal(n);
    }
}