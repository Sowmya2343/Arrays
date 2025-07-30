import java.util.Scanner;

public class Arrayoperations2d {
    String arr[][];
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.print("Enter the class count: ");
        int cls = sc.nextInt();

        System.out.print("Enter the student count in each class: ");
        int stu = sc.nextInt();

        arr = new String[cls][stu];

        System.out.println("Array created");
        System.out.println("-----------------------");
    }

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside class room no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the name of student no: " + (j + 1) + ": ");
                arr[i][j] = sc.next();
            }
        }
        System.out.println("Data collected");
        System.out.println("-----------------------------");
    }

    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside class room no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("The name of student no " + (j + 1) + " is = " + arr[i][j]);
            }
        }
        System.out.println("-----------------------------");
    }

    public static void main(String args[]) {
        Arrayoperations2d ao = new Arrayoperations2d();
        ao.createArray();
        ao.collectData();
        ao.displayData();
    }
}
