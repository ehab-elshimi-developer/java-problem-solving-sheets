public class Main {

    public static void main(String[] args) {
//        testGeneratedSheet(4);
         runProblem(4, 1);
    }

    public static void testGeneratedSheet(int sheetNumber) {
        for (int i = 1; i <= 6; i++) {
            runProblem(sheetNumber, i);
        }
    }

    public static void runProblem(int sheetNumber, int problemNumber) {
        String className = "sheet" + sheetNumber + ".Sh" + sheetNumber + "Pr" + problemNumber;
        try {
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("run").invoke(instance);
        } catch (Exception e) {
            System.out.println("Failed to run: " + className);
        }
    }
}
