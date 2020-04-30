import java.util.Scanner;
public class sub01 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();;
        for(int zz=0;zz<t;zz++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int lop=0;lop<n;lop++)
            arr[lop]=sc.nextInt();
		

		int si = -1;
		int ei = -1;
		int max = -1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				int num0 = 0;
				int num1 = 0;

				for (int k = i; k <= j; k++) {

					if (arr[k] == 1) {
						num1++;
					} else {
						num0++;
					}
				}

				int length = j - i + 1;
				if (num1 == num0 && length > max) {

					max = length;
					si = i;
					ei = j;

				}

			}

		}
        if(si!=ei)
		System.out.println(si + " " + ei);
        else
        System.out.println("None");
        }

	}

}