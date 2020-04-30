import java.util.Scanner;
import java.lang.StringBuilder;

public class stringdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        StringBuilder st = new StringBuilder();
        st.append(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            char cu = s.charAt(i);
            char fo = s.charAt(i + 1);
            st.append((fo - cu) + "" + s.charAt(i + 1));
        }
        System.out.println(st);
    }
}