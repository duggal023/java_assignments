import java.util.Scanner;
public class trarget
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i =0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i]+ar[j]==t)
                System.out.println(ar[i]+" and "+ar[j]);
            }
        }
        
    }
}