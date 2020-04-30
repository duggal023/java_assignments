import java.util.Scanner;
import java.lang.StringBuilder;
public class ascii
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine().trim());

        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                s.insert(i, (int)(ch-s.charAt(i-1)));
            }
        }
        System.out.println(s);
    }
}