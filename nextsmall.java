import java.util.Scanner;
public class nextsmall
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();                
            }
            for(int j=0;j<n;j++)
            {
                int z=j;
                for(;z<n;z++)
                {
                    if(arr[z]>arr[j])
                    {
                        arr[j]=arr[z];
                        break;
                    }
                }
                if(z==n)
                arr[j] = -1;
                else{
                    for(;z<n;z++)
                    {
                        if(arr[j]>arr[z])
                        {
                            arr[j]=arr[z];
                            break;
                        }
                    }
                    if(z==n)
                    arr[j] = -1;
            }
            }
            Disp(arr);
        }
    }
    public static void Disp(int []array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
    }
}