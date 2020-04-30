import java.util.*;

public class quad {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (b * b < 4 * a * c)
			System.out.println("Imaginary");
		else {
			int j = (-b + (int) Math.sqrt(b * b - (4 * a * c))) / (2 * a);
			int i = (-b - (int) Math.sqrt(b * b - (4 * a * c))) / (2 * a);
			if (i == j) {
				System.out.println("Real and Equal\n" + i + " " + j);
			} else
				System.out.println("Real and Distinct\n" + i + " " + j);

		}
	}
}
