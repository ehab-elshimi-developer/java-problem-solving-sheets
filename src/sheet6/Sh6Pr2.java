package sheet6;

import java.util.Scanner;

public class Sh6Pr2 {
    public Sh6Pr2() {
        System.out.println("problem 2 from sheet6");
    }

    public void run() {

        // 2D Matrix
        int [][] matrix = {{1,2},{3,4}};
        int sum = 0;
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.printf("Sum = %d", sum);

    }
}
