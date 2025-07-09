package sheet4;

import java.util.Scanner;

public class Sh4Pr1 {
    public Sh4Pr1() {
        System.out.println("problem 1 from sheet4");
    }

    public void run() {
        System.out.println("Enter array size: ");
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();

        int [] numbers = new int[arrSize];
        for(int i =0 ; i<arrSize; i++){
            System.out.printf("Enter The (%d) element : ", i+1);
            numbers[i] = input.nextInt();
        }
        System.out.print("Elements: ");
        for(int number : numbers){
            System.out.printf("%d " , number);
        }
    }
}
