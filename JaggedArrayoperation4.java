import java.util.Scanner;

class JackedArray3Dimension {
    String arr[][][];
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.println("Enter school count:");
        int sch = sc.nextInt();
        arr = new String[sch][][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the class count in school " + (i + 1) + ":");
            arr[i] = new String[sc.nextInt()][];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside school: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the student count in class " + (j + 1) + ":");
                arr[i][j] = new String[sc.nextInt()];
            }
        }

        System.out.println("Array created");
        System.out.println("------------------------------");
    }

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside school no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Inside class no: " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the name of student no: " + (k + 1));
                    arr[i][j][k] = sc.next();
                }
            }
        }
        System.out.println("Data collected");
        System.out.println("------------------------------");
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside school no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Inside class no: " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("    Student no: " + (k + 1) + " is " + arr[i][j][k]);
                }
            }
        }
        System.out.println("Data displayed");
        System.out.println("------------------------------");
    }
}
public class ThreeDimensionalArray {
    public static void main(String[] args) {
        JackedArray3Dimension j3 = new JackedArray3Dimension();
        j3.createArray();
        j3.collectData();
        j3.display();
    }
}
