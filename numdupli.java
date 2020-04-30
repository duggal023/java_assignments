import java.lang.StringBuilder;
import java.util.Scanner;

public class numdupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine().trim());
        
        for (int i = 0; i < s.length() - 1; i++) {
            int n=0;
            int j;
            for ( j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j))
                    break;
                n++;
            }
            if(i!=j)
            {
                if(n>1)
                {
                    s.delete(i+1, j);
                    s.insert(++i,n);
                }
            }
        }
        System.out.println(s);

    }
}