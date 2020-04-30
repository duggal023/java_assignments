import java.util.*;

public class spiralanti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
        }
        disps(arr);
    }

    public static void disps(int[][] a) {
        int minr = 0;
        int maxr = a.length - 1;
        int minc = 0;
        int maxc = a[0].length - 1;
        int z = 0;
        while (z < (a.length) * (a[0].length)) {
            for (int i = minr; i <= maxr && z < (a.length) * (a[0].length); i++) {
                System.out.print(a[i][minc] + ", ");
                z++;
            }
            minc++;
            for (int i = minc; i <= maxc && z < (a.length) * (a[0].length); i++) {
                System.out.print(a[maxr][i] + ", ");
                z++;
            }
            maxr--;
            for (int i = maxr; i >= minr && z < (a.length) * (a[0].length); i--) {
                System.out.print(a[i][maxc] + ", ");
                z++;
            }
            maxc--;
            for (int i = maxc; i >= minc && z < (a.length) * (a[0].length); i--) {
                System.out.print(a[minr][i] + ", ");
                z++;
            }
            minr++;

        }
        System.out.print("END");
    }
}