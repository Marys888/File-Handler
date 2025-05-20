package app;

public class Main {
    private final static String BASE_PATH = "files/";
    public static void main(String[] args) {
        String fileName = "contentFile.txt";
        FileHandler fileHandler = new FileHandler();

        String outputWritten = "RESULT: " + fileHandler.writeFile(BASE_PATH + fileName,"something");
        String outputRead = "FILE CONTENT: " + fileHandler.readFile(BASE_PATH + fileName);

        getOutput(outputWritten);
        getOutput(outputRead);
    }


    private static void getOutput(String output) {
        System.out.println(output);
    }
}
