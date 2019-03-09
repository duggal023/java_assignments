import java.util.Scanner;
public class arraylin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long []ar=new long[n];
        for (int i = 0; i < ar.length; i++) 
            ar[i]=sc.nextLong();    
        long m=sc.nextLong();
        System.out.println(lin(ar,m));
    }
    public static int lin(long[] ar,long m)
    {
        for(int j=0;j<ar.length;j++)
            {
                if(m==ar[j])
                    return j;
            }
        return -1;

    }
}