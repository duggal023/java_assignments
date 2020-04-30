import java.util.Scanner;

public class tog
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        StringBuilder s=new StringBuilder(sc.nextLine().trim());
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            s.replace(i, i+1, Character.toUpperCase(s.charAt(i))+"");
            else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
            s.replace(i, i+1, Character.toLowerCase(s.charAt(i))+"");
        }
        System.out.println(s);
        
    }
}