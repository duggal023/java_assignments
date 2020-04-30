import java.util.Scanner;

public class invar
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            
        }
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[a[i]]=i;
        }

        for(int i:ar)
        System.out.print(i+" ");
    }
}