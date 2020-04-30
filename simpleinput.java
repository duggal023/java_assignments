import java.util.Scanner;

public class simpleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String st = "";
        while (a >= 0) {
            int i = sc.nextInt();
            a = a + i;
            st += i + " ";
            if (a < 0)
                break;

        }
        String nu[] = (st.split(" "));
        for (int i = 0; i < nu.length - 1; i++) {
            System.out.println(nu[i]);

        }

    }

}