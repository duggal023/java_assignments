import java.util.Scanner;

public class boston {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sumof(n);
        int sp = sump(n);
        if (s == sp)
            System.out.println('1');
        else
            System.out.println('0');

    }

    public static boolean isPrime(int n) {
        int i = 1, c = 0;
        while (i * i <= n) {
            if (n % i == 0)
                c++;
            i++;
        }

        if (c <= 2)
            return true;
        else
            return false;
    }

    public static int sumof(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int sump(int n) {
        int sum = 0;
        int i = 2;
        while (n != 1) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    sum += sumof(i);
                    n /= i;
                } else
                    i++;
            } else
                i++;

        }
        return sum;
    }
}

/*
 * case 2 4937775
 * 
 * case
 * 
 */
