import java.lang.StringBuilder;
import java.util.Scanner;

public class dupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine().trim());
        for (int i = 0; i < s.length() - 1; i++) {
            int j;
            for ( j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j))
                    break;
            }
            if(i!=j)
            {
            s.delete(i+1, j);
            
            }
        }
        System.out.println(s);

    }
}