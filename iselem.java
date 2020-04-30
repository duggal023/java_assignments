import java.util.*;

public class iselem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(checkele(a,0,m));

    }
    public static boolean checkele(int[] a,int i,int m)
    {
        if(i==a.length)
        return false;
        else if(a[i]==m)
        return true;
        else
        return checkele(a, i+1, m);
    }
}