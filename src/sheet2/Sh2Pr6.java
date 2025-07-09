package sheet2;

import java.util.Scanner;

public class Sh2Pr6 {
    public Sh2Pr6() {
        System.out.println("problem 6 from sheet2");
    }

    public void run() {
        // Add logic here
        int n1, n2, n3;
        System.out.println("Enter 3 Numbers ? : ");
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        int max = n1;

        if(max>n2){
            if(max>n3){
                max = n1;
            }else{
                max = n3;
            }
        } else {
            if(n2>n3){
                max = n2;
            }else {
                max = n3;
            }
        }
        System.out.printf("Max is: %d\n", max);

    }
}
