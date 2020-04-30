import java.util.*;
import java.util.Arrays;

public class dictsmall {
    static ArrayList<String> gst = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printPerm(s, "");

        for (int i = 0; i < gst.size(); i++) {
            for (int j = 0; j < gst.size() - i - 1; j++) {
                if ((gst.get(j).compareTo(gst.get(j + 1))) > 0) {
                    String temp = gst.get(j);
                    gst.set(j, gst.get(j + 1));
                    gst.set(j + 1, temp);
                }
            }
        }
        int i = 0;
        gst.add("");
        for (i = 0; i < gst.size(); i++) {
            System.out.println(gst.get(i));
            if (s.equals(gst.get(i + 1)))
                break;
        }

    }

    public static void printPerm(String q, String a) {

        if (q.length() == 0) {
            gst.add(a);

        } else {
            char ch = q.charAt(q.length() - 1);
            for (int i = 0; i <= a.length(); i++) {
                printPerm(q.substring(0, q.length() - 1), a.substring(0, i) + ch + a.substring(i));
            }
        }

    }
}