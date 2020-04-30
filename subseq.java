import java.util.Scanner;

public class subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printss(s, "");

    }

    public static void printss(String q, String a) {
        if (q.length() == 0)
            System.out.print(a + " ");
        else {

            printss(q.substring(1), a);
            printss(q.substring(1), a + q.charAt(0));
        }
    }

}