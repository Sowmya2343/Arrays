import java.util.Scanner;

public class Arrayoperations2 {
    String arr[][][];
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.print("Enter the class count: ");
        int cls = sc.nextInt();
        arr = String[cls][][];
        for(int i=0;i<arr.length){

        System.out.print("Enter the count of students inside the class no:" +(i+1));

        arr[i] = new String sc.nextInt();

        System.out.println("Array created");
        System.out.println("-----------------------");
    }

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside class room no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++)
               {
                  for(int k<=0;k<arr.length;k++)
                System.out.print("Enter the name of student no: " + (j + 1) +" is=" +arr[i][j][k]);
             }
                 for(int k<=0;k<arr.length;k++){
                  System.out.print("Enter the school no"+ (k+1));
}                arr[i][j][k]
}

        System.out.println("Data collected");
        System.out.println("-----------------------------");
    }

    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside class room no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("The name of student no :(j + 1)" + " is = " + arr[i][j]);
            }
             for(int k=0;k<arr[k

}


        System.out.println("-----------------------------");
    }

    public static void main(String args[]) {
        Arrayoperations2 ao = new Arrayoperations2();
        ao.createArray();
        ao.collectData();
        ao.displayData();
    }
}
