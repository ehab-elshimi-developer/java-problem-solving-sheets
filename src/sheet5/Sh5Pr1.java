package sheet5;

public class Sh5Pr1 {
    public Sh5Pr1() {
        System.out.println("problem 1 from sheet5");
    }

    public void run() {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueItems = new int[numbers.length];
        int uniqueCount=0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicated = false;
            for (int j = 0; j < uniqueCount; j++) {
                if(uniqueItems[j] == numbers[i]){
                    isDuplicated = true;
                    break;
                }
            }

            if(!isDuplicated){
                uniqueItems[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueItems[i]);
            if(i!=uniqueCount-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
