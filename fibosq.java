import java.util.Scanner;

public class fibosq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        int k = 0;
        int po = 1;
        int p = 0;
        for (; k < n * (n + 1) / 2; k++) {
            if (p < po) {
                System.out.print(i + "\t");
                p++;
            } else {
                p = 1;
                po++;
                System.out.print("\n" + i + "\t");

            }
            int v = i;
            i = j;
            j += v;

        }

    }
}