import java.util.Scanner;


public class circularsum {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            test--;
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }

            int[] narr = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                narr[i] = arr[i];
                narr[i + arr.length] = arr[i];
            }

            int maxSum = 0;

            for (int i = 0; i < arr.length; i++) {

                int sum = 0;
                for (int j = i; j <= i + arr.length - 1; j++) {

                    sum += narr[j];

                    if (sum > maxSum) {
                        maxSum = sum;
                    }

                }

            }

            System.out.println(maxSum);
        }
	}

}