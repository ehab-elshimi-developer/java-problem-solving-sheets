package sheet5;

public class Sh5Pr6 {
    public Sh5Pr6() {
        System.out.println("problem 6 from sheet5");
    }

    public void run() {
        int[] numbers = {10, 5, 20, 8};

        int biggest = numbers[0];

        int secondBiggest = Integer.MIN_VALUE;


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                secondBiggest = biggest;
                biggest = numbers[i];
            } else if (numbers[i] > secondBiggest) {
                secondBiggest = numbers[i];
            }
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Second Biggest: " + secondBiggest);

    }
}