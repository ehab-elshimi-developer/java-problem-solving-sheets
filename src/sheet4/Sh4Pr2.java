package sheet4;

public class Sh4Pr2 {
    public Sh4Pr2() {
        System.out.println("problem 2 from sheet4");
    }

    public void run() {
        int[] numbers = {300000000, 3518650, 909231, 1585, -6};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.printf("Max = %d \nMin = %d", max, min);
    }

}
