
import java.util.*;

public class nextelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ar[i] + ",");
                for (int j = i + 1; j <= n; j++) {
                    if (j == n)
                        System.out.println("-1");
                    else {
                        if (ar[j] > ar[i]) {
                            System.out.println(ar[j]);
                            break;
                        }

                    }

                }
            }
        }
    }
}