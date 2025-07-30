import java.util.Scanner;

class ArrayOperations3 {
    String arr[][];
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.println("Enter class count:");
        int cls = sc.nextInt();
        arr = new String[cls][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the student count inside class no: " + (i + 1));
            arr[i] = new String[sc.nextInt()];
        }
        System.out.println("Array created");
        System.out.println("............................");
    }

    void collectdata() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside class: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the name of student no: " + (j + 1));
                arr[i][j] = sc.next();
            }
        }
        System.out.println("Data collected");
        System.out.println("-------------------------");
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside class: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("The name of student no: " + (j + 1) + " is " + arr[i][j]);
            }
        }
        System.out.println("Data displayed");
        System.out.println("-------------------------");
    }
}

public class Jackedarray {
    public static void main(String[] args) {
        ArrayOperations3 a1 = new ArrayOperations3();  
        a1.createArray();
        a1.collectdata();
        a1.display();
    }
}
