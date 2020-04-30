import java.util.Scanner;
public class wave {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] ar = takeinput();
        dispw(ar);

    }
    public static int[][] takeinput()
{
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int [][] arr= new int[rows][cols];
    
    for (int i =0; i <arr.length; i++)
    {
        for (int j = 0; i < arr[i].length; j++) {
            arr[i][j]=sc.nextInt();
            
        }
    }
    
    return arr;
}
 public static void dispw(int[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a.length; j++)
                    System.out.print(a[j][i] + ", ");
                System.out.println();
            } else {
                for (int j = a.length - 1; j >= 0; j--)
                    System.out.print(a[j][i] + ", ");
                System.out.println();
            }
        }
        System.out.println("END");
    }
}