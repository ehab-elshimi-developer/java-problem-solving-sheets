package sheet2;

import java.util.Scanner;

public class Sh2Pr4 {
    public Sh2Pr4() {
        System.out.println("problem 4 from sheet2");
    }

    public void run() {
        System.out.println("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char character = input.next().charAt(0);
        int code = (int) character;
        System.out.printf("ASCII of '%c' is %d", character, code);
    }
}
