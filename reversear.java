import java.util.Scanner;
public class reversear
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ar[]=new long[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextLong();           
        }
        for(int i=ar.length-1;i>=0;i--)
            System.out.println(ar[i];
    }
}