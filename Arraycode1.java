import java.util.Scanner;
public class Arraycode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student count: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        // Input marks from index 0
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the marks of student no: " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("----------------------------");

        // Print marks
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The marks of student no: " + (i + 1) + " is = " + arr[i]);
        }
    }
}
