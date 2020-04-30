import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class importancetime {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        Queue<Integer> co = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            co.add(scn.nextInt());
        }

        int[] io = new int[n];
        for (int i = 0; i < n; i++) {
            io[i] = scn.nextInt();
        }

        int ans = 0;
        int idx = 0;

        while (idx < io.length) {

            int val = co.remove();

            if (io[idx] == val) {
                idx++;
            } else {
                co.add(val);
            }

            ans++;

        }

        System.out.println(ans);

    }
}