package sheet4;

public class Sh4Pr4 {
    public Sh4Pr4() {
        System.out.println("problem 4 from sheet4");
    }

    public void run() {
        int[] numbers = {2, 5, 6, 7};
        int evenCounter=0, oddCounter=0;
        for (int number : numbers) if (number%2 == 0)  evenCounter++; else oddCounter++;
        System.out.printf("Even = %d\nOdd = %d", evenCounter, oddCounter);

    }
}
