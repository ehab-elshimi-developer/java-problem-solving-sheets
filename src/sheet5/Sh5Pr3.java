package sheet5;

import java.util.Scanner;

public class Sh5Pr3 {
    public Sh5Pr3() {
        System.out.println("problem 3 from sheet5");
    }

    public void run() {
        int[] numbers = {3, 1, 3, 5, 3};

        System.out.println("Search for: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isFound = false;
        int countOccurance = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==number) {
                isFound = true;
                countOccurance++;
            }
        }
        if(isFound)
            System.out.printf("%d founded and occurs %d times", number, countOccurance);
        else
            System.out.printf("%d is not found in array", number);

    }
}
