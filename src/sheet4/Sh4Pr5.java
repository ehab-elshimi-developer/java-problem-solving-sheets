package sheet4;

import java.util.Scanner;

public class Sh4Pr5 {
    public Sh4Pr5() {
        System.out.println("problem 5 from sheet4");
    }

    public void run() {

        int[] numbers = {1, 2, 8, 9};

        System.out.println("Search for: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isFound = false;
        int atIndex = -1;

        for (int i = 0; i<numbers.length; i++){
            if(number==numbers[i]){
                isFound=true;
                atIndex = i;
            }
        }
        System.out.printf(isFound?"Found at index %d":"Not Found", atIndex);
    }
}
