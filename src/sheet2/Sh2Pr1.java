package sheet2;

import java.util.Scanner;

public class Sh2Pr1 {
    public Sh2Pr1() {
        System.out.println("problem 1 from sheet2");
    }

    public void run() {
        double celsius, fahrenheit;
        System.out.println("Enter Celsius: ");
        Scanner input = new Scanner(System.in);
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Fahrenheit: %.1f", fahrenheit);

    }
}
