package sheet3;

import java.util.Scanner;

public class Sh3Pr3 {
    public Sh3Pr3() {
        System.out.println("problem 3 from sheet3");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;

        for (int i=1; i<=number; i++){
            if(i%2 == 0){
                sum+=i;
            }
        }

        System.out.printf("Sum = %d\n", sum);
    }
}
