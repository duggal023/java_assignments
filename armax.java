import java.util.Scanner;
public class armax
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] ar=new long[N];
        for(int i = 0;i<N;i++)
            ar[i]=sc.nextLong();
        long max=ar[0];
        for (int i = 1; i < N; i++) {
            if(max<ar[i])
                max=ar[i];
                     
        }
        System.out.println(max);
    }
}