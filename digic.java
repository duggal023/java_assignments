
import java.util.Scanner;

public class digic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int c = 0;

        while (n != 0) {
            if (n % 10 == d)
                c++;
            n /= 10;

        }
        System.out.println(c);

    }
}