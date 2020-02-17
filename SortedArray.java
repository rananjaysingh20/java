import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {
    public static void main(String args[]) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Array");
        for(int i=0; i<10; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<10; i++) {
            System.out.println(a[i]);
        }
    }
}