import java.util.*;

public class firstindex
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(first(a,0,m));

    }
    public static int first(int[] a,int i,int m)
    {
        if(i==a.length)
        return -1;
        else if(a[i]==m)
        return i;
        else 
        return first(a,i+1,m);
    }
}