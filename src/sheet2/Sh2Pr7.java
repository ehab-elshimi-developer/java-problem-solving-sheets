package sheet2;

import java.util.Scanner;

public class Sh2Pr7 {
    public Sh2Pr7() {
        System.out.println("problem 7 from sheet2");
    }

    public void run() {
        System.out.println("Enter Your Degree Value: ");
        Scanner input = new Scanner(System.in);
        int degree = input.nextInt();

        String Grade = "unknown";
        if(degree<=100 && degree>=90){
            Grade = "Excellent";
        }else if(degree<=89 && degree>=75){
            Grade = "Very Good";
        }else if(degree<=74 && degree>=60){
            Grade = "Good";
        }else if(degree<=59 && degree>=50){
            Grade = "Pass";
        }else if(degree<=49 && degree>=0){
            Grade = "Fail";
        }

        if (!Grade.equals("unknown")){
            System.out.printf("Grade: %s", Grade);
        }else {
            System.out.println("we want valid degree number between (0-100).");
        }

    }
}
