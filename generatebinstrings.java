import java.util.*;

public class generatebinstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >= 0) {
            String st = sc.nextLine();

            genbin(st, 0, "");
        }
    }

    public static void genbin(String s, int i, String ans) {
        if (s.length() == ans.length())
            System.out.print(ans + " ");

        else {
            if (s.charAt(i) == '?') {
                genbin(s, i + 1, ans + '0');
                genbin(s, i + 1, ans + '1');
            } else
                genbin(s, i + 1, ans + s.charAt(i));
        }
    }

}