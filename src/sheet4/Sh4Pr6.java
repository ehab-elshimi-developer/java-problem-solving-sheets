package sheet4;

public class Sh4Pr6 {
    public Sh4Pr6() {
        System.out.println("problem 6 from sheet4");
    }

    public void run() {
        int[] numbers = {1, 2, 3, 4};
        int[] reversedNumbers = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[(numbers.length - 1) - i] = numbers[i];
        }

        System.out.print("Reversed : [");
        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.printf("%s", (i != reversedNumbers.length-1) ? reversedNumbers[i]+",":reversedNumbers[i]+"]");
        }
    }
}
