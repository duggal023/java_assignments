
import java.util.*;

public class sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int bo[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                bo[i][j] = sc.nextInt();

        }

        sudo(bo, 0, 0);
        display(bo);

    }

    public static boolean sudo(int[][] bo, int row, int col) {
        if (col == bo[0].length) {
            row++;
            col = 0;
        }
        if (row == bo.length) {

            return true;
        }
        if (bo[row][col] != 0)
            return sudo(bo, row, ++col);

        for (int i = 1; i <= 9; i++) {
            if (SafeToSudo(bo, row, col, i)) {
                bo[row][col] = i;
                boolean res = sudo(bo, row, col + 1);
                if (res)
                    return res;

                bo[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean SafeToSudo(int[][] bo, int row, int col, int v) {

        return safecol(bo, col, v) && saferow(bo, row, v) && safecell(bo, row, col, v);

    }

    public static boolean safecol(int[][] bo, int col, int v) {
        for (int row = 0; row < bo.length; row++) {
            if (bo[row][col] == v)
                return false;
        }
        return true;

    }

    public static boolean saferow(int[][] bo, int row, int v) {
        for (int col = 0; col < bo[0].length; col++) {
            if (bo[row][col] == v)
                return false;

        }
        return true;
    }

    public static boolean safecell(int[][] bo, int row, int col, int v) {
        int rs = row - row % 3;
        int cs = col - col % 3;

        for (int r = rs; r < rs + 3; r++) {
            for (int c = cs; c < cs + 3; c++) {
                if (bo[r][c] == v)
                    return false;
            }
        }
        return true;
    }

    public static void display(int[][] bo) {
        for (int i = 0; i < bo.length; i++) {
            for (int j = 0; j < bo[0].length; j++)
                System.out.print(bo[i][j] + " ");
            System.out.println();
        }
    }
}