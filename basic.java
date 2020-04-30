package assignments;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char c = sc.next().charAt(0);
            int i;
            int j;
            int ans = 0;

            if (c == 'X') {
                System.out.println("Invalid operation. Try again.");
                break;
            }
            i = sc.nextInt();
            j = sc.nextInt();
            if (i >= 0 && j >= 0) {
                if (c == '+') {
                    i = sc.nextInt();
                    j = sc.nextInt();
                    ans = i + j;
                } else if (c == '-')
                    ans = i - j;
                else if (c == '*')
                    ans = i * j;
                else if (c == '/')
                    ans = i / j;
            }
            System.out.println(ans);
        }
    }
}