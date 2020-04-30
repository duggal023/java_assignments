import java.util.Scanner;

public class pseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int n = sc.nextInt();
        int c = 1;
        for (int i = 1; c <= nn; i++) {
            int a = 3 * i + 2;
            if (a % n == 0)
                continue;
            else {
                System.out.println(a);
                c++;
            }

        }
    }
}