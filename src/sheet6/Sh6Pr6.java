package sheet6;

import java.util.Scanner;

public class Sh6Pr6 {
    Scanner input = new Scanner(System.in);

    public Sh6Pr6() {
        System.out.println("problem 6 from sheet6");
    }

    public void run() {
        System.out.println("A: ");
        int [][] matrixA =  readMatrix();

        System.out.println("B: ");
        int [][] matrixB =  readMatrix();

        //OutPut
        System.out.println("A: ");
        printMatrix(matrixA);

        System.out.println("B: ");
        printMatrix(matrixB);

        System.out.println("A + B:");
        int [][] sum = new int [matrixA.length] [matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        printMatrix(sum);

    }
    public int[][]  readMatrix(){
        System.out.print("Enter Number Of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter Number Of Columns: ");
        int columns = input.nextInt();

        int [][] matrix = new int[rows][columns];

        System.out.println("** enter array values? **");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Row [%d] Column [%d]\n", i, j);
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
