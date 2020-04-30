import java.util.Scanner;

public class mazedia {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // int c = sc.nextInt();
        maze(1, 1, r, r, "");
        System.out.println("\n" + count);
    }

    public static void maze(int sc, int sr, int r, int c, String a) {
        if (sc == c && sr == r) {
            System.out.print(a + " ");
            count++;
        } else if (sc > c || sr > r)
            ;

        else {
            maze(sc, sr + 1, r, c, a + "V");
            maze(sc + 1, sr, r, c, a + "H");
            if (sr == sc)
                maze(sc + 1, sr + 1, r, c, a + "D");
            else if ((c - sc) == sr)
                maze(sc + 1, sr + 1, r, c, a + "D");
        }
    }
}