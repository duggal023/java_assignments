import java.util.Arrays;
import java.util.Scanner;

public class artrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        

        Arrays.sort(arr);

        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                if (arr[j] + arr[k] < target - arr[i]) {
                    j++;
                } 
                else if (arr[j] + arr[k] > target - arr[i]) {
                    k--;
                }
                else {
                    System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    j++;
                    k--;
                }
            }
        }

    }

}