import java.util.Scanner;

public class delpol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int car[] = new int[n];
        for (int i = 0; i < n; i++)
            car[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (hel(car[i]))
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }

    public static boolean hel(int n) {
        int k = n;
        int e = 0;
        int o = 0;
        while (n != 0) {
            int j = n % 10;
            if (j % 2 == 0)
                e += j;
            else
                o += j;
            n /= 10;
        }
        if (e % 4 == 0 || o % 3 == 0)
            return true;
        else
            return false;

    }
}