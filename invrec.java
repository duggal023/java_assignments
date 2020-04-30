import java.util.Scanner;

public class invrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println(Dispa(ar, 0));
    }

    static void Dispa(int arr[], int number)
{
    if (number != arr.length-1)
        Dispa(arr, number + 1);
    System.out.println(arr[number]+" ");
    }

}