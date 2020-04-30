import java.util.Scanner;

public class eosum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int esum = 0;
        int osum = 0;
        int c = 1;
        while (n != 0) {
            if (c++ % 2 == 0)
                esum += (n % 10);
            else
                osum += (n % 10);
            n /= 10;
        }

        if (osum != 0)
            System.out.println(osum);
        if (esum != 0)
            System.out.println(esum);
    }

}