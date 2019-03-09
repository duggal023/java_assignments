import java.util.Scanner;

public class araybin
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
            
        }
        int m=sc.nextInt();
        System.out.println(binn(ar,m));
    }

    public static int binn(int ar[],int m) {
        int ll=0;
        int hl=ar.length-1;
      
        while(ll <= hl)
        {
            int mid=(hl + ll)/2;
            if(m==ar[mid])
            return mid;
            else if(m > ar[mid])
            {   
                ll = mid + 1;
            }
            else
            hl= mid - 1;
        }
        return -1;
    }
}