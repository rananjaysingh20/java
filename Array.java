import java.util.Scanner;


public class Array {
    public static void main(String args[]) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Array");
        for(int i=0; i<10; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0; i<10; i++) {
            System.out.println(a[i]+",");
        }
    }
}