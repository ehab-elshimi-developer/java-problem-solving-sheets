import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generator {
    public static void main(String[] args) {
        String srcPath = "src/";
        File srcDir = new File(srcPath);

        int lastSheet = 0;
        Pattern pattern = Pattern.compile("sheet(\\d+)");
        File[] files = srcDir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    Matcher matcher = pattern.matcher(file.getName());
                    if (matcher.matches()) {
                        int num = Integer.parseInt(matcher.group(1));
                        if (num > lastSheet) {
                            lastSheet = num;
                        }
                    }
                }
            }
        }

        int sheetNumber = lastSheet + 1;
        String packageName = "sheet" + sheetNumber;
        String dirPath = srcPath + packageName;

        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (int i = 1; i <= 6; i++) {
            String className = "Sh" + sheetNumber + "Pr" + i;
            String content = "package " + packageName + ";\n\n"
                    + "public class " + className + " {\n"
                    + "    public " + className + "() {\n"
                    + "        System.out.println(\"problem " + i + " from " + packageName + "\");\n"
                    + "    }\n\n"
                    + "    public void run() {\n\n"
                    + "    }\n"
                    + "}\n";

            try {
                FileWriter writer = new FileWriter(dirPath + "/" + className + ".java");
                writer.write(content);
                writer.close();
                System.out.println("Created: " + packageName + "." + className);
            } catch (IOException e) {
                System.out.println("Failed to create: " + className);
                e.printStackTrace();
            }
        }

        String mainContent =
                "public class Main {\n\n" +
                        "    public static void main(String[] args) {\n" +
                        "        testGeneratedSheet(" + sheetNumber + ");\n" +
                        "        // runProblem(" + sheetNumber + ", 1);\n" +
                        "    }\n\n" +
                        "    public static void testGeneratedSheet(int sheetNumber) {\n" +
                        "        for (int i = 1; i <= 10; i++) {\n" +
                        "            runProblem(sheetNumber, i);\n" +
                        "        }\n" +
                        "    }\n\n" +
                        "    public static void runProblem(int sheetNumber, int problemNumber) {\n" +
                        "        String className = \"sheet\" + sheetNumber + \".Sh\" + sheetNumber + \"Pr\" + problemNumber;\n" +
                        "        try {\n" +
                        "            Class<?> clazz = Class.forName(className);\n" +
                        "            Object instance = clazz.getDeclaredConstructor().newInstance();\n" +
                        "            clazz.getMethod(\"run\").invoke(instance);\n" +
                        "        } catch (Exception e) {\n" +
                        "            System.out.println(\"Failed to run: \" + className);\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n";

        try {
            FileWriter mainWriter = new FileWriter(srcPath + "Main.java");
            mainWriter.write(mainContent);
            mainWriter.close();
            System.out.println("✅ Main.java updated to run sheet" + sheetNumber);
        } catch (IOException e) {
            System.out.println("❌ Failed to create Main.java");
            e.printStackTrace();
        }

        System.out.println("✅ Package created: " + packageName);
    }
}
