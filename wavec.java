import java.util.Scanner;
public class wavec
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            arr[i][j]=sc.nextInt();
        }
        dispw(arr);
    }

    public static void dispw(int[][] a)
    {
        for(int i=0;i<a[0].length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<a.length;j++)
                System.out.print(a[j][i]+", ");
            }
            else
            {
                for(int j=a.length-1;j>=0;j--)
                System.out.print(a[j][i]+", ");
            }
        }
        System.out.println("END");
    }
}