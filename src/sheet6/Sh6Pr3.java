package sheet6;

public class Sh6Pr3 {
    public Sh6Pr3() {
        System.out.println("problem 3 from sheet6");
    }

    public void run() {
        // 2D Matrix
        int [][] matrix = {{5,9},{3,8}};
        int max = matrix[0][0], min = matrix[0][0];

        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]>max){
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.printf("Max = %d\nMin = %d", max, min);

    }
}
