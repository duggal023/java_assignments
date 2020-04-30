import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int te = sc.nextInt();
        int ar[][] = new int[te][2];
        for (int i = 0; i < te; i++) {
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();

        }
        for (int i = 0; i < te; i++) {
            winner(ar[i][0], ar[i][1]);
        }
    }

    public static void winner(int M, int N) {
        int c = 1;
        int f = 1;
        while (M > 0 && N > 0) {
            if (f++ % 2 != 0)
                M = M - c++;
            else
                N -= c++;
        }
        if (N <= 0 && M >= 0)
            System.out.println("Aayush");
        else
            System.out.println("Harshit");
    }
}