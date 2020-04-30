import java.util.Scanner;

public class rhomnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();

		int nsp = n - 1;
		int nst = 1;

		for (int row = 1; row <= 2 * n - 1; row++) {

			int val;

			if (row <= n)
				val = row;
			else
				val = 2 * n - row;

			
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val+"\t");

				if (cst <= nst / 2)
					val++;
				else
					val--;
			}

			if (row <= n - 1) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
			System.out.println();

		}

	}

}