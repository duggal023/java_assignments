import java.util.ArrayList;
import java.util.Scanner;


public class rainwaterw {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test =sc.nextInt();
        while(test>0)
        {
            test--;
            int n=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<>();
            for(int i=0;i<n;i++)
            ar.add(sc.nextInt());
            System.out.println(trap(ar));
        }
    }
	public static int trap(ArrayList<Integer> A) {
	    int a=0;
    int b=A.size()-1;
    int max=0;
    int leftmax=0;
    int rightmax=0;
    while(a<=b){
        leftmax=Math.max(leftmax,A.get(a));
        rightmax=Math.max(rightmax,A.get(b));
        if(leftmax<rightmax){
            max+=(leftmax-A.get(a));  
            a++;
        }
        else{
            max+=(rightmax-A.get(b));
            b--;
        }
    }
    return max;

	}
}
