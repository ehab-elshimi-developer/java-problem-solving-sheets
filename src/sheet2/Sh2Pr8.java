package sheet2;

import java.util.Scanner;

public class Sh2Pr8 {
    public Sh2Pr8() {
        System.out.println("problem 8 from sheet2");
    }

    public void run() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = "";
        for(int i =1; i<=number; i++){
            if(i % 2 == 0){
                if(i<10){
                    result += "0"+ i + "   ";
                }else{
                    result += ""+ i + "   ";
                }
            }
            if(i %10 == 0){
                System.out.print(result += "\n");
            }
        }

        System.out.printf("Even Numbers (1 - %d) are : \n%s\n", number, result);
    }
}
