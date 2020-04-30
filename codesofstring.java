import java.util.*;

public class codesofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printstring(s, "");
    }

    public static void printstring(String s, String ans) {
        if (s.length() == 1 || s.length() == 0) {
            System.out.println(ans + getc(s.charAt(0)));
        } else {
            if (s.length() >= 1)
                printstring(s.substring(1), ans + getc(s.charAt(0)));
            if (s.length() >= 2)
                printstring(s.substring(2), ans + getc(Integer.parseInt(s.substring(0, 2))));

        }
    }

    public static char getc(int i) {
        char ch = 'a';
        for (int ii = 1; ii <= i; ch++, ii++) {
            if (ii == i)
                return ch;
        }
        return ' ';

    }
}