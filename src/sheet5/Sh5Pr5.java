package sheet5;

public class Sh5Pr5 {
    public Sh5Pr5() {
        System.out.println("problem 5 from sheet5");
    }

    public void run() {

        int[] A = {1,652 ,878,562, 3};
        int[] B = {4,1489,3626,6595,2695,2226,6295,5989, 5};

        int[] merged = new int[A.length + B.length];

        for (int i=0; i<A.length; i++){
            merged[i]=A[i];
        }
        for (int i=A.length; i<(A.length + B.length); i++){
            merged[i]=B[i - A.length];
        }

        System.out.print("Merged: [");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if(i!=merged.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
