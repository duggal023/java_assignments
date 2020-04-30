import java.util.*;

public class MaxSumPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            test--;
            int on = sc.nextInt();
            int tn = sc.nextInt();
            int one[] = new int[on];
            int two[] = new int[tn];
            for (int i = 0; i < on; i++)
                one[i] = sc.nextInt();
            for (int i = 0; i < tn; i++)
                two[i] = sc.nextInt();

            int sum1 = 0;
            int sum2 = 0;

            int i = 0, j = 0;
            int tsum = 0;

            while (i < one.length && j < two.length) {

                if (one[i] < two[j]) {
                    sum1 += one[i];
                    i++;
                } else if (one[i] > two[j]) {
                    sum2 += two[j];
                    j++;
                } else {

                    sum1 += one[i];
                    sum2 += two[j];
                    tsum += Math.max(sum1, sum2);

                    sum1 = 0;
                    sum2 = 0;

                    i++;
                    j++;

                }

            }

            while (i < one.length) {
                sum1 += one[i];
                i++;
            }

            while (j < two.length) {
                sum2 += two[j];
                j++;
            }

            tsum += Math.max(sum1, sum2);

            System.out.println(tsum);

        }
    }

}