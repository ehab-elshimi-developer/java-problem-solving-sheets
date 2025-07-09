package sheet6;

public class Sh6Pr4 {
    public Sh6Pr4() {
        System.out.println("problem 4 from sheet6");
    }

    public void run() {
        int [][] matrix = {{1,2},{3,4}};

        System.out.println("Original: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        int [][] transpose = new int[matrix.length][matrix[0].length];


        System.out.println("Transpose: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
