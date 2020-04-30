import java.util.*;

public class cbnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int number = scn.nextInt();

        if (number == 0 || number == 1)
            System.out.println(0);
        else {
            String num = number + "";
            num = num.substring(0, n);
            int ans = checkcb(num);
            System.out.println(ans);

        }

    }

    public static boolean isPrime(int n) {
        int i = 1, c = 0;
        while (i <= n) {
            if (n % i == 0)
                c++;
            i++;
        }

        if (c <= 2)
            return true;
        else
            return false;

    }

    public static boolean isCB(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i)) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;

    }

    public static int checkcb(String n) {
        int ans = 0;
        for (int i = n.length(); i >= 0; i--) {
            for (int j = i - 1; j < i && j >= 0; j--) {
                int ch = Integer.parseInt(n.substring(j, i));
                if (isCB(ch)) {
                    ans++;

                    i = j;
                    break;
                }
            }
        }
        return ans;
    }
}