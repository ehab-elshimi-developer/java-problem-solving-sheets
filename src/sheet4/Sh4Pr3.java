package sheet4;

public class Sh4Pr3 {
    public Sh4Pr3() {
        System.out.println("problem 3 from sheet4");
    }

    public void run() {
        double[] numbers = {10, 20, 30};

        double sum = 0;
        for (double number : numbers) {
            sum+=number;
        }

        System.out.printf("Average = %.1f", sum/numbers.length);
    }
}
