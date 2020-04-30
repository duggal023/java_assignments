import java.util.Scanner;

public class alexshop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = scn.nextInt();
		}

		int q = scn.nextInt();
		for (int j = 0; j < q; j++) {

			int amt = scn.nextInt();
			int k = scn.nextInt();
			int cnt = 0;
			for (int i = 0; i < p.length; i++) {

				if (amt % p[i] == 0) {
					cnt++;
				}

			}

			if (cnt >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}