package sheet5;

public class Sh5Pr2 {
    public Sh5Pr2() {
        System.out.println("problem 2 from sheet5");
    }

    public void run() {
        int[] numbers = {7, 8, 9};

        // Copying The Array
        int[] theCopy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            theCopy[i]=numbers[i];
        }
        // Result
        for (int i = 0; i < theCopy.length; i++) {
            System.out.println(theCopy[i]);
        }

    }
}
