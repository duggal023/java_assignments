import java.util.Scanner;
public class fillup
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(;t>0;t--)
        {
            int n=sc.nextInt();
            int [] ar=new int[n];
            for(int i = 0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            int max=ar[0];
            int k=0;
            for(int i=0;i<n;i++)
            {
                if(ar[i]>max)
                {
                    max=ar[i];
                    k=i;
                }
            }
            int min=0;
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(ar[i]<max)
                {
                    min=ar[i];
                    j=i;
                    break;
                }
            }
            for(int i =0;i<n;i++)
            {
                if(ar[i]<max)
                {
                    if(ar[i]>min)
                    min=ar[i];
                }
            }
            int sum=0;
            if(k>j)
            {
                for(int i=j;i<k;i++)
                {
                    sum+=(min-ar[i]);
                }

            }
            else if(k<j)
            {
                for(int i=k;i<j;i++)
                {
                    sum+=(min-ar[i]);
                }

            }
            else
            sum=0;
            System.out.println(sum);
        }
    }
}