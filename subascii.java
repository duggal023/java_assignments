
import java.util.Scanner;

public class subascii {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // printcount(s, "");
        count = (int) Math.pow(s.length() + 1, 2);
        System.out.println(count);
        printss(s, "");

    }

    public static void printcount(String q, String a) {
        if (q.length() == 0)
            count++;
        else {

            printcount(q.substring(1), a);
            printcount(q.substring(1), a + q.charAt(0));
            printcount(q.substring(1), a + ((int) (q.charAt(0))));
        }
    }

    public static void printss(String q, String a) {
        if (q.length() == 0)
            System.out.print(a + " ");
        else {

            printss(q.substring(1), a);
            printss(q.substring(1), a + q.charAt(0));
            printss(q.substring(1), a + ((int) (q.charAt(0))));
        }
    }

}