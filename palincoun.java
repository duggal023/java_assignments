import java.util.Scanner;

public class palincoun {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        System.out.println(palinsub(s));
    }
    public static int palinsub(String s)
    {
        int n=0;
        for (int i = 0; i <= s.length()-1; i++) {
            for (int j = i+1; j <= s.length(); j++)
            {
                if(isPalindrome(s.substring(i, j)))
                {
                    n++;
                }
            }
        }
        return n;
    }
    public static boolean isPalindrome(String s) {
        String s1 = "";
        // for (int i = s.length() - 1; i >= 0; i--)
        //     s1 += s.charAt(i);
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        }
        return true;
        // if (s1.equals(s))
        //     return true;
        // else
        //     return false;

    }
}