package sheet6;

public class Sh6Pr5 {
    public Sh6Pr5() {
        System.out.println("problem 5 from sheet6");
    }

    public void run() {
        int [][] matrix = {{1,2,3},{2,5,6},{3,6,9}};
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        // Transpose The Matrix
        int [][] transpose = transpose(matrix);

        // Check If The Matrix and Transposed Matrix Are Symmetric Or Not ?
        boolean isSymmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != transpose[i][j]){
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric){
            System.out.println("T → Symmetric");
        }else{
            System.out.println("F → Not Symmetric");

        }


    }
    public int[][] transpose(int[][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
