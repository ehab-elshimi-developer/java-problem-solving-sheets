package sheet5;

public class Sh5Pr4 {
    public Sh5Pr4() {
        System.out.println("problem 4 from sheet5");
    }

    public void run() {
        int[] numbers = {8, 5,6 ,8};
        boolean isNotAssended = false;
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i+1]>=numbers[i]) {
                continue;
            }else{
                isNotAssended = true;
                break;
            }
        }
        System.out.printf(isNotAssended?"Not Sorted":"Sorted");
    }
}
