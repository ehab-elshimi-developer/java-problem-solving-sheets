package sheet6;

import java.util.Scanner;

public class Sh6Pr1 {
    public Sh6Pr1() {
        System.out.println("problem 1 from sheet6");
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int columns = input.nextInt();

        int [][] arr = new int[rows][columns];
        System.out.println("Input: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Row [%d] Column [%d]\n", i, j);
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nOutput: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
