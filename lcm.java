import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = Math.max(n1, n2);

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
    }
}